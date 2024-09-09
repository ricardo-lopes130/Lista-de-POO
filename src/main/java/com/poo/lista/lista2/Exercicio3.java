package com.poo.lista.lista2;

import java.util.Scanner;

/*3) Um banco contratou você para que escreva um programa que será utilizado
pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
das condições a seguir ele deve ser encaminhado para a fila preferencial. As
condições são: Ter mais de 65 anos, se deficiente ou gestante.*/

public class Exercicio3 {
   public static void resolucao2(){
      //Código de resolução: Exercicio3.resolucao2();
         Scanner sc = new Scanner(System.in);
         String condicao, nome;
         int idade;

         System.out.println("Digite seu seu nome: ");
         nome = sc.nextLine();

         System.out.println("É deficiente ou gestante: ");
         condicao = sc.nextLine();

         System.out.println("Idade do cliente: ");
         idade = sc.nextInt();

         if(idade > 65 || condicao.equalsIgnoreCase("gestante")|| condicao.equalsIgnoreCase("deficiente")){
            System.out.println("Preferêncial");
         }
         else{
            System.out.println("Comum");}

   sc.close();
   }
}
