package me.fabricio.bootcamp;

import java.time.LocalDate;

class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public double calcularXp() {
        return 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: " + titulo + ", Descrição: " + descricao + ", Data: " + data;
    }
}