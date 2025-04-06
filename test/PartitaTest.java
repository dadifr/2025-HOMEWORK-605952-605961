package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.giocatore.*;

public class PartitaTest() {
  Partita p = new Partita();
  Stanza s = new Stanza("Stanza");

  @Test
    public void testGetStanzaVincente(){
    assertEquals("Biblioteca", p.getLabirinto().getStanzaVincente().getNome());
}

  @Test
    public void testStanzaCorrente(){
    p.getLabirinto().setStanzaCorrente(s);
    assertEquals(s, p.getLabirinto().getStanzaCorrente());
  }

  @Test
    public void testIsFinita(){
    assertFalse(p.isFinita());
  }
}
