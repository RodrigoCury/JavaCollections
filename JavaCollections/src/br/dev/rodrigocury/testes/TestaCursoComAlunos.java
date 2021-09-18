package br.dev.rodrigocury.testes;

import br.dev.rodrigocury.Aluno;
import br.dev.rodrigocury.Aula;
import br.dev.rodrigocury.Curso;

public class TestaCursoComAlunos {

    public static void main(String[] args) {
        Curso curso = new Curso("Curso de Sets", "Paulo Sileira");
        Aula a1 = new Aula("Aula 1", 12);
        Aula a2 = new Aula("Aula 2", 12);
        Aula a3 = new Aula("Aula 3", 13);
        Aula a4 = new Aula("Aula 4", 5);
        curso.add(a1,a2,a3,a4);

        Aluno rodrigo_cury = new Aluno("Rodrigo Cury", 123);
        Aluno paulo = new Aluno("Paulo", 1234);
        Aluno luigi = new Aluno("Luigi", 1337);

        curso.add(rodrigo_cury, paulo, luigi);

        System.out.println(curso.getAlunos());

        System.out.println(curso.estaMatriculado(paulo));

        Aluno outroPaulo = new Aluno("Paulo", 1234);
        System.out.println(curso.estaMatriculado(outroPaulo));

    }
}
