package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Reptil;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("roedores e ovos"); }
    @Override public void emitirSom() { IO.println(getNome() + " está sibilando!"); }
    @Override public void cacar()     { IO.println(getNome() + " está injetando veneno na presa!"); }
}
