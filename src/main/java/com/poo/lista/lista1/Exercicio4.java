package com.poo.lista.lista1;

import java.util.Scanner;

/*4) Construa um algoritmo que leia um número inteiro na tela e
responda o número antecessor e o sucessor.*/

public class Exercicio4 {
    public static void resolucao(){
        //Código de resolução: Exercicio4.resolucao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("O antecessor é "+(numero-1)+" e o seu sucessor é "+(numero+1));
        
    sc.close();
    }
}
