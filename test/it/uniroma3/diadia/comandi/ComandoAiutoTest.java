package it.uniroma3.diadia.comandi;

import static org.junit.jupiter.Assert.*;

import org.junit.jupiter.AfterEach;
import org.junit.jupiter.BeforeEach;
import org.junit.jupiter.Test;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.IOSimulator;
import it.uniroma3.diadia.fixture.Fixture;

public class ComandoAiutoTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testPartitaConComandoAiuto() {
		String[] righeDaLeggere = {"aiuto","fine"};
		IOSimulator io = Fixture.creaSimulazionePartitaEGioca(righeDaLeggere);
		assertTrue(io.hasNextMessaggio());
		assertEquals(DiaDia.MESSAGGIO_BENVENUTO, io.nextMessaggio());
		for(int i=0; i < ComandoAiuto.ELENCO_COMANDI.length; i++) {
			assertTrue(io.hasNextMessaggio());
			assertEquals(ComandoAiuto.ELENCO_COMANDI[i]+" ", io.nextMessaggio());
		}
		assertTrue(io.hasNextMessaggio());
		io.nextMessaggio();
		assertEquals(ComandoFine.MESSAGGIO_FINE, io.nextMessaggio());
	}
}
