package Entidades;

/**
 * Clase Jugador para crear Objetos Jugador.
 * <br>
 * El Objeto Jugador tendrá como Atributos:
 * - dorsal, numero de dorsal que tiene el Objeto Jugador.
 * - numeroTarjetasAmarillas, cantidad de tarjetas Amarillas que tiene el Objeto Jugador.
 * -numeroTarjetasRojas, cantidad de tarjetas Rojas que tiene el Objeto Jugador.
 * 
 * El Objeto Jugador tendrá como Metodos:
 * - ponerDorsal()
 * - estaExpulsado()
 */
public class Jugador {
	/**
	 * Atributo dorsal, tendrá el valor del numero de dorsal que lleva el jugador.
	 */
	private int dorsal;

	/**
	 * Atributo numeroTarjetaAmarillas, tendrá el valor de la cantidad de tarjetas Amarillas
	 * que tenga el jugador.
	 */
	private int numeroTarjetasAmarillas;

	/**
	 * Atributo numeroTarjetaRojas, tendrá el valor de la cantidad de tarjetas Rojas
	 * que tenga el jugador.
	 */
	private int numeroTarjetasRojas;

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

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
	 * Metodo que asigna el numero pasado por parametro como Dorsal del Objeto Jugador que lo invoca.
	 * Si el numero pasado por parametro es mayor a 0 y menor 31, se asignará al atributo dorsal.
	 *  Si el numero pasado por parametro es menor a 1, se asignará '-1' al atributo dorsal.
	 * @param dorsal Numero pasado por parametro para asignar al dorsal del jugador.
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * Metodo que devuelve si el Objeto Jugador que lo invoca esta expulsado o no.
	 * <br>
	 * Devolvera 'true' si el jugador esta expulsado.
	 * <br>
	 * Para que el Jugador este expulsado el numero de Tarjetas Amarillas 
	 * del jugador deben ser igual a 2, o tener 1 tarjeta Roja.
	 * <br>
	 * Devolverá 'false' si el jugador no esta expulsado.
	 * 
	 * 
	 * @return 'true' si el jugador esta expulsado.
	 * <br> 
	 * 'false' si el jugador no esta expulsado.
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
