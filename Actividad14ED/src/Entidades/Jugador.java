package Entidades;
/**
 * Esta clase define objetos (jugador) que contienen 3 atributos
 * (dorsal, numeroTarjetasAmarillas y numeroTarjetasRojas)
 * y 2 métodos: 
 * <ul>
 *  <li>Imprime el numero del dorsal del objeto jugador</li>
 *  <li>Devuelve si esta expulsado o no</li>
 *  </ul>
 * @author Guillermito
 * @version 17.0
 * 
 */
public class Jugador {
	/**
	 * Atributo que determina el numero del dorsal del jugador
	 */
	private int dorsal;
	/**
	 * Atributo que indica el numero de tarjetas amarillas
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Atributo que indica el numero de tarjetas rojas
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
	 * Método que establece el <b>dorsal</b> del jugador comprendido entre los valores
	 * <b>1 y 30 (incluidos)</b> y en caso contrario lo establece a (-1)
	 * @param dorsal numero que introducimos por parámetro
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
	/**
	 * Método que devuelve si el jugador esta expulsado o no.
	 * Determina si el jugador esta expulsado, si el número de 
	 * amarillas es igual a 2 o el numero de rojas es igual 1, 
	 * en caso contrario devuelve false
	 * @return devuelve false si el jugador no tiene 2 amarillas o una tarjeta roja,
	 * en caso contrario devuelve true.
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
