package br.com.fiap.cadastroaluno.model;

public class AlunoGraduacao extends Aluno{
    public AlunoGraduacao(String nome, int idade, String cpf, String endereco, String matricula, double nota1, double nota2) {
        super(nome, idade, cpf, endereco, matricula, nota1, nota2);
    }

    @Override
    public double calcularMedia(double nota1, double nota2) {
        return super.calcularMedia(nota1, nota2);
    }
}
