package br.dev.rodrigocury.testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Trabalhando com Cursos e Sets";
        String aula3 = "Modelando a classe de Aula";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        for (String aula :
                aulas) {
            System.out.println("Aula: " + aula);
        }

        for (int i = 0; i < aulas.size(); i++)
            System.out.println("Aula: " + aulas.get(i));

        aulas.forEach(System.out::println);

        Collections.sort(aulas);

        aulas.forEach(aula ->System.out.println("Aula: " + aula));
    }
}
