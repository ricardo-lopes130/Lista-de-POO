package com.poo.lista.lista3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*1) Escreva um programa que sirva como um cronômetro. O usuário deve
digitar um numero em segundos e o programa deve contabilizar os segundos
digitados. O programa deve receber somente números entre 1 e 59, do
contrário ele retornar um erro e solicitar que o usuário digite um número válido.
*/

public class Exercicio1 {
    public static void resolucao3()throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //Código de resolução:Exercicio1.resolucao3();

        int numero;

            System.out.println("Digite um número em segundos (entre 1 e 59): ");
                numero = sc.nextInt();

        while (numero < 1 || numero > 59){
            System.out.println("Erro. Digite um número entre 1 e 59: ");
                numero = sc.nextInt();
        }
        for (int i = 0; i <= numero; i++){
            System.out.println("00:" + i);
            TimeUnit.SECONDS.sleep(1);

        }
    sc.close();
    }
}
