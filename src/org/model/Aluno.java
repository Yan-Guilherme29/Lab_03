package org.model;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno() {
        this.nome = " ";
        this.notas = new double[4];
    }

    public Aluno(String nome, double n1, double n2, double n3, double n4) {
        this.nome = nome;
        this.notas = new double[] {n1,n2,n3,n4};
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Notas: ");
        for(int i = 0; i < this.notas.length; i++) {
            System.out.println(this.notas[i]);
        }

    }

    public double calcularMedia() {
        double soma = 0;
        for(int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        return soma / this.notas.length;
    }

    public boolean verificarNotaAprovacao(double valor) {
        for(int i = 0; i < this.notas.length; i++) {
            if(this.notas[i] < valor) {
                return false;
            }
        }
        return true;
    }



}