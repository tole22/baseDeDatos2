package query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import modelo.Empleado;
import modelo.Mudanza;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class DBQuery {

	/**
	 * @param args
	 */
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		System.out.println("----------------------- Setting up Hibernate -----------------------");
		Configuration cfg = new Configuration();
		cfg.configure();	
		
		System.out.println("Building sessions.........");
		factory = cfg.buildSessionFactory();
				
		try {
						
			ejecutarConsultaA(factory);			
			
			ejecutarConsultaB(factory);
			
			ejecutarConsultaC(factory);
			
			ejecutarConsultaD(factory);
			
			ejecutarConsultaE(factory);
			
			ejecutarConsultaF(factory);
			
			ejecutarConsultaG(factory);
					
		} catch (Exception e) {
			e.printStackTrace();			
		}		
	}
	
	
	


	private static void ejecutarConsultaA(SessionFactory factory){
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("a) Obtener las mudanzas finalizadas realizadas durante el año 2010 (desde el 1/1/2010 al 31/12/2010 inclusive) y que hayan superado las 4 horas. ");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Query query = session.createQuery("select m from Mudanza as m where m.fecha between :fechaInicio and :fechaFin and m.horas > 4 and m.finalizada = 1");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("fechaInicio", sdf.parse("01/01/2010"));
			query.setParameter("fechaFin", sdf.parse("31/12/2010"));
			List<Mudanza> mudanzas = query.list();
			for (Mudanza m: mudanzas) {
				System.out.println(m.toString());
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}		
		
		
	}
	
	public static void ejecutarConsultaB(SessionFactory factory){
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("b) Obtener el nombre completo de los empleados que hayan manejado un vehículo con patente 'TVA579'.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();		
		Query query = session.createQuery("select e.nombreCompleto from Conductor as c inner join c.empleado as e inner join c.transporte t where t.patente = :patente");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("patente", "TVA579");
			List<String> nombreConductores = query.list();
			for (String nombreConductor: nombreConductores) {
				System.out.println(nombreConductor);
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}			
	}
	
	private static void ejecutarConsultaC(SessionFactory factory) {
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("c) Obtener las horas y el valor de las mudanzas finalizadas en las que haya participado el empleado “Diego Montenegro”.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();			
		Query query = session.createQuery("select m.horas, m.valor from Mudanza as m inner join m.empleados as em inner join em.empleado as e where e.nombreCompleto = :nombre and m.finalizada = 1");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("nombre", "Diego Montenegro");			
			List<Object[]> result = query.list();
			for (Object[] datos : result) {
				System.out.println("Horas: "+datos[0]+"---->Valor: "+datos[1]);
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}	
	}


	private static void ejecutarConsultaD(SessionFactory factory) {
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("d) Obtener las mudanzas pendientes que no tengan ningún conductor asignado.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();			
		Query query = session.createQuery("select m from Mudanza as m where m.finalizada <> 1 and m not in (select m2 from Mudanza as m2 inner join m2.empleados as em where lower(em.nombreRol) = :conductor and m2.finalizada <> 1)");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("conductor", "conductor");			
			List<Mudanza> mudanzas = query.list();
			for (Mudanza mudanza : mudanzas) {
				System.out.println(mudanza.toString());
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}	
	}
	
	private static void ejecutarConsultaE(SessionFactory factory) {
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("e) Listar los conductores que condujeron transportes con peso mayor a 700kg");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();			
		Query query = session.createQuery("select distinct(e) from Conductor as c inner join c.empleado as e inner join c.transporte as t where t.pesoMaximo > :peso");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("peso", 700);			
			List<Empleado> empleados = query.list();
			for (Empleado e : empleados) {
				System.out.println(e.toString());
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}	
	}
	
	private static void ejecutarConsultaF(SessionFactory factory) {
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("f) Listar a los empleados cuya edad sea inferior a la de sus jefes.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();		
		Session session = factory.openSession();			
		Query query = session.createQuery("select e from Empleado as e inner join e.jefe as j where e.fechaNacimiento > j.fechaNacimiento");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
								
			List<Empleado> empleados = query.list();
			for (Empleado e : empleados) {
				System.out.println(e.toString());
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}	
	}
	
	private static void ejecutarConsultaG(SessionFactory factory) {
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("g) Obtener las mudanzas pendientes en las que el conductor sea subordinado de “Guillermo Campos”.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();			
		Query query = session.createQuery("select m from Mudanza as m inner join m.empleados as r inner join r.empleado as e inner join e.jefe as j where lower(r.nombreRol) = :conductor and m.finalizada <> 1 and j.nombreCompleto = :nombre ");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("conductor", "conductor");
			query.setParameter("nombre", "Guillermo Campos");
			List<Mudanza> mudanzas = query.list();
			for (Mudanza mudanza : mudanzas) {
				System.out.println(mudanza.toString());
			}
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos			
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			session.flush();
			tx.commit();
			session.disconnect() ;
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			session.close();
		}	
	}

}

