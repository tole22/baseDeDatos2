package util;

import model.Alumno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Test
{
private static SessionFactory sessionFactory;
private static ServiceRegistry serviceRegistry;

public static void main(String[] args)
{
Session session=null;
try{
try{
//Se instancía la configuración 
Configuration cfg=new Configuration();
//Se configura hibernate tomando el archivo de configuracion
cfg.configure();
//se crea el sessionFactory para poder crear la sesion y asi persisitir
serviceRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
sessionFactory=cfg.buildSessionFactory(serviceRegistry);
}
catch(Throwable ex)
{
System.err.println("Failed to create sessionFactory object."+ ex);
throw new ExceptionInInitializerError(ex);
}
//Se inicia la sesion 
session=sessionFactory.openSession();
//Se crea la clase alumno

Alumno alumno=new Alumno();
alumno.setId(2);
alumno.setNombre("Pepe");
System.out.println("Inserting Record");
//Se inicia la transacción

Transaction tx=session.beginTransaction();

//Se persiste el objeto
session.save(alumno);
//Se cierra la transaccion
tx.commit();
System.out.println("Done");
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
finally
{
//Se cierra la sesion
session.close();
}
}
}