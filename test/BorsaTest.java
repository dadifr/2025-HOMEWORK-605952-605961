package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BorsaTest {

	Borsa b = new Borsa();
	Attrezzo torcia;
	Attrezzo ascia;
	
	@Before
	public void setUp() {
		falce = new Attrezzo("torcia", 2);
		sega = new Attrezzo("ascia", 10);
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
