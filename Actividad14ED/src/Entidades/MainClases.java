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
		 * - Prueba 1:
		 * 
		 * setNumeroBalas(5) -> resultadoEsperado = true
		 * 
		 * - Prueba 2:
		 * 
		 * setNumeroBalas(5) -> resultadoEsperado = false
		 * 
		 */

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

		/*
		 * **************** TESTING ****************
		 * 
		 * - [SOLDADO]
		 * 
		 * 2. disparar()
		 * 
		 * - Prueba 1:
		 * 
		 * El número obtenido de getNumeroBalas() será menor después de invocar el
		 * método. Además, sol.estaMuerto tiene que pasar de false a true
		 * 
		 * municionInicial = 5 this.setNumeroBalas(municionInicial) ejecutar
		 * soldado.disparar(soldado2)
		 * 
		 * resultadoEsperado -> this.getNumeroBalas() = municionInicial - 1 &
		 * soldado2.isEstaMuerto = true
		 * 
		 */

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

		/*
		 * **************** TESTING ****************
		 * 
		 * [JUGADOR]
		 * 
		 * 1. ponerDorsal()
		 * 
		 * - Prueba 1:
		 * 
		 * dorsal = 10 resultadoEsperado -> this.getDorsal() = 10
		 * 
		 * - Prueba 2:
		 * 
		 * dorsal = -1 resultadoEsperado -> this.getDorsal() = -1
		 * 
		 * - Prueba 3:
		 * 
		 * dorsal = 31 resultadoEsperado -> this.getDorsal() = -1
		 * 
		 */

		Jugador j1 = new Jugador();
		int dorsal = 10;
		j1.ponerDorsal(dorsal);
		int rEsperado = j1.getDorsal();

		if (rEsperado == dorsal) {
			System.out.println("ponerDorsal() Prueba 1 -> OK");
		} else {
			System.out.println("ponerDorsal() Prueba 1 -> KO");
		}

		Jugador j2 = new Jugador();
		dorsal = -1;
		j2.ponerDorsal(dorsal);
		rEsperado = j2.getDorsal();

		if (rEsperado == -1) {
			System.out.println("ponerDorsal() Prueba 2 -> OK");
		} else {
			System.out.println("ponerDorsal() Prueba 2 -> KO");
		}

		Jugador j3 = new Jugador();
		dorsal = 31;
		j3.ponerDorsal(dorsal);
		rEsperado = j3.getDorsal();

		if (rEsperado == -1) {
			System.out.println("ponerDorsal() Prueba 3 -> OK");
		} else {
			System.out.println("ponerDorsal() Prueba 3 -> KO");
		}

		/*
		 * **************** TESTING ****************
		 * 
		 * [JUGADOR]
		 * 
		 * 2. estaExpulsado()
		 * 
		 * - Prueba 1:
		 * 
		 * numeroTarjetasAmarillas = 2 numeroTarjetasRojas = 0 resultadoEsperado ->
		 * expulsado = true
		 * 
		 * - Prueba 2: numeroTarjetasAmarillas = 0 numeroTarjetasRojas = 1
		 * resultadoEsperado -> expulsado = true
		 * 
		 * - Prueba 3: numeroTarjetasAmarillas = 2 numeroTarjetasRojas = 1
		 * resultadoEsperado -> expulsado = true
		 * 
		 * - Prueba 4: numeroTarjetasAmarillas = 1 numeroTarjetasRojas = 0
		 * resultadoEsperado -> expulsado = false
		 *
		 */

		Jugador j4 = new Jugador();
		int tarjetasAmarillas = 2;
		int tarjetasRojas = 0;
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j4.setNumeroTarjetasRojas(tarjetasRojas);
		boolean resObtenido = j4.estaExpulsado();
		boolean resEsperado = true;

		if (resEsperado == resObtenido) {
			System.out.println("estaExpulsado() Prueba 1 -> OK");
		} else {
			System.out.println("estaExpulsado() Prueba 1 -> KO");
		}

		Jugador j5 = new Jugador();
		tarjetasAmarillas = 0;
		tarjetasRojas = 1;
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j4.setNumeroTarjetasRojas(tarjetasRojas);
		resObtenido = j4.estaExpulsado();
		resEsperado = true;

		if (resEsperado == resObtenido) {
			System.out.println("estaExpulsado() Prueba 2 -> OK");
		} else {
			System.out.println("estaExpulsado() Prueba 2 -> KO");
		}

		Jugador j6 = new Jugador();
		tarjetasAmarillas = 2;
		tarjetasRojas = 1;
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j4.setNumeroTarjetasRojas(tarjetasRojas);
		resObtenido = j4.estaExpulsado();
		resEsperado = true;

		if (resEsperado == resObtenido) {
			System.out.println("estaExpulsado() Prueba 3 -> OK");
		} else {
			System.out.println("estaExpulsado() Prueba 3 -> KO");
		}

		Jugador j7 = new Jugador();
		tarjetasAmarillas = 1;
		tarjetasRojas = 0;
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j4.setNumeroTarjetasRojas(tarjetasRojas);
		resObtenido = j4.estaExpulsado();
		resEsperado = false;

		if (resEsperado == resObtenido) {
			System.out.println("estaExpulsado() Prueba 4 -> OK");
		} else {
			System.out.println("estaExpulsado() Prueba 4 -> KO");
		}

	}

}
