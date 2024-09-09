package com.poo.lista.lista2;

import java.util.Scanner;

/*4) Um cliente que promove eventos e solicitou um programa que seja capaz de
identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
responsáveis. Maiores de 18 podem entrar normalmente.*/

public class Exercicio4 {
   public static void resolucao2(){
      //Código de resolução: Exercicio4.resolucao2();
         Scanner sc = new Scanner(System.in);
         String condicao, nome;
         int idade;

         System.out.println("Nome: ");
         nome = sc.nextLine();

         System.out.println("Idade: ");
         idade = sc.nextInt();

         if(idade >= 16 && idade <= 18){
            System.out.println("Acesso somente acompanhado pelo responsável.");
         }
         else if(idade > 18){
            System.out.println("Acesso Liberado.");
         }
         else{
            System.out.println("Acesso Negado.");
         }
         
   sc.close();
   }     
}
