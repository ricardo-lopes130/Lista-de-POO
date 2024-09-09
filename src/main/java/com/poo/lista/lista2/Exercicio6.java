package com.poo.lista.lista2;

import java.util.Scanner;

/*6) Crie um programa que receba as notas de um aluno e informe se ele foi
aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
provas ele passou. Senão o programa deverá perguntar a nota de recuperação
que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
somente para os alunos que precisarem.*/

public class Exercicio6 {
    public static void resolucao2(){
        //Código de resolução: Exercicio6.resolucao2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;
        if(media >= 6){
            System.out.println("Aprovado!!!");
        }
        else{
            System.out.println("Recuperação.");
            double menorNota = (nota1<nota2)? nota1:nota2;
            System.out.println("Insira a nota da recuperação: ");
            double recuperacao = sc.nextDouble();
            double mediaRecuperacao = (recuperacao + Math.max(nota1,nota2)/2);
            if(mediaRecuperacao>=6){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado.");
            }
        }
    sc.close();
    }     

}
