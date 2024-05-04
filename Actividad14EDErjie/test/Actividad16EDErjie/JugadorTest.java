package Actividad16EDErjie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Entidades.Jugador;

class JugadorTest {
	
	private Jugador j1;
	
	@BeforeEach
	void setUp() throws Exception {
		j1 = new Jugador();
	}

	@AfterEach
	void tearDown() throws Exception {
		j1 = null;
	}

	@Test
	void testPonerDorsal1() {
		
		j1.ponerDorsal(0);
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.ponerDorsal(5);
		resultadoEsperado = 5;
		resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.ponerDorsal(5);
		resultadoEsperado = 5;
		resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testEstaExpulsado() {
		
		j1.setNumeroTarjetasAmarillas(5);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = j1.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		j1.setNumeroTarjetasAmarillas(0);
		
		j1.setNumeroTarjetasAmarillas(1);
		resultadoEsperado = false;
		resultadoObtenido = j1.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		j1.setNumeroTarjetasAmarillas(0);
		
		j1.setNumeroTarjetasRojas(0);
		resultadoEsperado = false;
		resultadoObtenido = j1.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.setNumeroTarjetasRojas(1);
		resultadoEsperado = true;
		resultadoObtenido = j1.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
}
