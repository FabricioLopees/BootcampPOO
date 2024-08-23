package me.fabricio.bootcamp;

import java.util.ArrayList;
import java.util.List;

class Dev {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();
    private double xp = 0;

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        this.cursos.addAll(bootcamp.getCursos());
        this.mentorias.addAll(bootcamp.getMentorias());
    }

    public void progredir() {
        if (!cursos.isEmpty()) {
            Curso curso = cursos.remove(0);
            xp += curso.calcularXp();
        } else if (!mentorias.isEmpty()) {
            Mentoria mentoria = mentorias.remove(0);
            xp += mentoria.calcularXp();
        }
    }

    public double calcularTotalXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "Dev: " + nome + ", XP: " + xp;
    }
}