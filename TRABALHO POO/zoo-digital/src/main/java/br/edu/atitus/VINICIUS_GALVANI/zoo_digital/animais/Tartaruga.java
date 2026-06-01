package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Reptil;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("algas e águas-vivas"); }
    @Override public void emitirSom() { IO.println(getNome() + " está fazendo um som grave e lento!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando calmamente no oceano!"); }
}
