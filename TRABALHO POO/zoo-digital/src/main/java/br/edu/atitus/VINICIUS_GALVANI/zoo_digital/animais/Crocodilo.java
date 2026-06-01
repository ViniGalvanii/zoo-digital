package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Reptil;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Crocodilo extends Reptil implements Nado, Corrida, Predacao {

    public Crocodilo(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("gnu e antílopes"); }
    @Override public void emitirSom() { IO.println(getNome() + " está rosnando!"); }
    @Override public void nadar()     { IO.println(getNome() + " está se arrastando silenciosamente pela água!"); }
    @Override public void correr()    { IO.println(getNome() + " está correndo em disparada curta na margem!"); }
    @Override public void cacar()     { IO.println(getNome() + " está esperando na água para atacar de surpresa!"); }
}
