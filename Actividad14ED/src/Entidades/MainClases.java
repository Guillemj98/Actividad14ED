package Entidades;

public class MainClases {

	public static void main(String[] args) {
		
		//PRUEBAS MÉTODO puedeDisparar() CLASE Soldado
		//--------------------------------------------
		/*
		 * PRUEBA 1
		 * int balas = 2
		 * boolean resultadoEsperado = true;
		 */
		System.out.println("RESULTADOS METODO puedeDisparar(): ");
		Soldado s1 = new Soldado();
		int balas = 2;
		s1.setNumeroBalas(balas);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA 2
		 * int balas = -2
		 * boolean resultadoEsperado = false;
		 */
		Soldado s2 = new Soldado();
		balas = -2;
		s2.setNumeroBalas(balas);
		resultadoEsperado = false;
		resultadoObtenido = s2.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		/*
		 * PRUEBA 3
		 * int balas = 0
		 * boolean resultadoEsperado = false;
		 */
		Soldado s3 = new Soldado();
		balas = 0;
		s3.setNumeroBalas(balas);
		resultadoEsperado = false;
		resultadoObtenido = s3.puedeDisparar();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		//-------------------------------------------
		
		//PRUEBAS MÉTODO disparar() CLASE Soldado
		//--------------------------------------------
		/*
		 * PRUEBA 1
		 * int balas = 2
		 * int resultadoEsperado1 = 1
		 * boolean resultadoEsperadoEstaMuerto = true;
		 * 
		 */
		System.out.println("RESULTADOS METODO disparar(): ");
		Soldado s4 = new Soldado();
		Soldado objetivo1 = new Soldado();
		balas = 2;
		int resultadoEsperado1 = 1;
		boolean resultadoEsperadoEstaMuerto = true;
		s4.setNumeroBalas(balas);
		objetivo1.setEstaMuerto(false);
		
		s4.disparar(objetivo1);
		int resultadoObtenido1 = s4.getNumeroBalas();
		boolean resultadoObtenidoEstaMuerto = objetivo1.isEstaMuerto();
		
		if(resultadoEsperado1 == resultadoObtenido1 ) {
			if(resultadoEsperadoEstaMuerto == resultadoObtenidoEstaMuerto) {
				System.out.println("OK");
			}else {
				System.out.println("KO");
			}
		}else {
			System.out.println("KO");
		}
		/*
		 * PRUEBA 2
		 * int balas = 0
		 * int resultadoEsperado1 = -1
		 * boolean resultadoEsperadoEstaMuerto = true;
		 * 
		 */
		Soldado s5 = new Soldado();
		Soldado objetivo2 = new Soldado();
		balas = 0;
		resultadoEsperado1 = -1;
		resultadoEsperadoEstaMuerto = true;
		s5.setNumeroBalas(balas);
		objetivo2.setEstaMuerto(false);
		
		s5.disparar(objetivo2);
		int resultadoObtenido2 = s5.getNumeroBalas();
		boolean resultadoObtenidoEstaMuerto2 = objetivo2.isEstaMuerto();
		if(resultadoEsperado1 == resultadoObtenido2 ) {
			if(resultadoEsperadoEstaMuerto == resultadoObtenidoEstaMuerto2) {
				System.out.println("OK");
			}else {
				System.out.println("KO");
			}
		}else {
			System.out.println("KO");
		}
		//-------------------------------------------
		
		//PRUEBAS MÉTODO ponerDorsal() CLASE Jugador
		//--------------------------------------------
		/*
		 * PRUEBA 1
		 * int dorsal = 2
		 * int resultadoEsperado2 = 2
		 */
		System.out.println("RESULTADOS METODO ponerDorsal(): ");
		Jugador j1 = new Jugador();
		int dorsal = 2;
		int resultadoEsperado2 = 2;
		j1.ponerDorsal(dorsal);
		resultadoObtenido2 = j1.getDorsal();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		/*
		 * PRUEBA 2
		 * int dorsal = 32
		 * int resultadoEsperado2 = -1
		 */
		Jugador j2 = new Jugador();
		dorsal = 32;
		resultadoEsperado2 = -1;
		j2.ponerDorsal(dorsal);
		resultadoObtenido2 = j2.getDorsal();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		//-------------------------------------------
		
		//PRUEBAS MÉTODO estaExpulsado() CLASE Jugador
		//--------------------------------------------
		/*
		 * PRUEBA 1
		 * int tarjetasAmarillas = 1
		 * int tarjetasRojas = 0
		 * boolean resultadoEsperado3 = false
		 */
		System.out.println("RESULTADOS METODO estaExpulsado(): ");
		Jugador j3 = new Jugador();
		int tarjetasAmarillas = 1;
		int tarjetasRojas = 0;
		boolean resultadoEsperado3 = false;
		j3.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j3.setNumeroTarjetasRojas(tarjetasRojas);
		boolean resultadoObtenido3 = j3.estaExpulsado();
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		/*
		 * PRUEBA 2
		 * int tarjetasAmarillas = 2
		 * int tarjetasRojas = 0
		 * boolean resultadoEsperado3 = true
		 */
		Jugador j4 = new Jugador();
		tarjetasAmarillas = 2;
		tarjetasRojas = 0;
		resultadoEsperado3 = true;
		j4.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j4.setNumeroTarjetasRojas(tarjetasRojas);
		resultadoObtenido3 = j4.estaExpulsado();
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		/*
		 * PRUEBA 3
		 * int tarjetasAmarillas = 0
		 * int tarjetasRojas = 1
		 * boolean resultadoEsperado3 = true
		 */
		Jugador j5 = new Jugador();
		tarjetasAmarillas = 0;
		tarjetasRojas = 1;
		resultadoEsperado3 = true;
		j5.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j5.setNumeroTarjetasRojas(tarjetasRojas);
		resultadoObtenido3 = j5.estaExpulsado();
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		/*
		 * PRUEBA 4
		 * int tarjetasAmarillas = 0
		 * int tarjetasRojas = 0
		 * boolean resultadoEsperado3 = false
		 */
		Jugador j6 = new Jugador();
		tarjetasAmarillas = 0;
		tarjetasRojas = 0;
		resultadoEsperado3 = false;
		j6.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j6.setNumeroTarjetasRojas(tarjetasRojas);
		resultadoObtenido3 = j6.estaExpulsado();
		if(resultadoEsperado3 == resultadoObtenido3) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		

	}

}
