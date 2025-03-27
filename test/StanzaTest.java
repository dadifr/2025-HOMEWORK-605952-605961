package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StanzaTest() {
  Stanza s1 = new Stanza("s1");
  Stanza s2 = new Stanza("s2");
  Attrezzo t = new Attrezzo("torcia", 2);

  @Test
    public void testGetStanzaAdiacente(){
    assertNull(s1.getStanzaAdiacente("nord"));
  }

  @Test
    public void testImpostaStanzaAdiacente(){
    s1.impostaStanzaAdiacente("nord", s2);
    assertEquals(s2, s1.getStanzaAdiacente("nord"));
  }

  @Test
    public void testAttrezzo(){
    assertTrue(s1.addAttrezzo(t));
  }
  
}
