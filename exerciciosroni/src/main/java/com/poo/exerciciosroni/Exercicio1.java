package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){
        //1) Leia dois valores pelo teclado e imprima a soma.
		
		int numero1; //variavel 1 inteiro numero1
		int numero2; //variavel 2 inteiro numero2

		System.out.print("Digite o primeiro numero: ");    // Aqui é o "Escreva"
		
		//Classe Objeto
		Scanner scannerLeia = new Scanner(System.in);        //Aqui cria o scanner
		numero1 = scannerLeia.nextInt();                     //Aqui é o "leia"

		System.out.println("O primeiro número é: "+numero1+"\n");

		System.out.print("Digite o segundo número: ");
		numero2 = scannerLeia.nextInt();

		System.out.println("O segundo número é: "+numero2);

		System.out.println("A soma é: "+(numero1+numero2));

	scannerLeia.close();
    }
}
