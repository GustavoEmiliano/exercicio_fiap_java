package br.com.fiap.cadastroaluno.model;

public class AlunoPosGraduacao extends Aluno {
    public AlunoPosGraduacao(String nome, int idade, String cpf, String endereco, String matricula, double nota1, double nota2) {
        super(nome, idade, cpf, endereco, matricula, nota1, nota2);
    }

    @Override
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 * 0.60) + (nota2 * 0.40) / 2;
    }
}
