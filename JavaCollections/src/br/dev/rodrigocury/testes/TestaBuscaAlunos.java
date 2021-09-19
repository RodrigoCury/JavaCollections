package br.dev.rodrigocury.testes;

import br.dev.rodrigocury.Aluno;
import br.dev.rodrigocury.Aula;
import br.dev.rodrigocury.Curso;

public class TestaBuscaAlunos {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso de Sets", "Paulo Silveira");
        Aula a1 = new Aula("Aula 1", 12);
        Aula a2 = new Aula("Aula 2", 12);
        Aula a3 = new Aula("Aula 3", 13);
        Aula a4 = new Aula("Aula 4", 5);
        curso.add(a1, a2, a3, a4);

        Aluno rodrigo_cury = new Aluno("Rodrigo Cury", 123);
        Aluno paulo = new Aluno("Paulo", 1234);
        Aluno luigi = new Aluno("Luigi", 1337);
        Aluno leo = new Aluno("Leo", 1235);
        Aluno marcos =new Aluno("Marcos", 5617);
        Aluno teru = new Aluno("Teru", 123451);
        curso.add(rodrigo_cury, paulo, luigi, leo, marcos, teru);

        System.out.println("Quem é o ALuno com matrícula 5617?");
        Aluno a5617 = curso.buscaMatriculado(5617);
        System.out.println(a5617);
    }
}
