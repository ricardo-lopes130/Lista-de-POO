package com.poo.lista.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){
        //Código de resolução: Exercicio6.resolucao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância em km: ");
        double distancia = sc.nextDouble();

        System.out.println("Digite o total gasto de combustível em litros: ");
        double gasto = sc.nextDouble();

        System.out.println("O consumo médio do veículo em km/l foi de: "+(distancia/gasto));
        
    sc.close();
    }  
}
