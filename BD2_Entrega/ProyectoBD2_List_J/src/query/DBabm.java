package query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import modelo.Ayudante;
import modelo.Camion;
import modelo.Conductor;
import modelo.Empleado;
import modelo.EmpresaDeMudanzas;
import modelo.Mudanza;
import modelo.RolEmpleado;
import modelo.Transporte;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * @author a
 */
public class DBabm {

	
	private static SessionFactory factory;

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("----------------------- Setting up Hibernate -----------------------");
		Configuration cfg = new Configuration();
		cfg.configure();

		System.out.println("Droping schema.........");
		new SchemaExport(cfg).drop(true, true);
		System.out.println("DONE.");

		System.out.println("Generating schema.........");
		new SchemaExport(cfg).create(true, true);
		System.out.println("DONE.");
		
		System.out.println("Building sessions.........");
		factory = cfg.buildSessionFactory();
				
		try {
			
			ejecutarConsultaA(factory);			
		
			ejecutarConsultaB(factory);
			
			ejecutarConsultaC(factory);		
						
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
		System.out.println("Enunciado 3-a)Persistir una mudanza de 6hs para el día 4 de agosto de 2012 con 2 ayudantes:" +
				"Federico Lopez, nacido el 9/2/1980" +
				"Daniel Estevez, nacido el 4/12/1975, y un conductor Alberto Sanchez, nacido el 5/3/1970, considerando un camion patente ers390" +
				"con soporte para 4500 kilos.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			EmpresaDeMudanzas emp = cargarModelo();
			session.save(emp);
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			session.flush();			
			tx.commit();
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
		session.disconnect() ;
	}
	private static EmpresaDeMudanzas cargarModelo() throws HibernateException, ParseException{
		//crear los empleados
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("9/2/1980");
		Empleado ayudante1 = new Empleado("Federico López", d1, "21-87078663-9");
		Date d2 = sdf.parse("4/12/1975");
		Empleado ayudante2 = new Empleado("Daniel Estévez", d2, "90-57078663-9");
		Date d3 = sdf.parse("5/3/1970");
		Empleado conductor = new Empleado("Alberto Sanchez", d3, "11-587078663-9");
		
		//crear al transporte(Camion)
		Camion camion = new Camion();
		camion.setPatente("ERS390");
		camion.setPesoMaximo(4500);
		ArrayList<Transporte> transportes = new ArrayList<Transporte>();
		transportes.add(camion);
		
		//asignar empleados a la empresa
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(ayudante1);
		empleados.add(ayudante2);
		empleados.add(conductor);
		//crear la empresa de mudanzas
		EmpresaDeMudanzas emp = new EmpresaDeMudanzas(transportes, new ArrayList<Mudanza>(),new ArrayList<Mudanza>(),empleados,ayudante1);
		
		//asignar roles a los empleados
		ArrayList<RolEmpleado> emple1 = new ArrayList<RolEmpleado>();
		Ayudante ayu1 = new Ayudante(ayudante1);
		emple1.add(ayu1);
		Ayudante ayu2 = new Ayudante(ayudante2);
		emple1.add(ayu2);		
		Conductor con1 = new Conductor(conductor, camion);
		emple1.add(con1);
		
		//crear la mudanza y asignarla a la empresa
		Date fechaMudanza = sdf.parse("4/8/2012");
		Mudanza mudanza = new Mudanza(emple1, "Calle 58 #1947", fechaMudanza, 6);
		emp.getPendientes().add(mudanza);
		emp.finalizarMudanza(mudanza);
		return emp;
	}
	
	private static void ejecutarConsultaB(SessionFactory factory){
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("3-b) Recuperar la mudanza del inciso a, eliminar al conductor y volver a persistir.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Session session = factory.openSession();
		Query query = session.createQuery("select m from Mudanza as m where m.fecha = :fecha");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("fecha", sdf.parse("04/08/2012"));			
			Mudanza mudanza = (Mudanza) query.uniqueResult();					
			Iterator<RolEmpleado> it = mudanza.getEmpleados().iterator();
			while (it.hasNext()){
				RolEmpleado empleado = it.next();
				String rol = empleado.getNombreRol();				
				if(rol.toLowerCase().equals("conductor")){					
					it.remove();
				}
			}			
			session.save(mudanza);
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			session.flush();
			tx.commit();
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
		session.disconnect() ;
		
	}
	
	private static void ejecutarConsultaC(SessionFactory factory){
		/**
		 * 
		 * @author a
		 */
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("3-c) Eliminar la mudanza del inciso a.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Session session = factory.openSession();
		Query query = session.createQuery("select m from Mudanza as m where m.fecha = :fecha");
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			long start = System.nanoTime(); //Inicio del timer para medir la duraccion de la consulta
			
			query.setParameter("fecha", sdf.parse("04/08/2012"));
			Mudanza mudanza = (Mudanza) query.uniqueResult();			
			session.delete(mudanza);
			
			long elapsedTime = System.nanoTime() - start;   //Calculo de la duraccion en nanosegundos
			System.out.println("Con la implementación List, el tiempo insumido es: " + elapsedTime + " nanosegundos");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			session.flush();
			tx.commit();
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
		session.disconnect() ;			
	}
}
