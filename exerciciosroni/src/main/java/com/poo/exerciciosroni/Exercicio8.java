package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao(){
        /*8) Calcule a área e o preço de um terreno
        area = largura x compriment
        preco = área x preco do metro quadrado*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        double area = largura * comprimento;
        System.out.println("Área: "+area+"m^2");

        System.out.println("Valor m^2: ");
        double valor = sc.nextDouble();

        System.out.println("O valor do terreno é: R$"+valor*area);

    sc.close();
    }
}
