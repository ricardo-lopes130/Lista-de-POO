package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){
        /*6) Escreva um programa que leia a temperatura em Celsius e retorne o valor em Fahrenheit

F = C x 1,8 + 32

Para que você consiga converter de grau Celsius para Fahrenheit, basta multiplicar a temperatura em
graus Celsius por 1,8 e somar 32.

Exemplo:

37º C para Fahrenheit:

F = 37 x 1,8 + 32;

F = 98,6;

37 graus Celsius equivalem a 98,6 graus Fahrenheit. */
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheint;

        System.out.println("Escreva os graus em Celsius: ");
        celsius = sc.nextDouble();

        fahrenheint = celsius * 1.8 + 32;
        System.out.printf("Em Farenheint: %.2f ", fahrenheint);

    sc.close();
    }
}
