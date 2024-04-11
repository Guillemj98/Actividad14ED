package Entidades;


/**
 * La clase soldado es un molde para crear el objeto Soldado.
 * 
 * En él tendremos los siguientes <b>atributos</b>.
 * <ul>
 * <li>estaMuerto</li>
 * <li>numeroBalas</li>
 * </ul>
 */
public class Soldado {

	
	/**
	 * Contiene el valor booleano si el soldado está muerto (true) o no (false)
	 */
	  private boolean estaMuerto;

	  
	  /**
	   * El atributo numeroBalas contiene un valor que indica la cantidad de
	   * balas que tiene.
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
	 * El método puedeDisparar devuelve <b>true</b> si el atributo numeroBalas
	 * es superior a 0 y <b>false</b> si no cumple la condición.
	 * 
	 * @return <b>true</b> si el atributo numeroBalas es superior a 0 y
	 * <b>false</b> si no cumple la condición.
	 */
	public boolean puedeDisparar() {

                    if(this.numeroBalas > 0) {

                                  return true;

                    }                          

                    return false;

      }

     
	/**
	 * El método resta 1 el valor del atributo numeroBalas de este soldado y
	 * cambia el valor del atributo estaMuerto del objeto Soldado introducido
	 * por parámetro a true.
	 * 
	 * @param <b>sol</b> objeto Soldado
	 */
      public void disparar(Soldado sol) {

                    this.numeroBalas--;

                    sol.estaMuerto = true;

      }
}
