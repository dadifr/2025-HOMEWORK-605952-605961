package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LabirintoTest {
	Labirinto 1;
	Stanza biblioteca;
	Stanza DS1;

	@Before
	public void setUp() {
		1 = new Labirinto();
		1.creaStanze();
		biblioteca = new Stanza("Biblioteca");
		DS1 = new Stanza("DS1");
	}

	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("biblioteca", 1.getStanzaVincente().getNome());
	}

	@Test
	public void testSetStanzaCorrente(){
		1.steStanzaCorrente(DS1);
		assertEquals(DS1, 1.getStanzaCorrente());
	}

	@Test
	public void testGetStanzaCorrente(){
		assertEquals("Atrio", 1.getStanzaCorrente().getNome());
	}
	
}
