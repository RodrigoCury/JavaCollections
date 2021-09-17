package br.dev.rodrigocury;

import br.dev.rodrigocury.utils.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso (String nome, String instrutor){
        this.nome = StringUtils.capitalize(nome);
        this.instrutor = StringUtils.capitalize(instrutor);
    }

    public Curso(String nome, String instrutor, List<Aula> aulas){
        this(nome, instrutor);
        for (int i = 0; i<aulas.size(); i++)
            aulas.get(i).setNumeroDaAula(i+1);
        this.aulas = aulas;
    }

    public Curso(String nome, String instrutor, Aula ...aula){
        this(nome, instrutor, new LinkedList<>(List.of(aula)));
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public void add(Aula aula){
        aula.setNumeroDaAula(this.aulas.size() + 1);
        this.aulas.add(aula);
    }

    public void add(Aula ...aulas){
        List.of(aulas).forEach(this::add);
    }

    public int getTotalAulas(){
        return this.aulas.size();
    }

    @Override
    public String toString(){
        String toPrint = String.format("Curso: %s - instrutor: %s \nAulas:\n", this.nome, this.instrutor);
        for (Aula aula :
                this.aulas) {
            toPrint = toPrint + aula.toString() + "\n";
        }
        return toPrint;
    }
}
