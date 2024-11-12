package br.com.fiap.cadastroaluno.main;

import br.com.fiap.cadastroaluno.model.AlunoGraduacao;
import br.com.fiap.cadastroaluno.model.AlunoPosGraduacao;
import br.com.fiap.cadastroaluno.model.CadastroAluno;

public class Main {
    public static void main(String[] args) {

        // Criando novos alunos e cadastros
        CadastroAluno cadastroAluno = new CadastroAluno();
        AlunoGraduacao aluno1 = new AlunoGraduacao("Gustavo", 18, "500.211.168-81", "Rua Gustavo Emiliano, 181", "SP3091376", 10,10);
        AlunoGraduacao aluno2 = new AlunoGraduacao("Ana", 20, "345.123.789-00", "Avenida Central, 500", "SP3091377", 8, 9);
        AlunoGraduacao aluno3 = new AlunoGraduacao("Lucas", 19, "987.654.321-00", "Rua dos Três, 700", "SP3091378", 7, 6);
        AlunoPosGraduacao aluno4 = new AlunoPosGraduacao("Carlos", 30, "123.456.789-10", "Rua do Conhecimento, 100", "SP4091379", 9, 8);
        AlunoPosGraduacao aluno5 = new AlunoPosGraduacao("Mariana", 28, "234.567.890-21", "Avenida das Ciências, 200", "SP4091380", 8, 9);
        AlunoPosGraduacao aluno6 = new AlunoPosGraduacao("Felipe", 35, "345.678.901-32", "Rua da Inovação, 300", "SP4091381", 7, 6);

        // Cadastrando novos alunos
        System.out.println(" ");
        cadastroAluno.cadastrarAluno(aluno1);
        cadastroAluno.cadastrarAluno(aluno2);
        cadastroAluno.cadastrarAluno(aluno3);
        cadastroAluno.cadastrarAluno(aluno4);
        cadastroAluno.cadastrarAluno(aluno5);
        cadastroAluno.cadastrarAluno(aluno6);
        System.out.println(" ");

        // Buscando alunos por matrículas
        System.out.println(cadastroAluno.buscarAlunoPorMatricula("SP3091376"));
        System.out.println(cadastroAluno.buscarAlunoPorMatricula("SP3091377"));
        System.out.println(cadastroAluno.buscarAlunoPorMatricula("SP3091378"));
        System.out.println(cadastroAluno.buscarAlunoPorMatricula("SP4091379"));
        System.out.println(cadastroAluno.buscarAlunoPorMatricula("SP4091380"));
        System.out.println(cadastroAluno.buscarAlunoPorMatricula("SP4091381"));
        System.out.println(" ");

        // Exibindo todos os alunos
        cadastroAluno.exibirTodosAlunos();

        // Exibindo informações do aluno pela matrícula
        cadastroAluno.exibirAlunoPorMatricula("SP3091376");

    }
}