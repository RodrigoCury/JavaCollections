package br.dev.rodrigocury.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("4");
        alunos.add("6");
        alunos.add("3");
        alunos.add("1");
        alunos.add("2");
        alunos.add("8");
        alunos.add("5");
        alunos.add("7");

        System.out.println(alunos);
    }
}
