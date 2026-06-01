package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Escalar;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Reptil;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Iguana extends Reptil implements Corrida, Escalar {

    public Iguana(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override public void comer()     { this.comer("folhas e frutas"); }
    @Override public void emitirSom() { IO.println(getNome() + " está assoprando em sinal de alerta!"); }
    @Override public void correr()    { IO.println(getNome() + " está correndo sobre a água!"); }
    @Override public void escalar()   { IO.println(getNome() + " está escalando a rocha para se aquecer!"); }
}
