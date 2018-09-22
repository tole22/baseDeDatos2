package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.jdo.JDOHelper;
import javax.jdo.JDOUserException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public class Utils {
	

public static void main(String[] args) {
PersistenceManagerFactory pmf;
Properties p = new Properties();
InputStream in = null;
//Se lee el archivo versant properties el cual contiene la url de conexion
try {
in = Utils.class.getResourceAsStream("/versant.properties");
if (in == null) {
throw new IOException("versant.properties not on classpath");
}
p.load(in);
in.close();
//Se obtiene el persistence manager
pmf = JDOHelper.getPersistenceManagerFactory(p);
PersistenceManager pm = pmf.getPersistenceManager();
//Se crea un objeto persona y se le setea el nombre Pepe
Modelo.Person persona = new Modelo.Person();
persona.setNombre("Pepe");
//Se inicia la transacción
pm.currentTransaction().begin();
//Se persiste el objeto
pm.makePersistent(persona);
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
