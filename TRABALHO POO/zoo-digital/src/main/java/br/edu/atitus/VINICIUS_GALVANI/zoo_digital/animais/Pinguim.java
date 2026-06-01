package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Ave;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("peixes"); }
    @Override public void emitirSom() { IO.println(getNome() + " está grasnando!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando atrás de peixes!"); }
    @Override public void cacar()     { IO.println(getNome() + " está caçando krill no gelo."); }
}
