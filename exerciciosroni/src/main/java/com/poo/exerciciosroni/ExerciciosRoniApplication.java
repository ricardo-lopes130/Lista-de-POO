package com.poo.exerciciosroni;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosRoniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosRoniApplication.class, args);

		Exercicio.resolucao(); //É como a "funcao resolucao() no Portugol"
	}

}
