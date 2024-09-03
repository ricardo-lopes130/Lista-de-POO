package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
        /*4)Faça um programa com duas variáveis ano_nascmento que receberá o ano que você nasceu
        e outra variável com o nome ano_futuro que deverá ser atribuído o valor 2035. Criar uma variável
        com o nome resultado para calcular a diferença. no final escreva na tela qual será a sua idade em 2035.*/

        Scanner sc = new Scanner(System.in);
        int ano_nascimento;
        int ano_futuro = 2035;

        System.out.println("Escreva a ano do seu nascimento: ");
        ano_nascimento = sc.nextInt();

        int resultado = ano_futuro - ano_nascimento;
        System.out.println("Sua idade em 2035 será: "+resultado);

    sc.close();
    }

}
