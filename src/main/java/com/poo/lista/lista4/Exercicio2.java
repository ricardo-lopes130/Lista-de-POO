package com.poo.lista.lista4;

import java.util.Scanner;

/*2) Agora que voce sabe o fechamento do dia, monte um código que
identifique a compra de menor valor e a compra de maior valor*/

public class Exercicio2 {
    public static void resolucao4(){
        //Código de resolução:Exercicio2.resolucao4();
        Scanner sc = new Scanner(System.in);

        double valorVendas[]={10.00,22.00,12.00,6.00};
        double valorMaior = valorVendas[0]; 
        double valorMenor = valorVendas[0];

        for (int i = 0; i < valorVendas.length; i++) {
            if (valorVendas[i] < valorMenor) {
                valorMenor=valorVendas[i];
            }
            if(valorVendas[i] > valorMaior){
            valorMaior=valorVendas[i];
            }    
        }
        System.out.printf("Compra de menor valor: R$%.2f\n",valorMenor);
        System.out.printf("Compra de maior valor: R$%.2f\n",valorMaior);
    sc.close();    
    }
}
