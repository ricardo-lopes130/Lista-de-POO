package com.poo.lista.lista3;

import java.util.Scanner;

/* 7) Aproveitando o exercício anterior, escreva um programa que consiga
        construir um retângulo. O usuário deve informar a largura e a altura em
        asteriscos*/
public class Exercicio7 {
    public static void resolucao3() {
        //Código de resolução:Exercicio7.resolucao3();
        Scanner sc = new Scanner(System.in);
        int altura;
        int largura;

        System.out.println("Digite a altura: ");
        altura = sc.nextInt();
        System.out.println("Digite a largura: ");
        largura = sc.nextInt();

        Retangulo(altura, largura);
        sc.close();
    }
    public static void Retangulo(int altura, int largura ){
        for (int i = 1 ; i <= altura; i++){
            for (int j = 1; j <= largura; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
