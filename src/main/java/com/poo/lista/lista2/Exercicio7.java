package com.poo.lista.lista2;

import java.util.Scanner;

/*7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
um determinado número informado pelo usuário é divisível por X (Que também
deve ser informado pelo usuário)*/

public class Exercicio7 {
   public static void resolucao2(){
      //Código de resolução: Exercicio7.resolucao2();
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um número: ");
         double numero1 = sc.nextInt();
         System.out.println("Digite outro número: ");
         double numero2 = sc.nextInt();

         if(numero1%numero2 == 0){
            System.out.println("Número "+numero1+" é divisivel por "+numero2);
         }
         else if(numero2%numero1 == 0){
            System.out.println("Número "+numero1+" é divisivel por "+numero2);
         }
         else{
            System.out.println("Números informados não são divisiveis.");
         }
         
   sc.close(); 
   }
}
