package it.uniroma3.diadia.comandi;

import static org.junit.jupiter.Assert.assertFalse;
import static org.junit.jupiter.Assert.assertTrue;

import org.junit.jupiter.AfterEach;
import org.junit.jupiter.BeforeEach;
import org.junit.jupiter.Test;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendiTest {

	private Partita partita;
	private Attrezzo attrezzo;
	private Attrezzo attrezzoPesante;
	private Attrezzo attrezzoNull;
	private Comando comando;
	private IO io;
	
	@BeforeEach
	public void setUp() throws Exception {
		partita = new Partita();
		attrezzo = new Attrezzo("martello", 2);
		attrezzoPesante = new Attrezzo("incudine", 11);
		attrezzoNull = null;
		comando = new ComandoPrendi();
		io = new IOConsole();
		comando.setIo(io);
	}


	@AfterEach
	public void tearDown() throws Exception {
	}
	
	public boolean attrezzoPresente(String s) {
		Attrezzo[] array = partita.getStanzaCorrente().getAttrezzi();
		for(Attrezzo a : array) {
			if(a != null && s.equals(a.getNome()))
					return true;
		}
		return false;
	}
	
	@Test
	public void testAttrezzoPreso() {
		partita.getStanzaCorrente().addAttrezzo(attrezzo);
		comando.setParametro("martello");
		comando.esegui(partita);
		assertFalse(attrezzoPresente("martello"));
	}
	@Test
	public void testAttrezzoNonPresente() {
		comando.setParametro("martello");
		comando.esegui(partita);
		assertFalse(attrezzoPresente("martello"));
	}
	
	@Test
	public void testAttrezzoPesante() {
		partita.getStanzaCorrente().addAttrezzo(attrezzoPesante);
		comando.setParametro("incudine");
		comando.esegui(partita);
		assertTrue(attrezzoPresente("incudine"));
	}
	
}
