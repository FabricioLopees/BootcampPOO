package me.fabricio.bootcamp;

class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp() {
        return cargaHoraria * 10;
    }

    @Override
    public String toString() {
        return "Curso: " + titulo + ", Descrição: " + descricao + ", Carga Horária: " + cargaHoraria;
    }
}