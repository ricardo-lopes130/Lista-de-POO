package com.poo.lista.lista1;

import java.util.Scanner;

//1) Escreva um programa que faça a soma entre 2 números.

public class Exercicio1 {
    public static void resolucao(){
        //Código de resolução: Exercicio1.resolucao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        int soma = x + y;

        System.out.println("A soma é: "+ soma);

    sc.close();
    }
}
