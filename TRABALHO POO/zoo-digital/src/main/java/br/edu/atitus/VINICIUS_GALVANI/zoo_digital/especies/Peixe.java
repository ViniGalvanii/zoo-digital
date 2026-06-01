package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies;

public abstract class Peixe extends Animal {

    private String tipoAgua; // "Doce" ou "Salgada"

    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, "Peixe", idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua()           { return tipoAgua; }
    public void   setTipoAgua(String t)   { this.tipoAgua = t; }
}
