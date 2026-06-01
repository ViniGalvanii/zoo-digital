package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Peixe;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Piranha extends Peixe implements Nado, Predacao {

    public Piranha(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override public void comer()     { this.comer("carne"); }
    @Override public void emitirSom() { IO.println(getNome() + " está borbulhando furiosamente!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando em cardume!"); }
    @Override public void cacar()     { IO.println(getNome() + " está atacando em bando com dentes afiados!"); }
}
