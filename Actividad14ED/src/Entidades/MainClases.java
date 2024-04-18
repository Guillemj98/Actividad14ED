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
		
	}

}
