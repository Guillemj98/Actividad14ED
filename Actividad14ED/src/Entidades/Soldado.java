package Entidades;
/**
 * Esta clase define objetos (soldado), el cual contiene 2 atributos
 *(estaMuerto y numeroBalas)
 * Tambien tiene 2 métodos :
 * <ul>
 * 	<li> Devuelve si puede disparar o no</li>
 * 	<li> Reduce el numero de balas y establece estaMuerto a false de un soldado 
 * 	pasado por parametro</li>
 * </ul>
 * @author Guillermito
 * @version 17.0
 */
public class Soldado {	
	/**
	 * Atributo de tipo boolean el cual determina si 
	 * el objeto esta vivo o muerto
	 */
	private boolean estaMuerto;
	/**
	 * Atributo que determina el numero de balas
	 * que tiene el objeto soldado.
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
	 * Método que devuelve si el objeto puede disparar o no.
	 * El método devolvera true si el numero de balas es superior a 0
	 * en caso contrario devolvera false
	 * @return Devolvera true si el numero de balas es mayor que 0
	 * y por el contrario devolvera false si es menor o igual a 0.
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;
		}

		return false;
	}
	/**
	 * Método que permite disparar al objeto.
	 * Disminuira el numero de balas y establecerá
	 * el atributo estaMuerto a true del objeto pasado por 
	 * parámetro
	 * @param sol Objeto pasado por parámetro
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;
	}
}
