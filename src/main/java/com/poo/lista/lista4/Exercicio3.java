package com.poo.lista.lista4;

import java.util.Scanner;

/*3)Ainda utilizando o exercício do mercado, calcule o ticket médio de
vendas do dia*/

public class Exercicio3 {
    public static void resolucao4(){
        //Código de resolução:Exercicio3.resolucao4();
        Scanner sc = new Scanner(System.in);

        double valorVendas[]={10.00,22.00,12.00,6.00};
        double medio = 0;

        for (int i = 0; i < valorVendas.length; i++) {
            medio =(medio + valorVendas[i])/valorVendas.length;
        }
        System.out.printf("O ticket médio de vendas do dia foi: R$%.2f",medio);
    sc.close();
    }

}
