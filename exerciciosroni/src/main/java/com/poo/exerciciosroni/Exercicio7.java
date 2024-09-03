package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){
        /*7) Criar um algoritmo que leia dois números inteiros e imprima a seguinte saída:
        Dividendo, Divisor, Quociente e Resto */
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva o Dividendo: ");
        int dividendo = sc.nextInt();

        System.out.println("Escreva o Divisor: ");
        int divisor = sc.nextInt();

        if(divisor== 0){
            System.out.println("Erro: Divisor não pode ser zero(0).");
        }
        else{
            int quociente = (dividendo/divisor);
            int resto = (dividendo % divisor);
            
            System.out.println("Dividendo: "+dividendo);
            System.out.println("Divisor: "+divisor);
            System.out.println("Quociente: "+quociente);
            System.out.println("Resto: "+resto);
        }
    sc.close();
    }
}
