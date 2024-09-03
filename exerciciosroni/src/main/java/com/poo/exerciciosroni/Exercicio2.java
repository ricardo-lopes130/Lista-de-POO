package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao(){
        //2)Construir um algoritimo que leia um numero e exiba na tela o seu sucessor e antecessor.

        int numero1;

        System.out.println("Digite um número: ");
        Scanner leia = new Scanner(System.in);
        numero1 = leia.nextInt();

        System.out.println("O antecessor é: "+(numero1-1));
        System.out.println("O sucessor é: "+(numero1+1));

    leia.close();
    }
}
