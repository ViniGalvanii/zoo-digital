package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;
import org.apache.commons.lang3.StringUtils;

public abstract class Animal {

    // Atributo Estático — pertence à classe, compartilhado entre instâncias
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public final String VERSAO_APP = "2.5";

    // Atributos de instância
    private String  nome;
    private String  especie;
    private Integer idade;

    // Construtor
    public Animal(String nome, String especie, Integer idade) {
        this.nome    = nome;
        this.especie = especie;
        this.idade   = idade;
        Animal.contador++;
    }

    // Getters / Setters
    public String  getNome()   { return nome; }
    public void    setNome(String nome) { this.nome = nome; }

    public String  getEspecie()   { return especie; }
    public void    setEspecie(String especie) { this.especie = especie; }

    public Integer getIdade()   { return idade; }
    public void    setIdade(Integer idade) { this.idade = idade; }

    // Sobrecarga de comer() — polimorfismo estático
    public void comer() {
        this.comer("alguma coisa");
    }

    public final void comer(String alimento) {
        IO.println(this.getNome() + " está comendo " +
                   StringUtils.defaultIfBlank(alimento, "alguma coisa"));
    }

    // toString sobrescrito da classe Object
    @Override
    public String toString() {
        return "Nome: "    + StringUtils.capitalize(this.getNome()) +
               "; Espécie: " + this.getEspecie() +
               "; Idade: " + this.getIdade() + " anos.";
    }

    // Método abstrato — polimorfismo dinâmico
    public abstract void emitirSom();
}
