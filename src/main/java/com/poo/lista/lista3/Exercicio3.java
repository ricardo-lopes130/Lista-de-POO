package com.poo.lista.lista3;

import java.util.Scanner;

//3)Escreva um código que receba dois numeros inteiros e escreva todos os números pares entre eles;

public class Exercicio3 {
    public static void resolucao3(){
        Scanner sc = new Scanner(System.in);
        //Código de resolução:Exercicio3.resolucao3();
        int numero1;
        int numero2;

        System.out.println("Digite um número: ");
        numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt();

        int minimo = Math.min(numero1, numero2);
        int maximo = Math.max(numero1, numero2);

        for (int i = minimo ; i <= maximo; i++){
            if(i % 2 == 0){
                System.out.println("Os números pares entre são :"+ i);
            }
        }
    
    sc.close();
    }
}
