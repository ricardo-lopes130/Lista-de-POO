package com.poo.lista.lista4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;


public class Exercicio8 {
    public static void resolucao4() {
        
        /*8) Aproveite os códigos anteriores e implemente a função de impressão
        por ordem de preço (crescente)*/

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<>();
        Map<String, Double> compra = new HashMap<>();

        while(true){
            System.out.println("\n--- Lista de Compra ---");
            System.out.println("1. Adicionar Item.");
            System.out.println("2. Verificar list.");
            System.out.println("3. Remover item.");
            System.out.println("4. Sair.");
            System.out.println("Escolha a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Adicione um item: ");
                    String item = sc.nextLine();

                    System.out.println("Adicione um preço: ");
                    Double preco = sc.nextDouble();

                    compra.put(item,preco);

                    listaProdutos.add(item);
                    System.out.println("Item adicionado com sucesso.");
                    break;
                case 2:
                    if (listaProdutos.isEmpty()){
                        System.out.println("Sua lista está vazia!");
                    }else {
                        System.out.println("\n*****Lista de Compras*****");
                        List<Map.Entry<String, Double>> list = new ArrayList<>((compra.entrySet()));
                        list.sort(Map.Entry.comparingByValue());
                        for (String i : listaProdutos){
                            System.out.println("- " + compra );
                            break;
                        }
                    }
                    break;
                case 3:
                    if (listaProdutos.isEmpty()){
                        System.out.println("Não há itens para remover. ");
                    }else {
                        System.out.println("\n*****Lista de Compras*****");
                        for (int i = 0; i < listaProdutos.size(); i++){
                            System.out.println((i+1)+ ". " + listaProdutos.get(i));
                        }
                        System.out.println("Escolha o número do item que deseja remover: ");
                        int removerItem = sc.nextInt();

                        if (removerItem > 0 && removerItem <= listaProdutos.size()){
                            listaProdutos.remove(removerItem - 1);
                            System.out.println("item removido com sucesso! ");
                        }else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 4:
                    
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}