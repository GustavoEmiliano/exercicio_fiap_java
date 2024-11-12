package br.com.fiap.cadastroaluno.model;

public abstract  class Aluno extends Pessoa implements Calculavel {
    // Atributos
    protected String matricula;
    protected double nota1;
    protected double nota2;
    protected double media;

    // Construtor
    public Aluno(String nome, int idade, String cpf, String endereco, String matricula, double nota1, double nota2) {
        super(nome, idade, cpf, endereco);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Métodos
    public String verificarAprovacao() {
        if (media >= 7) {
            return "Aprovado!";
        } else {
            System.out.println("Reprovado!");
            return "Reprovado!";
        }
    }

    public void exibirInformacoesPessoais() {
        System.out.println("=============================");
        System.out.println("|         INFORMAÇÕES       |");
        System.out.println("=============================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereço " + this.endereco);
        System.out.println("=============================");
    }

    public void exibirInformacoesAcademicas() {
        System.out.println("=============================");
        System.out.println("|         INFORMAÇÕES       |");
        System.out.println("=============================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Média: " + media);
        System.out.println("Status de aprovação: " + verificarAprovacao());
        System.out.println("=============================");
    }

    @Override
    public double calcularMedia(double nota1, double nota2) {
        media = (nota1 + nota2) / 2;
        return media;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + "]";
    }

    
}
