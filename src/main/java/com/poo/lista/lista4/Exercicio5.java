package com.poo.lista.lista4;

import java.util.Scanner;
import java.util.ArrayList;

/*5)Escreva um programa que sirva como uma lista de compras de 
mercado. Você irá criar um menu que pergunte se o usuário quer inserir 
um item ou ver a lista*/

public class Exercicio5 {
    public static void resolucao4(){
        //Código de resolução:Exercicio5.resolucao4();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> compra = new ArrayList<>();

        int opcao;

        while(true){
            System.out.println("**********MENU DE COMPRAS**********");
            System.out.println("1)INSERIR ITEM          2)VER LISTA");
            System.out.println("                3)SAIR             ");
            System.out.println("           Escolha uma opção:      ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case (1):
                System.out.print("Adicione um item: ");
                String item = sc.nextLine();
                compra.add(item);
                System.out.println("Item adicionado a lista.");
                break;

                case (2):
                System.out.println("*****Sua lista de compras*****");
                for(String i : compra){
                    System.out.println(i);
                }
                case (3):
                    sc.close();
                    return;

                default:
                System.out.println("Opção inválida. Digite uma opção válida.");
                    break;
                }
            }
        }
    }
    


