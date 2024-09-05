package com.poo.lista.lista3;

import java.util.Scanner;

/*4) Jogo da advinhação. Peça para alguém escolher um número. Depois peça
para outra pessoa tentar advinhar. O programa deverá retornar dicas como:
"Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio".*/

public class Exercicio4 {
    public static void resolucao3() {
        //Código de resolução:Exercicio4.resolucao3();
        Scanner sc = new Scanner(System.in);
        int numAdivinhacao, numero;

        System.out.print("\t\t\n JOGO DA ADIVINHAÇÃO \n");

        System.out.println("Escolha um número para adivinhar: ");
        
        numAdivinhacao = sc.nextInt();

        do {
            System.out.println("Tente adivinhar o número digitado: ");
            numero = sc.nextInt();
            
            if (numAdivinhacao == numero) {
                System.out.println("Você acertou!!");
            
            } else if (numero == (numAdivinhacao - 1) || numero == (numAdivinhacao + 1)) {
                System.out.println("Está quente!");
            
            } else {
                System.out.println("Tá frio!");
            }
        }while(numero != numAdivinhacao);
    sc.close();    
    }
} 
