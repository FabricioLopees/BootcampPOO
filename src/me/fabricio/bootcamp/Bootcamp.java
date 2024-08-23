package me.fabricio.bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void inscreverDev(Dev dev) {
        devs.add(dev);
        dev.inscreverNoBootcamp(this);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public double calcularTotalXp() {
        return devs.stream().mapToDouble(Dev::calcularTotalXp).sum();
    }

    @Override
    public String toString() {
        return "============================\nBootcamp: " + nome + "\nDescrição: " + descricao + "\nData Inicial: " + dataInicial + "\nData Final: " + dataFinal + "\n============================";
    }
}