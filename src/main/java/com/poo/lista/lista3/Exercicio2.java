package com.poo.lista.lista3;

import java.util.Scanner;

//2) Desenvolva um programa que receba um número do usuário e escreva a tabuada dele.

public class Exercicio2 {
    public static void resolucao3(){
        Scanner sc = new Scanner(System.in);
        //Código de resolução:Exercicio2.resolucao3();

        System.out.println("Número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dx%d=%d\n",numero,i,numero*i);
        }

    sc.close();
    }

}
