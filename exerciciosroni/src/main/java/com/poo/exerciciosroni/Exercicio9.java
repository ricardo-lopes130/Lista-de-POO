package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio9 {
    public static void resolucao(){
        /*9) Fazer um algoritmo para ler a distância percorrida em km e o total gasto de combustível, 
        no final deverá ser exibido o consumo médio do carro.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em km: ");
        double distancia = sc.nextDouble();

        System.out.println("Digite o total gasto de combustível em litros: ");
        double gasto = sc.nextDouble();

        System.out.println("O consumo médio do veículo em km/l foi de: "+(distancia/gasto));
        
    sc.close();
    }
}
