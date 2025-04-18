package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;


public class Labirinto(){
  private Stanza stanzaCorrente;
  private Stanza stanzaVincente;

  public void creaStanze(){

    // crea gli attrezzi
    Attrezzo lanterna = new Attrezzo ("lanterna", 3);
    Attrezzo osso = new Attrezzo ("osso", 1);

    // crea le stanze del lab
    Stanza atrio = new Stanza ("atrio");
    Stanza aulaN11 = new Stanza ("aula N11");
    Stanza aulaN10 = new Stanza ("aula N10");
    Stanza laboratorio = new Stanza ("laboratorio Campus");
    Stanza biblioteca = new Stanza ("biblioteca");

    // collega le stanze
    atrio.impostaStanzaAdiacente( "nord", biblioteca);
    atrio.impostaStanzaAdiacente( "est", aulaN11);
    atrio.impostaStanzaAdiacente("sud", aulaN10);
    atrio.impostaStanzaAdiacente( "ovest", laboratorio);
    aulaN11.impostaStanzaAdiacente("ovest", atrio);
    aulaN11.impostaStanzaAdiacente("est", laboratorio);
    aulaN10.impostaStanzaAdiacente("nord", atrio);
    aulaN10.impostaStanzaAdiacente("est", aulaN11);
    aulaN10.impostaStanzaAdiacente("ovest",laboratorio);
    laboratorio.impostaStanzaAdiacente("est", atrio);
    laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
    biblioteca.impostaStanzaAdiacente("sud", atrio);


    // inserire gli attrezzi nelle stanze
    aulaN10.addAttrezzo(lanterna);
    atrio.addAttrezzo(osso);

    // si comincia nell'atrio

    stanzaCorrente = atrio;
    stanzaVincente = biblioteca;
  }

  public Stanza getStanzaVincente(){
    return stanzaVincente;
  }

  public void setStanzaCorrente(Stanza stanzaCorrente){
  this.stanzaCorrente = stanzaCorrente;
  }
  public Stanza getStanzaCorrente(){
    return this.stanzaCorrente;
  }
}  