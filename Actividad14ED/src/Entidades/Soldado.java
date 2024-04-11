package Entidades;

/**
 * Clase que representa un soldado con dos atributos(estaMuerto
 * y numeroBalas).
 * 
 * @author Carlos Gómez
 */

public class Soldado {
	/**
	 * El soldado puede estar muerto
	 */
	private boolean estaMuerto;
	/**
	 * Número de balas que tiene el soldado 
	 */

	private int numeroBalas;
	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

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
	 * Método que devolvera si un soldado puede disparar o no
	 * 
	 * @return El metodo devolvera true si el numero de bals es mayor
	 * a cero, y false en el caso contrario
	 * 
	 * @author Carlos Gómez
	 * @version 1.0
	 */

	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}
	
	

	/**
	 * Método para disparar con un soldado a otro soldado pasado por parámetro.
	 * El método resta balas al soldado emisor cada vez que se ejecuta.
	 * 
	 * @param sol Soldado objetivo pasado por parámetro
	 * @author Carlos Gómez
	 * @version 1.0
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}
}
