package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio10 {
    public static void resolucao(){
        /*10) Criar um algoritmo para ler um tempo em segundos e fazer a impressão no console no seguinte formato:
        hora:minuto:segundos*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

    sc.close();    
    }
}
