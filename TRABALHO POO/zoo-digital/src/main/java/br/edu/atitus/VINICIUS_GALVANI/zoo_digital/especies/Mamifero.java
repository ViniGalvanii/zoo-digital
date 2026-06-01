package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

public abstract class Mamifero extends Animal {

    private Boolean temPelos;

    public Mamifero(String nome, Integer idade, Boolean temPelos) {
        super(nome, "Mamífero", idade);
        this.temPelos = temPelos;
    }

    public Boolean getTemPelos()             { return temPelos; }
    public void    setTemPelos(Boolean t)    { this.temPelos = t; }

    public void amamentar() {
        IO.println(this.getNome() + " está amamentando seus filhotinhos.");
    }
}
