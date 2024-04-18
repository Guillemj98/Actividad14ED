package Entidades;

public class MainClases {

	public static void main(String[] args) {
		
		
		/*
		 * PRUEBA SOLDADO 1 puedeDisparar()
		 * 
		 * int balas = 2
		 * boolean resultadoEsperado = true;
		 * 
		 */
		
		Soldado s1 = new Soldado();
		int balas = 2;
		s1.setNumeroBalas(balas);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido =  s1.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		
		/*
		 * PRUEBA SOLDADO 2 puedeDisparar()
		 * 
		 * int balas = -2
		 * boolean resultadoEsperado = false;
		 * 
		 */
		
		Soldado s2 = new Soldado();
		
		int balas2 = -2;
		boolean resultadoEsperado2 = false;
		s1.setNumeroBalas(balas2);
		boolean resultadoObtenido2 = s2.puedeDisparar();
		
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		
		/*
		 * PRUEBA SOLDADO 3 puedeDisparar()
		 * 
		 * int balas = 0
		 * boolean resultadoEsperado = false;
		 * 
		 */
		
		Soldado s3 = new Soldado();
		
		int balas3 = 0;
		boolean resultadoEsperado3 = false;
		s3.setNumeroBalas(balas3);
		boolean resultadoObtenido3 = s3.puedeDisparar();
		
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA SOLDADO 1 disparar(Soldado sol)
		 * 
		 * int balas = 2;
		 * int resultadoBalasEsperado = 1;
		 * boolean resultadoSolEstaMuerto = true;
		 */
		
		Soldado s4 = new Soldado(); 
		Soldado s4Objetivo = new Soldado();
		
		int balas4 = 2;
		int resultadoBalasEsperado = 1;
		boolean resultadoEsperadoSolEstaMuerto = true;
		
		s4.setNumeroBalas(balas4);
		s4Objetivo.setEstaMuerto(false);
		
		s4.disparar(s4Objetivo);
		
		int resultadoBalasObtenido = s4.getNumeroBalas();
		boolean resultadoObtenidoSolEstaMuerto = s4Objetivo.isEstaMuerto();
		
		if(resultadoBalasEsperado == resultadoBalasObtenido) {
			if(resultadoEsperadoSolEstaMuerto == resultadoObtenidoSolEstaMuerto) {
				System.out.println("OK");
				
			}
			else {
				System.out.println("KO");
			}
		}else {
			System.out.println("KO");
		}
		
		
		/*
		 * PRUEBA SOLDADO 2 disparar(Soldado sol)
		 * 
		 * int balas = -2;
		 * int resultadoBalasEsperado = -3;
		 * boolean resultadoSolEstaMuerto = true;
		 */
		
		Soldado s5 = new Soldado(); 
		Soldado s5Objetivo = new Soldado();
		int balas5 = -2;
		int resultadoBalasEsperado5 = -3;
		boolean resultadoEsperadoSolEstaMuerto5 = true;
		
		s5.setNumeroBalas(balas5);
		s5Objetivo.setEstaMuerto(false);
		
		s5.disparar(s5Objetivo);
		
		int resultadoBalasObtenido5 = s5.getNumeroBalas();
		boolean resultadoObtenidoSolEstaMuerto5 = s5Objetivo.isEstaMuerto();
		
		if(resultadoBalasEsperado5 == resultadoBalasObtenido5) {
			if(resultadoEsperadoSolEstaMuerto5 == resultadoObtenidoSolEstaMuerto5) {
				System.out.println("OK");
				
			}
			else {
				System.out.println("KO");
			}
		}else {
			System.out.println("KO");
		}
		
		/*
		 * 
		 * PRUEBA JUGADOR 1 ponerDorsal()
		 * 
		 * int dorsal1 = 9;
		 * int dorsalEsperado1 = 9;
		 */
		
		Jugador j1 = new Jugador();
		int dorsal1 = 9;
		int dorsalEsperado1 = 9;
		
		j1.ponerDorsal(dorsal1);
		
		int dorsalObtenido1 = j1.getDorsal();
		
		if(dorsalEsperado1 == dorsalObtenido1) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		
		/*
		 * 
		 * PRUEBA JUGADOR 2 ponerDorsal()
		 * 
		 * int dorsal2 = 31;
		 * int dorsalEsperado2 = -1;
		 */
		
		Jugador j2 = new Jugador();
		int dorsal2 = 31;
		int dorsalEsperado2 = -1;
		
		j2.ponerDorsal(dorsal2);
		
		int dorsalObtenido2 = j2.getDorsal();
		
		if(dorsalEsperado2 == dorsalObtenido2) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA JUGADOR 1 estaExpulsado()
		 * 
		 * int tarjetasAmarillas = 2;
		 * 
		 * boolean resultadoEsperado = true;
		 */
		int tarjetasAmarillas3 = 2;
		resultadoEsperado3 = true;
		
		Jugador j3 = new Jugador();
		
		j3.setNumeroTarjetasAmarillas(tarjetasAmarillas3);
		
		resultadoObtenido3 = j3.estaExpulsado();
		
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA JUGADOR 2 estaExpulsado()
		 * 
		 * int tarjetasAmarillas3 = 1;
		 * 
		 * boolean resultadoEsperado3 = false;
		 */
		tarjetasAmarillas3 = 1;
		resultadoEsperado3 = false;
		
		Jugador j4 = new Jugador();
		
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas3);
		
		resultadoObtenido3 = j4.estaExpulsado();
		
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA JUGADOR 2 estaExpulsado()
		 * 
		 * int tarjetasRojas = 1;
		 * 
		 * boolean resultadoEsperado3 = true;
		 */
		int tarjetasRojas = 1;
		resultadoEsperado3 = true;
		
		Jugador j5 = new Jugador();
		
		j5.setNumeroTarjetasRojas(tarjetasRojas);
		
		resultadoObtenido3 = j5.estaExpulsado();
		
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA JUGADOR 2 estaExpulsado()
		 * 
		 * int tarjetasRojas = 0;
		 * 
		 * boolean resultadoEsperado3 = false;
		 */
		
		tarjetasRojas = 0;
		resultadoEsperado3 = false;
		
		Jugador j6 = new Jugador();
		
		j6.setNumeroTarjetasRojas(tarjetasRojas);
		
		resultadoObtenido3 = j6.estaExpulsado();
		
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		
		
		
		
	}

}
