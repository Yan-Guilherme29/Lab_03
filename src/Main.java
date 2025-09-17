import org.model.Aluno;
import org.model.Turma;
import org.model.Biblioteca;
import org.model.Empresa;
import org.model.Estoque;


public class Main {
    public static void main(String[] args) {

        // Exercício 1 - Classe Pessoa
        System.out.println("\n============== Exercício 1 ==============");

        Aluno aluno1 = new Aluno();
        aluno1.imprimirInformacoes();


        double media1 = aluno1.calcularMedia();
        System.out.println("\nMédia de " + aluno1.getNome() + ": " + media1);
        System.out.println("\n-----------------------------------");


        // ---

        Aluno aluno2 = new Aluno("Yan", 6, 6, 6, 6);
        aluno2.imprimirInformacoes();
        System.out.println("\n-----------------------------------");

        double media2 = aluno2.calcularMedia();
        System.out.println("Média de " + aluno2.getNome() + ": " + media2);
        boolean aprovado = aluno2.verificarNotaAprovacao(6.0);
        System.out.println("Aluno aprovado? " + aprovado);
        System.out.println("\n-----------------------------------");

        // -------------------------------------------------------------------

        // Exercicio 2 - Classe Turma
        System.out.println("\n============== Exercício 2 ==============");

        Turma turma1 = new Turma();
        System.out.println("Turma 1:");
        turma1.imprimirTurma();
        System.out.println("Quantidade de alunos: " + turma1.quantidadeAlunos());
        System.out.println("Buscar aluno João: " + turma1.buscarAluno("João"));
        System.out.println("\n-----------------------------------");


        // ---

        String[] alunos = {"Ana", "Bruno", "Carlos", null, "Daniel"};
        Turma turma2 = new Turma("3º Ano", alunos);

        System.out.println("Turma 2:");
        turma2.imprimirTurma();
        System.out.println("Quantidade de alunos: " + turma2.quantidadeAlunos());
        System.out.println("Buscar aluno Carlos: " + turma2.buscarAluno("Carlos"));
        System.out.println("Buscar aluno Pedro: " + turma2.buscarAluno("Pedro"));
        System.out.println("\n-----------------------------------");


        // -------------------------------------------------------------------

        // Exercicio 3 - Classe Biblioteca
        System.out.println("\n============== Exercício 3 ==============");

        Biblioteca b1 = new Biblioteca();
        b1.imprimirLivros();
        System.out.println("\n-----------------------------------");


        // ---

        String[] livros = {"Dom Quixote", "1984", "O Senhor dos Anéis", null, "A Revolução dos Bichos"};
        Biblioteca b2 = new Biblioteca("Biblioteca Central", livros);

        System.out.println("\n--- Testando Biblioteca Central ---");
        b2.imprimirLivros();


        System.out.println("Quantidade de livros: " + b2.contarLivrosDisponiveis());


        System.out.println("Livro '1984' está disponível? " + b2.verificarDisponibilidade("1984"));
        System.out.println("Livro 'Harry Potter' está disponível? " + b2.verificarDisponibilidade("Harry Potter"));
        System.out.println("\n-----------------------------------");


        // -------------------------------------------------------------------
        // Exercicio 4 - Classe Empresa
        System.out.println("\n============== Exercício 4 ==============");

        Empresa e1 = new Empresa();
        e1.imprimirFuncionarios();
        System.out.println("\n-----------------------------------");


        // ---

        String[] lista = {"Ana", "Bruno", "Carlos", null, "Fernanda"};
        Empresa e2 = new Empresa("Tech Solutions", lista);

        System.out.println("\n--- Testando Tech Solutions ---");
        e2.imprimirFuncionarios();


        System.out.println("Quantidade de funcionários: " + e2.contarFuncionarios());


        System.out.println("Bruno está cadastrado? " + e2.verificarFuncionario("Bruno"));
        System.out.println("João está cadastrado? " + e2.verificarFuncionario("João"));
        System.out.println("\n-----------------------------------");


        // -------------------------------------------------------------------

        // Exercicio 5 - Classe Estoque
        System.out.println("\n============== Exercício 5 ==============");

        Estoque estoque1 = new Estoque();
        estoque1.imprimirEstoque();
        System.out.println("Total em estoque: " + estoque1.calcularEstoque());
        System.out.println("Disponibilidade acima de 10 itens em algum lote? " + estoque1.verificarDisponibilidade(10));
        System.out.println("\n-----------------------------------");

        // ---


        int[] lotes = {15, 8, 20, 5, 12};
        Estoque estoque2 = new Estoque("Notebook", lotes);
        estoque2.imprimirEstoque();
        System.out.println("Total em estoque: " + estoque2.calcularEstoque());
        System.out.println("Disponibilidade acima de 10 itens em algum lote? " + estoque2.verificarDisponibilidade(10));
        System.out.println("\n-----------------------------------");

    }
}



