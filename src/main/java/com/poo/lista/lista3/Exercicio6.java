package com.poo.lista.lista3;

import java.util.Scanner;

/*6) Escreva um programa que seja capaz de desenhar uma pirâmide de
    asteriscos. O usuário deverá informar quantos andares ele deseja que a
    pirâmide tenha.*/
public class Exercicio6 {
    public static void resolucao3() {
        //Código de resolução:Exercicio6.resolucao3();
        Scanner sc = new Scanner(System.in);
        int andares;

        System.out.println("Digite o número de andares: ");
        andares = sc.nextInt();

        Piramide(andares);
        sc.close();
    }
    public static void Piramide(int n){
        for (int i = 1 ; i<= n ; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


