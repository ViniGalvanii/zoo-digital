package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Escalar;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Mamifero;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Gato extends Mamifero implements Corrida, Nado, Predacao, Escalar {

    public Gato(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("carne"); }
    @Override public void emitirSom() { IO.println(getNome() + " está miando!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando apavorado!"); }
    @Override public void correr()    { IO.println(getNome() + " está correndo pelo telhado!"); }
    @Override public void cacar()     { IO.println(getNome() + " está caçando um passarinho."); }
    @Override public void escalar()   { IO.println(getNome() + " está escalando a árvore!"); }
}
