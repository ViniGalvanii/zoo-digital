package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Nado;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Mamifero;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public final class Cachorro extends Mamifero implements Corrida, Nado, Predacao {

    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override public void comer()     { this.comer("ração"); }
    @Override public void emitirSom() { IO.println(getNome() + " está latindo!"); }
    @Override public void nadar()     { IO.println(getNome() + " está nadando estilo cachorrinho!"); }
    @Override public void correr()    { IO.println(getNome() + " está correndo por todo o pátio!"); }
    @Override public void cacar()     { IO.println(getNome() + " está caçando a meia que roubou."); }
}
