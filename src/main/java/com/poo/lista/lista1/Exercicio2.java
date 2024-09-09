package com.poo.lista.lista1;

import java.util.Scanner;

/*2) Escreva um programa que pergunte o nome e o
sobrenome do usuário e escreva na tela: "Olá, -usuário-".*/

public class Exercicio2 {
    public static void resolucao(){
        //Código de resolução: Exercicio2.resolucao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        String n1 = sc.nextLine();

        System.out.println("Digite o seu Sobrenome: ");
        String n2 = sc.nextLine();

        System.out.println("Olá, "+ n1  + " " + n2);

    sc.close();
    }
}
