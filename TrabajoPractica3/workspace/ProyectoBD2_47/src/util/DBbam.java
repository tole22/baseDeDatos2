package util;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.JDOUserException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import modelo.Ayudante;
import modelo.Camion;
import modelo.Conductor;
import modelo.Empleado;
import modelo.EmpresaDeMudanzas;
import modelo.Mudanza;
import modelo.RolEmpleado;

public class DBbam {
	public static void main(String[] args) {
		System.out.println("-----START----------");
		try {
			crearMudanza();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----FINISH.--------");
	}



	private static void crearMudanza() throws ParseException{
		
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		
		PersistenceManagerFactory pmf;
		Properties p = new Properties();
		InputStream in = null;
		//Se lee el archivo versant properties el cual contiene la url de conexion
		try {
		in = DBQuery.class.getResourceAsStream("/versant.properties");
		if (in == null) {
		throw new IOException("versant.properties not on classpath");
		}
		p.load(in);
		in.close();
		
		//Se obtiene el persistence manager
		pmf = JDOHelper.getPersistenceManagerFactory(p);
		PersistenceManager pm = pmf.getPersistenceManager();
		
		//Creo los ayudantes y conductor
		Date d1 = dfm.parse("1980-02-09");
		Empleado e1 = new Empleado("Federico Lopez", d1, "25-22502889-5");
		
		Date d2 = dfm.parse("1975-12-04");
		Empleado e2 = new Empleado("Daniel Estevez", d2, "25-22502789-5");
		
		Date d3 = dfm.parse("1970-03-05");
		Empleado e3 = new Empleado("Alberto Sanchez", d3, "77-22502789-5");
		
		Ayudante a1 = new Ayudante(e1);
		Ayudante a2 = new Ayudante(e2);
		
		Camion transporte1 = new Camion();
		transporte1.setPatente("ERS390");
		transporte1.setPesoMaximo(4500);
		
		Conductor c1 = new Conductor(e3, transporte1);
		
		//Se crea un objeto Mudanza
		ArrayList<RolEmpleado> emple1 = new ArrayList<RolEmpleado>();
		
		emple1.add(a1);
		
		emple1.add(a2);
		
		emple1.add(c1);
		
		Date md2 = dfm.parse("2012-08-04");
		Mudanza m1 = new Mudanza(emple1, "51 e 6y7", md2, 6);
		
//Se inicia la transacción
		pm.currentTransaction().begin();
		/*
		//Se persiste el objeto
		pm.makePersistent(m1);
		*/
		pm.makePersistent(m1);
		
		//Se cierra la transacción
		pm.currentTransaction().commit();
		} catch (IOException e) {
		e.printStackTrace();
		throw new JDOUserException(e.toString(), e);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
}
