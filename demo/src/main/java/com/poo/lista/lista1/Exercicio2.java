package com.poo.lista.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva Primeiro nome: ");
        String n1 = sc.nextLine();

        System.out.println("Escreva Segundo nome: ");
        String n2 = sc.nextLine();

        System.out.println("Olá, "+ n1  + " " + n2);

        sc.close();
    }


}
