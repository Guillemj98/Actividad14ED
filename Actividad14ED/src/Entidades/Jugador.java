package Entidades;

/**
 * Clase que representa un jugador con tres atributos(dorsal, 
 * numeroTarjetasAmarillas y numeroTarjetasRojas).
 * 
 * @author Carlos Gómez
 */

public class Jugador {
	/**
	 * Dorsal del jugador
	 */
	private int dorsal;
	/**
	 * Numero de tarjetas amarillas que tiene el jugador
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Numero de tarjetas rojas que tiene el jugador
	 */
	private int numeroTarjetasRojas;
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Método que establece el dorsal. El metodo establecera el dorsal pasado 
	 * por parametro cuando este sea mayor o igual a 1 y menor o igual a 30.
	 * Si no cumple la condicion anterior, establecera el valor a -1.
	 * 
	 * @param dorsal Representa el dorsal del jugador
	 * @author Carlos Gómez
	 * @version 1.0
	 */

	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}
	
	/**
	 * Método que devuelve si un jugador esta expulsado o no.
	 * 
	 * @return El método devuleve true si:
	 * <li>El numero de tarjetas amarillas es igual a dos</li>
	 * <li>El numero de tarjetas rojas es igual a uno</li>
	 * 
	 * @author Carlos Gómez
	 * @version 1.0
	 */

	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

	
}
