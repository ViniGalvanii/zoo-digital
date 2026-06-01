package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private Boolean venenoso;

    public Reptil(String nome, int idade, Boolean venenoso) {
        super(nome, "Réptil", idade);
        this.venenoso = venenoso;
    }

    public Boolean isVenenoso()            { return venenoso; }
    public void    setVenenoso(Boolean v)  { this.venenoso = v; }
}
