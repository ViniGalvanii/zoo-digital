package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Peixe;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override public void comer()     { this.comer("lambaris"); }
    @Override public void emitirSom() { IO.println(getNome() + " está borbulhando!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando no rio!"); }
    @Override public void cacar()     { IO.println(getNome() + " está emboscando a presa no fundo do rio."); }
}
