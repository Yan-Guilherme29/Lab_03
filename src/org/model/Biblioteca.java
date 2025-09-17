package org.model;

public class Biblioteca {
    private String nome;
    private String[] livros;

    public Biblioteca() {
        this.nome = "Biblioteca desconhecida";
        this.livros = new String[10];
    }

    public Biblioteca(String nome, String[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public void imprimirLivros() {
        System.out.println("Nome da Biblioteca: " + this.nome);
        System.out.println("Livros disponíveis: ");
        for (String livro : livros) {
            if (livro != null) {
                System.out.println("- " + livro);
            }
        }
    }

    public int contarLivrosDisponiveis() {
        int contador = 0;
        for (String livro : livros) {
            if (livro != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean verificarDisponibilidade(String nomeLivro) {
        for (String livro : livros) {
            if (livro != null && livro.equalsIgnoreCase(nomeLivro)) {
                return true; // encontrou o livro
            }
        }
        return false; // não encontrou
    }
}
