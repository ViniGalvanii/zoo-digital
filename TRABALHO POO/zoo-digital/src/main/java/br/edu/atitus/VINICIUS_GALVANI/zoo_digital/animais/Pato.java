package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Voo;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Ave;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Pato extends Ave implements Corrida, Nado, Voo {

    public Pato(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override public void comer()     { this.comer("plantinhas do lago"); }
    @Override public void emitirSom() { IO.println(getNome() + " está grasnando!"); }
    @Override public void voar()      { IO.println(getNome() + " está voando em migração para o Sul!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando elegantemente!"); }
    @Override public void correr()    { IO.println(getNome() + " está correndo todo atrapalhado!"); }
}
