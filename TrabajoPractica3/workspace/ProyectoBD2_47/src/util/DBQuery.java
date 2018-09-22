package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.jdo.JDOHelper;
import javax.jdo.JDOUserException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import modelo.*;


public class DBQuery {
	
	public static void main(String[] args) throws ParseException {
		
		JDOSupport.init();
		PersistenceManager pm =  JDOSupport.getPM();  
		
		pm.currentTransaction().begin();
		
		System.out.println("A) Obtener las mudanzas finalizadas realizadas durante el año 2010 (desde el 1/1/2010 al 31/12/2010 inclusive) y que hayan superado las 4 horas ");
		Query q= pm.newQuery("SELECT FROM modelo.Mudanza");
	    List resultados = (List) q.execute();
	    Iterator pp=resultados.iterator();
	    while(pp.hasNext())
	    {
	    	Mudanza m = (Mudanza) pp.next();
	    	System.out.println(m.toString());
	    	
	    }

	    pm.currentTransaction().commit(); 
	    System.out.println("-----------------------------------------------------" );
	    System.out.println("\n");
		
	    pm.currentTransaction().begin();
		
		System.out.println("B) Obtener el nombre completo de los empleados que hayan manejado un vehículo con patente 'TVA579'. ");
		q= pm.newQuery("SELECT FROM modelo.Conductor WHERE transporte.patente==\"TVA579\"");
	    resultados = (List) q.execute();
	    pp=resultados.iterator();
	    while(pp.hasNext())
	    {
	    	Conductor c = (Conductor) pp.next();
	    	System.out.println(c.getNombreCompleto());
	    	
	    }

	    pm.currentTransaction().commit(); 
	    System.out.println("-----------------------------------------------------" );
	    System.out.println("\n");
	   
	    pm.currentTransaction().begin();
		
		System.out.println("C)  Obtener las horas y el valor de las mudanzas finalizadas en las que haya participado el empleado “Diego Montenegro”. ");
		q= pm.newQuery("SELECT FROM modelo.EmpresaDeMudanzas.realizadas WHERE realizadas.contains(unaMudanza) && unaMudanza.cantains(unEmpleado) && unEmpleado.empleado.nombre==\"Diego Montenegro\"");
	    resultados = (List) q.execute();
	    pp=resultados.iterator();
	    while(pp.hasNext())
	    {
	    	Mudanza m = (Mudanza) pp.next();
	    	System.out.println(m.toString());
	    	
	    }

	    pm.currentTransaction().commit(); 
	    System.out.println("-----------------------------------------------------" );
	    System.out.println("\n");

	    

	    JDOSupport.shutdown();
	    

	    
	    
	    
	    
		}
}
