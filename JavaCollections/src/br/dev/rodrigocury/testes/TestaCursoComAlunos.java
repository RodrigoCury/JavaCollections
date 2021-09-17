package br.dev.rodrigocury.testes;

import br.dev.rodrigocury.Aluno;
import br.dev.rodrigocury.Aula;
import br.dev.rodrigocury.Curso;

public class TestaCursoComAlunos {

    public static void main(String[] args) {
        Curso curso = new Curso("Curso de Sets", "Paulo Sileira");
        curso.add(new Aula("Aula 1", 12));
        curso.add(new Aula("Aula 2", 12), new Aula("Aula 3", 13), new Aula("Aula 4", 5));

        curso.add(new Aluno("Rodrigo Cury", 123), new Aluno("Paulo", 1234), new Aluno("Luigi", 1337));

        System.out.println(curso.getAlunos());
    }
}
