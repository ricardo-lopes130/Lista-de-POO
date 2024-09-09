package com.poo.lista.lista1;

import java.util.Scanner;

/*3) Escreva uma calculadora que receba um valor em reais e
converta para dólar. Considere o valor do dólar a R$5,25.*/

public class Exercicio3 {
    public static void resolucao(){
        //Código de resolução: Exercicio3.resolucao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        System.out.println("O dolar está valendo R$ 5.25");

        double dolar = reais / 5.25;

        System.out.println("O valor em dolar é $" + dolar);

    sc.close();
    }
}
