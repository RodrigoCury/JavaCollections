package br.dev.rodrigocury.testes;

import br.dev.rodrigocury.Aula;
import br.dev.rodrigocury.Curso;

public class TestaCursos {

    public static void main(String[] args) {
        Curso dominando_java_collections = new Curso("Dominando Java Collections", "rodrigo");
        dominando_java_collections.add(new Aula("Aula 1", 12));
        dominando_java_collections.add(new Aula("Aula 2", 12), new Aula("Aula 3", 13), new Aula("Aula 4", 5));
        System.out.println(dominando_java_collections);
        System.out.println(dominando_java_collections.getTempoTotal());
    }
}
