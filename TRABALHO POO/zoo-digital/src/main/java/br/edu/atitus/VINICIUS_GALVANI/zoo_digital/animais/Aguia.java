package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Voo;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Ave;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("roedores e coelhos"); }
    @Override public void emitirSom() { IO.println(getNome() + " está piando agudamente!"); }
    @Override public void voar()      { IO.println(getNome() + " está planando nas correntes de ar quente!"); }
    @Override public void cacar()     { IO.println(getNome() + " está mergulhando em alta velocidade sobre a presa!"); }
}
