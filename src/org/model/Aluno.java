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

    }

    public void calcularMedia() {

    }


}