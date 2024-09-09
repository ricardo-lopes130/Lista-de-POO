package com.poo.lista.lista1;

import java.util.Scanner;

/*5) Construa um algoritmo que calcule o valor de um terreno
baseado na sua área e valor por m2.*/

public class Exercicio5 {
    public static void resolucao(){
        //Código de resolução: Exercicio5.resolucao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        double area = largura * comprimento;
        System.out.println("Área: "+area);

        System.out.println("Valor m^2: ");
        double valor = sc.nextDouble();

        System.out.println("O valor do terreno é: R$"+valor*area);

    sc.close();
    }
}
