package br.com.fiap.cadastroaluno.model;

import java.util.ArrayList;
import java.util.HashMap;

public class CadastroAluno {
    ArrayList<Aluno> alunos = new ArrayList<>();
    HashMap<String, Aluno> alunosMap = new HashMap<>(); 


    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        for (int i = 0; i < alunos.size(); i++) {
            alunosMap.put(aluno.matricula, aluno);
        }
    }

    public void exibirTodosAlunos() {
        for(Aluno aluno : alunos) {
            System.out.println(aluno.nome);
        }
    }

    public void exibirAlunoPorMatricula(String matricula) {
        alunosMap.get(matricula);
    }

    @Override
    public String toString() {
        return "CadastroAluno [alunos=" + alunos + ", alunosMap=" + alunosMap + "]";
    }


}
