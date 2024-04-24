package Entidades;

public class MainClases {

	public static void main(String[] args) {
		
		/*
		 * ---------ponerDorsal()---------
		 * 
		 * Prueba 1
		 * 		dorsal = 15
		 * 		valor esperado = 15	
		 * 
		 * Prueba 2
		 * 		dorsal = 40
		 * 		valor esperado = -1
		 */
		
		//---------Prueba 1---------
		Jugador j1 = new Jugador();
		int dorsal1 = 15;
		int resultadoEsperado1 = 15;
		j1.ponerDorsal(dorsal1);
		int resultadoObtenido1 = j1.getDorsal();
		if (resultadoEsperado1 == resultadoObtenido1) {
			System.out.println("ponerDorsal() Prueba1 -> Good");
		} else {
			System.out.println("ponerDorsal() Prueba1 -> Bad");
		}
		
		//---------Prueba 2---------
		Jugador j2 = new Jugador();
		int dorsal2 = 40;
		int resultadoEsperado2 = -1;
		j2.ponerDorsal(dorsal2);
		int resultadoObtenido2 = j2.getDorsal();
		if (resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("ponerDorsal() Prueba2 -> Good");
		} else {
			System.out.println("ponerDorsal() Prueba2 -> Bad");
		}
		
		/*
		 * ---------estaExpulsado()---------
		 * 
		 * Prueba 1
		 * 		numero tarjetas amarillas = 0
		 * 		resultado esperado = false
		 * 
		 * Prueba 2
		 * 		numero tarjetas rojas = 1
		 * 		resultado esperado = true
		 */
		//---------Prueba 1---------
		Jugador j3 = new Jugador();
		int numeroTarjetasAmarillas3 = 0;
		boolean resultadoEsperado3 = false;
		j3.setNumeroTarjetasAmarillas(numeroTarjetasAmarillas3);
		boolean resultadoObtenido3 = j3.estaExpulsado();
		if (resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("estaExpulsado() Prueba1 -> Good");
		} else {
			System.out.println("estaExpulsado() Prueba1 -> Bad");
		}
		
		//---------Prueba 2---------
		Jugador j4 = new Jugador();
		int numeroTarjetasRojas4 = 1;
		boolean resultadoEsperado4 = true;
		j4.setNumeroTarjetasRojas(numeroTarjetasRojas4);
		boolean resultadoObtenido4 = j4.estaExpulsado();
		if (resultadoEsperado4 == resultadoObtenido4) {
			System.out.println("estaExpulsado() Prueba2 -> Good");
		} else {
			System.out.println("estaExpulsado() Prueba2 -> Bad");
		}
		
		/*
		 * ---------puedeDisparar()---------
		 * 
		 * Prueba 1
		 * 		numero balas = 10
		 * 		resultado esperado = true
		 * 
		 * Prueba 2
		 * 		numero balas = 0
		 * 		resultado esperado false
		 */
		//---------Prueba 1---------
		Soldado s5 = new Soldado();
		int numeroBalas5 = 10;
		boolean resultadoEsperado5 = true;
		s5.setNumeroBalas(numeroBalas5);
		boolean resultadoObtenido5 = s5.puedeDisparar();
		if (resultadoEsperado5 == resultadoObtenido5) {
			System.out.println("puedeDisparar() Prueba1 -> Good");
		} else {
			System.out.println("puedeDisparar() Prueba1 -> Bad");
		}
		
		Soldado s6 = new Soldado();
		int numeroBalas6 = 10;
		boolean resultadoEsperado6 = true;
		s6.setNumeroBalas(numeroBalas6);
		boolean resultadoObtenido6 = s6.puedeDisparar();
		if (resultadoEsperado6 == resultadoObtenido6) {
			System.out.println("puedeDisparar() Prueba2 -> Good");
		} else {
			System.out.println("puedeDisparar() Prueba2 -> Bad");
		}
		
		/*
		 * ---------disparar()---------
		 * 
		 * Prueba 1
		 * 		numero balas = 10
		 * 		resultado esperado balas = 9
		 * 		esta muerto = false
		 * 		resultado esperado esta muerto = true
		 * 
		 * Prueba 2
		 * 		numero balas = 5
		 * 		resultado esperado balas = 4
		 * 		esta muerto = false
		 * 		resultado esperado esta muerto = true
		 */
		//---------Prueba 1---------
		Soldado s7 = new Soldado();
		Soldado sTest7 = new Soldado();
		int numeroBalas7 = 10;
		int resultadoEsperadoBalas7 = 9;
		s7.setNumeroBalas(numeroBalas7);
		boolean estaMuerto7 = false;
		sTest7.setEstaMuerto(estaMuerto7);
		boolean resultadoEsperadoEstaMuerto7 = true;
		s7.disparar(sTest7);
		int resultadoObtenidoBalas7 = s7.getNumeroBalas();
		boolean resultadoObtenidoEstaMuerto7 = sTest7.isEstaMuerto();
		if (resultadoObtenidoBalas7 == resultadoEsperadoBalas7 &&
				resultadoObtenidoEstaMuerto7 == resultadoEsperadoEstaMuerto7) {
			System.out.println("disparar() Prueba1 -> Good");
		} else {
			System.out.println("disparar() Prueba1 -> Bad");
		}
		
		//---------Prueba 2---------
		Soldado s8 = new Soldado();
		Soldado sTest8 = new Soldado();
		int numeroBalas8 = 5;
		int resultadoEsperadoBalas8 = 4;
		s8.setNumeroBalas(numeroBalas8);
		boolean estaMuerto8 = false;
		sTest8.setEstaMuerto(estaMuerto8);
		boolean resultadoEsperadoEstaMuerto8 = true;
		s8.disparar(sTest8);
		int resultadoObtenidoBalas8 = s8.getNumeroBalas();
		boolean resultadoObtenidoEstaMuerto = sTest8.isEstaMuerto();
		if (resultadoObtenidoBalas8 == resultadoEsperadoBalas8 &&
				resultadoObtenidoEstaMuerto == resultadoEsperadoEstaMuerto8) {
			System.out.println("disparar() Prueba2 -> Good");
		} else {
			System.out.println("disparar() Prueba2 -> Bad");
		}
		
	}

}
