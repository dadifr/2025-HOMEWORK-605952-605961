package it.uniroma3.diadia.giocatore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.*;
import it.uniroma3.diadia.*;
public class BorsaTest {

	Borsa b = new Borsa();
	Attrezzo torcia;
	Attrezzo ascia;
	
	@Before
	public void setUp() {
		torcia = new Attrezzo("torcia", 2);
		ascia = new Attrezzo("ascia", 10);
	}

	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertTrue(b.addAttrezzo(torcia));

	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		assertFalse(b.addAttrezzo(ascia));

	}
	
	@Test
	public void testGetPeso() {
		b.addAttrezzo(torcia);
		assertEquals(torcia, b.getAttrezzo("torcia"));

	}
}
