package Entidades;

public class MainClases {

	public static void main(String[] args) {
		
		// Pruebas unitarias de juagador
		// Prueba método ponerDorsal(int dorsal);
		
		// Prueba 1:
		// int dorsal = 2;
		// int resultadoEsperado = 2;
		Jugador j1 = new Jugador();
		int dorsal = 2;
		int resultadoEsperado = 2;
		j1.ponerDorsal(dorsal);;
		int resultadoObtenido = j1.getDorsal();
		if(resultadoObtenido== resultadoEsperado) {
			System.out.println("Prueba 1 ponerDorsal(): --> OK");
		}else {
			System.out.println("Prueba 1 ponerDorsal(): ---> KO");
		}
		
		// Prueba 2:
		// int dorsal = 31;
		// int resultadoEsperado = -1;
		Jugador j2 = new Jugador();
		dorsal = 31;
		resultadoEsperado = -1;
		j2.ponerDorsal(dorsal);
		resultadoObtenido = j2.getDorsal();
		if(resultadoObtenido == resultadoEsperado) {
			System.out.println("Prueba 2 ponerDorsal(): --> OK");
		}else {
			System.out.println("Prueba 2 ponerDorsal(): --> KO");
		}
		
		
		
		// Prueba método estaExpulsado();
		
		// Prueba 1:
		// int numeroTarjetaAmarillas = 1;
		// int numeroTarjetasRojas = 1;
		// boolean resultadoEsperado = true;
		Jugador j3 = new Jugador();
		int numeroTarjetaAmarillas = 1;
		int numeroTarjetasRojas = 1;
		j3.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j3.setNumeroTarjetasRojas(numeroTarjetasRojas);
		boolean resultadoDevuelto = j3.estaExpulsado();
		boolean resultadoEsperadoJugador = true;
		if(resultadoDevuelto == resultadoEsperadoJugador) {
			System.out.println("Prueba 1 estaExpulsado(): -->OK");
		}else {
			System.out.println("Prueba 1 estaExpulsado(): -->KO");
		}		
		// Prueba 2:
		// int numeroTarjetaAmarillas = 2
		// int numeroTarjetasRojas = 0;
		// boolean resultadoEsperado = true;
		Jugador j4 = new Jugador();
		numeroTarjetaAmarillas = 2;
		numeroTarjetasRojas = 0;
		j4.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j4.setNumeroTarjetasRojas(numeroTarjetasRojas);
		resultadoDevuelto = j4.estaExpulsado();
		resultadoEsperadoJugador = true;
		if(resultadoDevuelto == resultadoEsperadoJugador) {
			System.out.println("Prueba 2 estaExpulsado(): -->OK");
		}else {
			System.out.println("Prueba 2 estaExpulsado(): -->KO");
		}
		
		// Prueba 3:
		// int numeroTarjetaAmarillas = 0
		// int numeroTarjetasRojas = 0;
		// boolean resultadoEsperado = false;
		Jugador j5 = new Jugador();
		numeroTarjetaAmarillas = 0;
		numeroTarjetasRojas = 0;
		j5.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j5.setNumeroTarjetasRojas(numeroTarjetasRojas);
		resultadoDevuelto = j5.estaExpulsado();
		resultadoEsperadoJugador = false;
		if(resultadoDevuelto == resultadoEsperadoJugador) {
			System.out.println("Prueba 3 estaExpulsado(): -->OK");
		}else {
			System.out.println("Prueba 3 estaExpulsado(): -->KO");
		}
		
		
		// Prueba 4:
		// int numeroTarjetaAmarillas = 0
		// int numeroTarjetasRojas = 1;
		// boolean resultadoEsperado = true;
		Jugador j6 = new Jugador();
		numeroTarjetaAmarillas = 0;
		numeroTarjetasRojas = 1;
		j6.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j6.setNumeroTarjetasRojas(numeroTarjetasRojas);
		resultadoDevuelto = j6.estaExpulsado();
		resultadoEsperadoJugador = true;
		if(resultadoDevuelto == resultadoEsperadoJugador) {
			System.out.println("Prueba 4 estaExpulsado(): -->OK");
		}else {
			System.out.println("Prueba 4 estaExpulsado(): -->KO");
		}
		
		// Prueba 5:
		// int numeroTarjetaAmarillas = 1
		// int numeroTarjetasRojas = 0;
		// boolean resultadoEsperado = false;
		Jugador j7 = new Jugador();
		numeroTarjetaAmarillas = 1;
		numeroTarjetasRojas = 0;
		j7.setNumeroTarjetasAmarillas(numeroTarjetaAmarillas);
		j7.setNumeroTarjetasRojas(numeroTarjetasRojas);
		resultadoDevuelto = j7.estaExpulsado();
		resultadoEsperadoJugador = false;
		if(resultadoDevuelto == resultadoEsperadoJugador) {
			System.out.println("Prueba 5 estaExpulsado(): -->OK");
		}else {
			System.out.println("Prueba 5 estaExpulsado(): -->KO");
		}
		
		// Pruebas unitarias de Soldado
		// Prueba unitaria del método puedeDisparar();
		
		// Prueba 1:
		// int numeroBalas = 2;
		// boolean resultadoEsperadoSoldado = true;
		Soldado s1 = new Soldado();
		int numeroBalas =2;
		s1.setNumeroBalas(numeroBalas);
		boolean puedeDisparar = s1.puedeDisparar();
		boolean resultadoEsperadoSoldado = true;
		if(puedeDisparar ==resultadoEsperadoSoldado ) {
			System.out.println("Prueba 1 puedeDispara(): -->OK" );
		}else {
			System.out.println("Prueba 1 puedeDispara(): -->KO" );
		}
		
		
		// Prueba 2:
		// int numeroBalas = 0;
		// boolean resultadoEsperadoSoldado = false;
		Soldado s2 = new Soldado();
		numeroBalas =0;
		s2.setNumeroBalas(numeroBalas);
		puedeDisparar = s2.puedeDisparar();
		resultadoEsperadoSoldado = false;
		if(puedeDisparar ==resultadoEsperadoSoldado ) {
			System.out.println("Prueba 2 puedeDispara(): -->OK" );
		}else {
			System.out.println("Prueba 2 puedeDispara(): -->KO" );
		}
		
		// Pruebas unitarias de Soldado
		// Prueba unitaria del método disparar(soldado sol);
		
		// Prueba 1:
		// int numeroBalas = 2;
		// int resultadoBalas = 1;
		// boolean resultadoEstaMuerto = true;
		Soldado s3 = new Soldado();
		Soldado soldado1 = new Soldado();
		int balas4 = 2;
		int resultadoBalasEsperado = 1;
		boolean resultadoEsperadoSolEstaMuerto = true;	
		s3.setNumeroBalas(balas4);
		soldado1.setEstaMuerto(false);	
		s3.disparar(soldado1);	
		int resultadoBalasObtenido = s3.getNumeroBalas();
		boolean resultadoObtenidoSolEstaMuerto = soldado1.isEstaMuerto();		
		if(resultadoBalasEsperado == resultadoBalasObtenido) {
			if(resultadoEsperadoSolEstaMuerto == resultadoObtenidoSolEstaMuerto) {
				System.out.println("Prueba 1 disparar(): -->OK");
				
			}
			else {
				System.out.println("Prueba 1 disparar(): -->KO");
			}
		}else {
			System.out.println("Prueba 1 disparar(): -->KO");
		}
		
		// Prueba 2:
		// int numeroBalas = 0;
		// int resultadoBalas = -1;
		// boolean resultadoEstaMuerto = true;
		Soldado s4 = new Soldado();
		Soldado soldado2 = new Soldado();
		int balas5 = 2;
		resultadoBalasEsperado = 1;
		resultadoEsperadoSolEstaMuerto = true;	
		s4.setNumeroBalas(balas4);
		soldado1.setEstaMuerto(false);	
		s4.disparar(soldado1);	
		resultadoBalasObtenido = s4.getNumeroBalas();
		resultadoObtenidoSolEstaMuerto = soldado1.isEstaMuerto();		
		if(resultadoBalasEsperado == resultadoBalasObtenido) {
			if(resultadoEsperadoSolEstaMuerto == resultadoObtenidoSolEstaMuerto) {
				System.out.println("Prueba 2 disparar(): -->OK");
				
			}
			else {
				System.out.println("Prueba 2 disparar(): -->KO");
			}
		}else {
			System.out.println("Prueba 2 disparar(): -->KO");
		}
		
	}

}
