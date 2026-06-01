package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Mamifero;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Golfinho extends Mamifero implements Nado, Predacao {

    public Golfinho(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("peixes"); }
    @Override public void emitirSom() { IO.println(getNome() + " está assobiando!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando feliz!"); }
    @Override public void cacar()     { IO.println(getNome() + " está caçando peixes em grupo."); }
}
