package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Peixe;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override public void comer()     { this.comer("focas e peixes grandes"); }
    @Override public void emitirSom() { IO.println(getNome() + " está borbulhando ameaçadoramente!"); }
    @Override public void nadar()     { IO.println(getNome() + " está cortando as ondas velozmente!"); }
    @Override public void cacar()     { IO.println(getNome() + " está farejando sangue e perseguindo a presa!"); }
}
