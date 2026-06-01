package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Mamifero;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("zebra"); }
    @Override public void emitirSom() { IO.println(getNome() + " está rugindo!"); }
    @Override public void correr()    { IO.println(getNome() + " está correndo em disparada atrás da presa!"); }
    @Override public void cacar()     { IO.println(getNome() + " está emboscando a manada."); }
}
