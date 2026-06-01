package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Peixe;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override public void comer()     { this.comer("pequenas algas"); }
    @Override public void emitirSom() { IO.println(getNome() + " está borbulhando!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando tranquilamente!"); }
}
