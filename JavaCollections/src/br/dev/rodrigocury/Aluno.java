package br.dev.rodrigocury;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Aluno {

     private String nome;
     private int numeroMatricula;
     private Set<Curso> cursosMatriculados = new HashSet<>();

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public void matriculaNoCurso(Curso curso){
        cursosMatriculados.add(curso);
    }

    public void desmatriculaNoCurso(Curso curso){
        cursosMatriculados.remove(curso);
    }

    public Set<Curso> getCursosMatriculados() {
        return Collections.unmodifiableSet(cursosMatriculados);
    }

    public int getTotalCursosMatriculados(){
        return cursosMatriculados.size();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }
}
