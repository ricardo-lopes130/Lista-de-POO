package com.poo.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.poo.lista.lista2.Exercicio1;
import com.poo.lista.lista2.Exercicio2;
import com.poo.lista.lista2.Exercicio3;
import com.poo.lista.lista2.Exercicio4;
import com.poo.lista.lista2.Exercicio5;

@SpringBootApplication
public class ExerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);

		Exercicio5.resolucao2();

	}


}
