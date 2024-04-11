package Entidades;


/**
 * Clase Soldado para crear un Objeto Soldado que tiene como atributos:
 * <br>
 * - <b>'estaMuerto'</b> con posible valor 'true' si el Soldado esta vivo
 *  <br> ó 'false' si el Soldado esta muerto.
 *  <br>
 * - <b>'numeroBalas'</b> que tendrá el valor de la cantidad de balas que 
 * puede utilizar el Soldado.
 * <br>
 * El Objeto Soldado tendrá los metodos:
 * <br><b>
 * - puedeDisparar()
 * <br>
 * - isEstaMuerto()
 * <br>
 * - disparar(Soldado sol)
 * </b>
 * @author Piero
 * @version 1.0
 * 
 * 
 */
public class Soldado {
	
	/**
	 * Atributo para definir si el Objeto Soldado esta muerto.
	 * <br>
	 * Si el valor es 'true' el Soldado esta muerto.
	 * <br>
	 * Si el valor es 'false' el Soldado esta vivo.
	 */
	private boolean estaMuerto;

	/**
	 * Atributo que tiene como valor la cantidad de balas
	 * que tiene el Objeto Soldado.
	 */
	private int numeroBalas;

	// Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las
	// pruebas y la documentación. Aquí no se han creado porque no aportan nada

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	

	/**
	 * Metodo que comprueba si el Soldado puede Disparar.
	 * <br>
	 * Devolverá 'true' si el Soldado puede Disparar, 
	 * comprobando si el valor del atributo 'numeroBalas' es mayor a 0.
	 * <br>
	 * Devolverá 'false' si el Soldado no puede Disparar, 
	 * comprobando si el valor del atributo 'numeroBalas' es menor a 0.
	 * 
	 * @return <b>'true'</b> si el Soldado puede Disparar y 
	 * <br>
	 * <b>'false'</b> si el Soldado no puede Disparar.
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	/**
	 * Metodo que devuelve 
	 * @return
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	/**
	 * Metodo que Dispara a un Objeto Soldado pasado por parametro.
	 * <br>
	 * Cuando se invoque el metodo se restará una bala 
	 * al atributo 'numeroBalas' del soldado que invoca el metodo.
	 * El atributo 'estaMuerto' del Soldado pasado por parametro se establecera en 'true'.
	 * 
	 * @param sol Objeto Soldado al que se Disparará.
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}
}
