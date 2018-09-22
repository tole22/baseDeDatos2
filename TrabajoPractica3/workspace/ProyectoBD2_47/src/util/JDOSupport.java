package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.JDOUserException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.versant.core.jdo.VersantPersistenceManagerFactory;

public class JDOSupport {

	private static PersistenceManagerFactory pmf;

	/**
	 * Arranca la interfaz de comunicación con la base de datos.
	 */
	public static void init() {
		Properties p = new Properties();
		InputStream in = null;

		try {
			in = JDOSupport.class.getResourceAsStream("/versant.properties");
			if (in == null) {
				throw new IOException("versant.properties not on classpath");
			}
			p.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new JDOUserException(e.toString(), e);
		}
		pmf = JDOHelper.getPersistenceManagerFactory(p);
	}

	/**
	 * Cierra la conexión con la base de datos.
	 */
	public static void shutdown() {
		if (pmf != null)
			((VersantPersistenceManagerFactory) pmf).shutdown();
	}

	/**
	 * Getter.
	 * 
	 * @return un administrador de persistencia.
	 */
	public static PersistenceManager getPM() {
		return pmf.getPersistenceManager();
	}

	/**
	 * Getter.
	 * 
	 * @return el objeto que se debe utilizar para crear administradores de
	 *         persistencia.
	 */
	public static PersistenceManagerFactory getPersistenceManagerFactory() {
		return pmf;
	}

}
