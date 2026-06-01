package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Escalar;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Voo;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Ave;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Arara extends Ave implements Voo, Escalar {

    public Arara(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("frutas e sementes"); }
    @Override public void emitirSom() { IO.println(getNome() + " está gritando alto na floresta!"); }
    @Override public void voar()      { IO.println(getNome() + " está voando em bando entre as copas!"); }
    @Override public void escalar()   { IO.println(getNome() + " está escalando o galho com o bico!"); }
}
