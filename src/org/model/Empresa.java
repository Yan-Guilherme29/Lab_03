package org.model;

public class Empresa {
    private String nome;
    private String[] funcionarios;

    public Empresa() {
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }

    public Empresa(String nome, String[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprimirFuncionarios() {
        System.out.println("Nome da Empresa: " + this.nome);
        System.out.println("Funcionários da empresa: ");
        for (String f : funcionarios) {
            if (f != null) {
                System.out.println("- " + f);
            }
        }
    }

    public int contarFuncionarios() {
        int contador = 0;
        for (String f : funcionarios) {
            if (f != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean verificarFuncionario(String nomeFuncionario) {
        for (String f : funcionarios) {
            if (f != null && f.equalsIgnoreCase(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }
}