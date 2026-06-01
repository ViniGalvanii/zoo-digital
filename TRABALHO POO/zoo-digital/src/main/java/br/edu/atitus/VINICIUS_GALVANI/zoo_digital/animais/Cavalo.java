package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Mamifero;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Cavalo extends Mamifero implements Corrida {

    public Cavalo(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("feno e aveia"); }
    @Override public void emitirSom() { IO.println(getNome() + " está relinchando!"); }
    @Override public void correr()    { IO.println(getNome() + " está galopando velozmente!"); }
}
