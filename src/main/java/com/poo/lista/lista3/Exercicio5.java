package com.poo.lista.lista3;

import java.util.Scanner;

/*Crie um algoritimo que receba login e senha e verifique as credencias. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das 
opções está errada, se é o login ou senha. O programa deve bloquear o
acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir 
um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!"
*/
public class Exercicio5 {
    public static void resolucao3() {
        //Código de resolução:Exercicio4.resolucao3();
        Scanner sc = new Scanner(System.in);
        String usuario = "adm";
        String senha = "adm";
        String U = " ";
        String S = " ";
        int tentativa = 3;


        while (tentativa >=1 ) {
            System.out.println("Login: ");
        U = sc.nextLine();

        System.out.println("Senha: ");
        S = sc.nextLine();

        if(usuario.equals(U)&&senha.equals(S)){
            System.out.println("LOGIN CORRETO.");
            sc.close();
            return;
        }
        else if(!usuario.equals(U)&&senha.equals(S)){
            System.out.println("LOGIN INCORRETO.");
            tentativa--;
            if(tentativa>1){
                System.out.println("Você tem "+tentativa+" tentativas.");
            }
            else if(tentativa==1){
                System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
            }
        }
        else if(usuario.equals(U)&&!senha.equals(S)){
            System.out.println("SENHA INCORRETA.");
            tentativa--;
            if(tentativa>1){
                System.out.println("Você tem "+tentativa+" tentativas.");
            }
            else if(tentativa==1){
                System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
            }
        }
        else if(usuario.equals(U)&&!senha.equals(S)){
        System.out.println("SENHA INCORRETA.");
        tentativa--;
        if(tentativa>1){
            System.out.println("Você tem "+tentativa+" tentativas.");
        }
        else if(tentativa==1){
            System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
        }
    }
    else if(!usuario.equals(U)&&!senha.equals(S)){
        System.out.println("SENHA E USUARIO INCORRETOS.");
        tentativa--;
        if(tentativa>1){
            System.out.println("Você tem "+tentativa+" tentativas.");
        }
        else if(tentativa==1){
            System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
        }
    }
    if(tentativa==0){
        System.out.println("USUARIO BLOQUEADO.");
        sc.close();
        return;
    }
} 
    sc.close();    
    }
}
