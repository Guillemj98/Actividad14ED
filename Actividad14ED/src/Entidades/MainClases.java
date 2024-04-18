package Entidades;

public class MainClases {

	public static void main(String[] args) {

		/*
		 * **************** TESTING ****************
		 * 
		 * - [SOLDADO]
		 * 
		 * 1. puedeDisparar()
		 * 
		 * Prueba 1:
		 * 
		 * setNumeroBalas(5) -> resultadoEsperado = true
		 * 
		 * Prueba 2:
		 * 
		 * setNumeroBalas(5) -> resultadoEsperado = false
		 * 
		 * ----------------------------------------
		 * 
		 * 2. disparar()
		 * 
		 * Prueba 1:
		 * 
		 * El número obtenido de getNumeroBalas() será menor después de invocar el
		 * método. Además, sol.estaMuerto tiene que pasar de false a true
		 * 
		 * municionInicial = 5
		 * this.setNumeroBalas(municionInicial)
		 * ejecutar soldado.disparar(soldado2)
		 * 
		 * resultadoEsperado ->
		 * this.getNumeroBalas() = municionInicial - 1
		 * &
		 * soldado2.isEstaMuerto = true
		 *
		 */

		/* --------------------------------- */
		
		Soldado s1 = new Soldado();
		s1.setNumeroBalas(5);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		if (resultadoObtenido == resultadoEsperado) {
			System.out.println("puedeDisparar() Prueba 1 -> OK");
		} else {
			System.out.println("puedeDisparar() Prueba 1 -> KO");
		}

		Soldado s2 = new Soldado();
		s2.setNumeroBalas(0);
		resultadoEsperado = false;
		resultadoObtenido = s2.puedeDisparar();
		
		if (resultadoObtenido == resultadoEsperado) {
			System.out.println("puedeDisparar() Prueba 2 -> OK");
		} else {
			System.out.println("puedeDisparar() Prueba 2 -> KO");
		}
		
		/* --------------------------------- */
		
		Soldado s3 = new Soldado();
		Soldado s4 = new Soldado();
		int municionInicial = 5;
		s3.setNumeroBalas(municionInicial);
		s3.disparar(s4);
		
		if (s4.isEstaMuerto() && s3.getNumeroBalas() == municionInicial - 1) {
			System.out.println("disparar() Prueba 1 -> OK");
		} else {
			System.out.println("disparar() Prueba 1 -> KO");
		}
		

	}

}
