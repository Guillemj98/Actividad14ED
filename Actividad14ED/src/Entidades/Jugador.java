package Entidades;


/**
 * La <b>clase Jugador</b> será un molde para crear los objetos jugador.
 * <br>
 * En él tendremos los siguientes <b>atributos</b>.
 * <ul>
 * <li>dorsal</li>
 * <li>numeroTarjetasAmarillas</li>
 * <li>numeroTarjetasRojas</li>
 * </ul>
 */
public class Jugador {
	
	
	/**
	 * El atributo dorsal contiene valor que indica el numero
	 * del dorsal del jugador
	 */
	 private int dorsal;
	 
	 
	 /**
	  * El atributo numeroTarjetasAmarillas, contiene el valor
	  * que indica la cantidad de tarjetas amarillas que recibió el jugador
	  */
     private int numeroTarjetasAmarillas;
     
     
     /**
	  * El atributo numeroTarjetasRojas, contiene el valor
	  * que indica la cantidad de tarjetas rojas que recibió el jugador
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
	 * El método ponerDorsal comprueba el valor introducido por parámetro,
	 * si este es un valor del 1 al 30 (ambos incluidos), asigna el valor
	 * introducido al atributo dorsal. En el caso de que se incumpla la
	 * condición, se asignará el valor "-1" al atributo dorsal.
	 * 
	 * @param dorsal valor numérico entero
	 */
	public void ponerDorsal(int dorsal) {

                   if(dorsal >= 1 && dorsal <= 30) {

                                 this.dorsal = dorsal;

                   }else {

                                 this.dorsal = -1;

                   }

     }

    
	/**
	 * El método estaExpulsado devuelve true si el jugador cumple con las
	 * condiciones para ser expulsado y false si no las cumple.
	 * 
	 * @return <b>true</b>, si el atributo numeroTarjetasAmarillas tiene valor
	 * 2 o si el atributo numeroTarjetasRojas tiene valor 1; o devuelve
	 * <b>false</b>, si no se cumplen ninguna de estas condiciones.
	 */
     public boolean estaExpulsado() {

                   boolean expulsado = false;                                                  

                   if(numeroTarjetasAmarillas == 2) {

                                 expulsado = true;

                   }                          

                   if(numeroTarjetasRojas == 1) {

                                 expulsado = true;

                   }                          

                   return expulsado;

     }            
}
