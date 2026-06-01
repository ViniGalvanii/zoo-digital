package br.edu.atitus.VINICIUS_GALVANI.zoo_digital.app;

import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.animais.*;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.comportamentos.*;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.especies.Animal;
import br.edu.atitus.VINICIUS_GALVANI.zoo_digital.util.IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IO.println("╔══════════════════════════════════╗");
        IO.println("║     BEM-VINDO AO ZOO DIGITAL     ║");
        IO.println("╚══════════════════════════════════╝");

        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            switch (opcao) {
                case 1  -> cadastrarAnimal();
                case 2  -> listarTodos();
                case 3  -> listarCorredores();
                case 4  -> listarNadadores();
                case 5  -> listarVoadores();
                case 6  -> listarPredadores();
                case 7  -> exibirTotal();
                case 0  -> IO.println("\nEncerrando o Zoo Digital. Até logo!");
                default -> IO.println("[ERRO] Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // ── Menu ─────────────────────────────────────────────────────────────────
    private static void exibirMenu() {
        IO.println("\n╔═══════════════════════════════════╗");
        IO.println("║          MENU PRINCIPAL           ║");
        IO.println("╠═══════════════════════════════════╣");
        IO.println("║  1 - Cadastrar Animal             ║");
        IO.println("║  2 - Listar Todos os Animais      ║");
        IO.println("║  3 - Listar Animais Corredores    ║");
        IO.println("║  4 - Listar Animais Nadadores     ║");
        IO.println("║  5 - Listar Animais Voadores      ║");
        IO.println("║  6 - Listar Animais Predadores    ║");
        IO.println("║  7 - Exibir Total de Animais      ║");
        IO.println("║  0 - Sair                         ║");
        IO.println("╚═══════════════════════════════════╝");
    }

    // ── Opção 1: Cadastrar ────────────────────────────────────────────────────
    private static void cadastrarAnimal() {
        IO.println("\n--- TIPOS DE ANIMAIS ---");
        IO.println("  MAMÍFEROS");
        IO.println("   1 - Cachorro        2 - Gato           3 - Golfinho");
        IO.println("   4 - Cavalo          5 - Leão");
        IO.println("  AVES");
        IO.println("   6 - Pato            7 - Pinguim        8 - Águia");
        IO.println("   9 - Arara");
        IO.println("  PEIXES");
        IO.println("  10 - Peixe-Morcego  11 - Traíra        12 - Tubarão");
        IO.println("  13 - Piranha");
        IO.println("  RÉPTEIS");
        IO.println("  14 - Crocodilo      15 - Cobra         16 - Tartaruga");
        IO.println("  17 - Iguana");

        int tipo = lerInteiro("\nInforme o tipo do animal: ");
        if (tipo < 1 || tipo > 17) {
            IO.println("[ERRO] Tipo inválido.");
            return;
        }

        String nome = lerString("Nome: ");
        int    idade = lerInteiro("Idade: ");

        // Aves precisam de cor das penas
        String corPenas = "";
        if (tipo >= 6 && tipo <= 9) {
            corPenas = lerString("Cor das penas: ");
        }

        // Upcasting: instância concreta armazenada em Animal
        Animal animal = switch (tipo) {
            case  1 -> new Cachorro(nome, idade);
            case  2 -> new Gato(nome, idade);
            case  3 -> new Golfinho(nome, idade);
            case  4 -> new Cavalo(nome, idade);
            case  5 -> new Leao(nome, idade);
            case  6 -> new Pato(nome, idade, corPenas);
            case  7 -> new Pinguim(nome, idade, corPenas);
            case  8 -> new Aguia(nome, idade, corPenas);
            case  9 -> new Arara(nome, idade, corPenas);
            case 10 -> new PeixeMorcego(nome, idade);
            case 11 -> new Traira(nome, idade);
            case 12 -> new Tubarao(nome, idade);
            case 13 -> new Piranha(nome, idade);
            case 14 -> new Crocodilo(nome, idade);
            case 15 -> new Cobra(nome, idade);
            case 16 -> new Tartaruga(nome, idade);
            case 17 -> new Iguana(nome, idade);
            default -> throw new IllegalArgumentException("Tipo inválido");
        };

        animais.add(animal);
        IO.println("[OK] " + animal.getNome() + " cadastrado com sucesso!");
    }

    // ── Opção 2: Listar todos ─────────────────────────────────────────────────
    private static void listarTodos() {
        if (animais.isEmpty()) { IO.println("\nNenhum animal cadastrado."); return; }
        IO.println("\n--- TODOS OS ANIMAIS ---");
        for (Animal a : animais) {
            IO.println("\n" + a);
            a.emitirSom();    // Polimorfismo dinâmico
            a.comer();        // Polimorfismo dinâmico
        }
    }

    // ── Opção 3: Corredores ───────────────────────────────────────────────────
    private static void listarCorredores() {
        IO.println("\n--- ANIMAIS CORREDORES ---");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Corrida) {           // instanceof + Downcasting seguro
                Corrida corredor = (Corrida) a;
                IO.println("\n" + a);
                corredor.correr();
                encontrou = true;
            }
        }
        if (!encontrou) IO.println("Nenhum animal corredor cadastrado.");
    }

    // ── Opção 4: Nadadores ────────────────────────────────────────────────────
    private static void listarNadadores() {
        IO.println("\n--- ANIMAIS NADADORES ---");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Nado) {
                Nado nadador = (Nado) a;
                IO.println("\n" + a);
                nadador.nadar();
                encontrou = true;
            }
        }
        if (!encontrou) IO.println("Nenhum animal nadador cadastrado.");
    }

    // ── Opção 5: Voadores ─────────────────────────────────────────────────────
    private static void listarVoadores() {
        IO.println("\n--- ANIMAIS VOADORES ---");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Voo) {
                Voo voador = (Voo) a;
                IO.println("\n" + a);
                voador.voar();
                encontrou = true;
            }
        }
        if (!encontrou) IO.println("Nenhum animal voador cadastrado.");
    }

    // ── Opção 6: Predadores ───────────────────────────────────────────────────
    private static void listarPredadores() {
        IO.println("\n--- ANIMAIS PREDADORES ---");
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Predacao) {
                Predacao predador = (Predacao) a;
                IO.println("\n" + a);
                predador.cacar();
                encontrou = true;
            }
        }
        if (!encontrou) IO.println("Nenhum animal predador cadastrado.");
    }

    // ── Opção 7: Total (atributo static) ──────────────────────────────────────
    private static void exibirTotal() {
        IO.println("\nTotal de animais cadastrados (contador estático): " + Animal.getContador());
    }

    // ── Utilitários de leitura ────────────────────────────────────────────────
    private static int lerInteiro(String mensagem) {
        while (true) {
            IO.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                IO.println("[ERRO] Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private static String lerString(String mensagem) {
        IO.print(mensagem);
        String valor = scanner.nextLine().trim();
        while (valor.isEmpty()) {
            IO.println("[ERRO] Campo obrigatório. Tente novamente.");
            IO.print(mensagem);
            valor = scanner.nextLine().trim();
        }
        return valor;
    }
}
