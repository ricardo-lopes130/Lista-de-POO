package com.poo.lista.lista4;

import java.util.Scanner;

/*4)Escreva um código que irá percorrer uma lista de números inteiros
lista[]={3,5,6,7,8,10,22,55,110} e irá contar a quantidade de 
números pares presentes nela*/

public class Exercicio4 {
    public static void resolucao4(){
        //Código de resolução:Exercicio4.resolucao4();
        Scanner sc = new Scanner(System.in);

        int lista[] = {3,5,6,7,8,10,22,55,110};
        System.out.println("Pares presentes: ");
        for (int index = 0; index < lista.length; index++) {
            if(lista[index]%2==0){  
            System.out.println(+lista[index]);
            }
        }
        sc.close();
    }
}
