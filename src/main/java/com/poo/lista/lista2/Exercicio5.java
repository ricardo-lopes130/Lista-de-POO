package com.poo.lista.lista2;

import java.util.Scanner;

/*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das opções
está errada, se é o login ou a senha.*/

public class Exercicio5 {
   public static void resolucao2(){
      //Código de resolução: Exercicio5.resolucao2();
         Scanner sc = new Scanner(System.in);
         String login ="Ricardo123";
         String senha ="Ricardo123";
         String verificaLogin;
         String verificaSenha;

         System.out.println("Login: ");
         verificaLogin = sc.nextLine();

         System.out.println("Senha: ");
         verificaSenha = sc.nextLine();

         if(!verificaLogin.equals(login)){
            System.out.println("Login incorreto!");
         }
         else if (!verificaSenha.equals(senha)){
            System.out.println("Senha incorreta!");
         }
         else{
            System.out.println("Bem vindo ao sistema!");
         }
         
   sc.close();    
   }

}
