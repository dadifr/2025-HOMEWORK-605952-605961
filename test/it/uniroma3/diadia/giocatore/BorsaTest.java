package it.uniroma3.diadia.giocatore;
import static org.junit.jupiter.Assert.assertEquals;
import static org.junit.jupiter.Assert.assertFalse;
import static org.junit.jupiter.Assert.assertTrue;

import org.junit.jupiter.BeforeEach;
import org.junit.jupiter.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	Borsa b = new Borsa();
	Attrezzo falce;
	Attrezzo sega;
	
	@BeforeEach
	public void setUp() {
		falce = new Attrezzo("falce", 2);
		sega = new Attrezzo("sega", 16);
	}

	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertTrue(b.addAttrezzo(falce));

	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		assertFalse(b.addAttrezzo(sega));

	}
	
	@Test
	public void testGetPeso() {
		b.addAttrezzo(falce);
		assertEquals(falce, b.getAttrezzo("falce"));

	}
}
