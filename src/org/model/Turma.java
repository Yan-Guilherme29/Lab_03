package org.model;

public class Turma {
    private String nomeTurma;
    private String[] alunos;

    public Turma() {
        this.nomeTurma = "Sem nome";
        this.alunos = new String[5];
    }

    public Turma(String nomeTurma, String[] alunos) {
        this.nomeTurma = nomeTurma;
        this.alunos = alunos;
    }

    public void imprimirTurma() {
        System.out.println("Nome da Turma: " + this.nomeTurma);
        System.out.println("Alunos: ");
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null) {
                System.out.println("- " + this.alunos[i]);
            }
        }
    }

    public int quantidadeAlunos() {
        int contador = 0;
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean buscarAluno(String nome) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null && this.alunos[i].equals(nome)) {
                return true;
            }
        }
        return false;
    }
}