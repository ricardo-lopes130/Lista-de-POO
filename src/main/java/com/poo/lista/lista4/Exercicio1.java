package com.poo.lista.lista4;

import java.util.Scanner;

/*1) Voce é gerente de um supermercado e sabe que os valores das
vendas do dia são gravados em um vetor. Digite um código que faça o
fechamento (soma) de vendas do dia de maneira automatizada.*/

public class Exercicio1 {
    public static void resolucao4(){
        //Código de resolução:Exercicio1.resolucao4();
        Scanner sc = new Scanner(System.in);

        double valorVendas[]={10.00,22.00,12.00,6.00};

        for (int i = 0; i < valorVendas.length; i++) {
            double soma = valorVendas[0]+valorVendas[1]+valorVendas[2]+valorVendas[3];
            System.out.printf("Fechamento das vendas do dia: R$%.2f",soma);
            break;
        }
    sc.close();    
    }


}
