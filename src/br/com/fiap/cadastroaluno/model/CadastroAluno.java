package br.com.fiap.cadastroaluno.model;

import java.util.ArrayList;
import java.util.HashMap;

public class CadastroAluno {

    // Lista para armazenar todos os alunos cadastrados
    ArrayList<Aluno> alunos = new ArrayList<>();

    /*
        Mapa para armazenar os alunos, utilizando a matrícula como chave e
        o objeto Aluno como valor
    */
    HashMap<String, Aluno> alunosMap = new HashMap<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        for (int i = 0; i < alunos.size(); i++) {
            // Adicionando o aluno no mapa utilizando a matrícula como chave
            alunosMap.put(aluno.matricula, aluno);
        }
    }

    // Método que percorre a lista de alunos e exibe todos dentro dela
    public void exibirTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome);
        }
    }

    // Método para buscar um aluno por matrícula
    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunosMap.get(matricula);
    }

    // Método para exibir as informações de um aluno a partir do número da matrícula
    public void exibirAlunoPorMatricula(String matricula) {
        // Procura o aluno no mapa
        Aluno aluno = alunosMap.get(matricula);

        if (aluno != null) {
            // Exibe as informações do aluno
            System.out.println("===============================");
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Média: " + aluno.media);
            System.out.println("===============================");
        } else {
            System.out.println("Aluno não encontrado para a matrícula: " + matricula);
        }
    }

    // ToString
    @Override
    public String toString() {
        return "CadastroAluno [alunos=" + alunos + ", alunosMap=" + alunosMap + "]";
    }
}
