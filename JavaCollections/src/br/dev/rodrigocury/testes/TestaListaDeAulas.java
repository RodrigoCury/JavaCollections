package br.dev.rodrigocury.testes;

import br.dev.rodrigocury.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando Arrays", 12);
        Aula a2 = new Aula("Listas de objetos", 12);
        Aula a3 = new Aula("Relacionamento de listas de objetos", 13);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        aulas.forEach(aula -> System.out.println(aula));
        System.out.println();

//        Collections.sort(aulas);
        Collections.sort(aulas);

        aulas.forEach(System.out::println);
    }
}
