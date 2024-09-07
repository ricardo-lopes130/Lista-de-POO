package com.poo.lista.lista4;

import java.util.Scanner;
import java.util.ArrayList;
/* 6) Aproveite a questão anterior e adiciona a opção do usuário remover
        um item.*/

public class Exercicio6 {
    public static void resolucao4(){
        //Código de resolução:Exercicio5.resolucao4();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<>();

        int opcao;

        while(true){
            System.out.println("\n**********MENU DE COMPRAS**********");
            System.out.println("1)INSERIR ITEM          2)VER LISTA");
            System.out.println("3)REMOVER ITEM          4)SAIR     ");
            System.out.println("         Escolha uma opção:        ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case (1):
                System.out.print("Adicione um item: ");
                String item = sc.nextLine();
                listaProdutos.add(item);
                System.out.println("Item adicionado a lista.");
                break;

                case (2):
                System.out.println("*****Sua lista de compras*****");
                for(String i : listaProdutos){
                    System.out.println(i);
                }
                case (3):
                System.out.println("*****Lista de itens para remover*****");
                for (int i = 0; i < listaProdutos.size(); i++) {
                    System.out.println((i+1)+". "+ listaProdutos.get(i));
                }
                System.out.println("Escolha o numero do item que deseja remover");
                int removerItem = sc.nextInt();
                if (removerItem > 0 &&  removerItem <= listaProdutos.size()) {
                    listaProdutos.remove(removerItem - 1);
                    System.out.println("Item removido com sucesso!");
                } else {
                    System.out.println("Número inválido.");
                }

                case (4):
                    sc.close();
                    return;
                default:
                System.out.println("Opção inválida.Digite uma opção válida.");
                    break;
                }
            }
        }
}
