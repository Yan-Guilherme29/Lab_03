package org.model;

public class Estoque {
    private String produto;
    private int[] quantidade;

    public Estoque() {
        this.produto = "Produto Desconhecido";
        this.quantidade = new int[5]; // todos os valores iniciam em 0
    }


    public Estoque(String produto, int[] quantidades) {
        this.produto = produto;
        this.quantidade = quantidades;
    }

    public void imprimirEstoque() {
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidades: ");
        for (int i = 0; i < this.quantidade.length; i++) {
            System.out.println("Lote: " + (i+1) + ": " + this.quantidade[i]);

        }
    }

    public int calcularEstoque() {
        int total = 0;
        for (int qtd : this.quantidade) {
            total += qtd;
        }
        return total;
    }

    public boolean verificarDisponibilidade(int quantidadeMinima) {
        for (int qtd : this.quantidade) {
            if (qtd > quantidadeMinima) {
                return true;
            }
        }
        return false;
    }
}





