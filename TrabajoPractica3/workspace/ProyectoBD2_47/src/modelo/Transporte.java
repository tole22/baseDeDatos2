/**
 * Este paquete contiene las clases que representan las entidades del dominio.
 * 
 * Esta aplicacion de muestra fue desarrollada para la materia Bases de datos 2
 * de la Facultad de Informatica, perteneciente a la Universidad Nacional de La
 * Plata.
 */

package modelo;

/**
 * Las instancias de esta clase representan transportes genericos de mudanzas.
 * 
 * @author Catedra de BBDD2 bbdd2_2012@gruposyahoo.com.ar
 * 
 */
public abstract class Transporte {

	/**
	 * peso maximo que tolera el transporte.
	 */
	private int pesoMaximo;

	/**
	 * patente del transporte.
	 */
	private String patente;

	/**
	 * Getter.
	 * 
	 * @return el peso maximo que tolera el transporte.
	 */
	public int getPesoMaximo() {
	  return pesoMaximo;
	}

	/**
	 * Setter.
	 * 
	 * @param pesoMaximo
	 *			es el peso maximo que tolera el transporte.
	 */
	public void setPesoMaximo(int pesoMaximo) {
	  this.pesoMaximo = pesoMaximo;
	}

	/**
	 * Getter.
	 * 
	 * @return la patente del transporte.
	 */
	public String getPatente() {
	  return patente;
	}

	/**
	 * Setter.
	 * 
	 * @param patente
	 *			es la patente del transporte.
	 */
	public void setPatente(String patente) {
	  this.patente = patente;
	}

	/**
	 * Retorna el valor que se cobra por hora de uso del transporte.
	 * 
	 * @return el valor por hora.
	 */
	public abstract int valorPorHora();
	
}