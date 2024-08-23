package me.fabricio.bootcamp;

import java.time.LocalDate;

public class BootcampApp {

	public static void main(String[] args) {
	
		Bootcamp bootcamp = new Bootcamp("Backend com Java", "Bootcamp focado em Java", LocalDate.now(), LocalDate.now().plusMonths(1));

        Curso curso1 = new Curso("Java Básico", "Curso de introdução ao Java", 8);
        Curso curso2 = new Curso("Java Avançado", "Curso avançado de Java", 16);
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre práticas avançadas em Java", LocalDate.now().plusDays(10));
        bootcamp.adicionarMentoria(mentoria1);

        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Maria");

        bootcamp.inscreverDev(dev1);
        bootcamp.inscreverDev(dev2);

        System.out.println(bootcamp);

        dev1.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println(dev1);
        System.out.println(dev2);

        System.out.println("XP total do Bootcamp: " + bootcamp.calcularTotalXp());
	
	}

}
