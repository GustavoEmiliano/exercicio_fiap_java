package br.com.fiap.cadastroaluno.model;

public class AlunoGraduacao extends Aluno{

    // Construtor
    public AlunoGraduacao(String nome, int idade, String cpf, String endereco, String matricula, double nota1, double nota2) {
        super(nome, idade, cpf, endereco, matricula, nota1, nota2);
        this.tipo = TipoAluno.ALUNO_GRADUACAO;
    }

    @Override
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 * 6) + (nota2 * 4) /2 ;
    }
}
