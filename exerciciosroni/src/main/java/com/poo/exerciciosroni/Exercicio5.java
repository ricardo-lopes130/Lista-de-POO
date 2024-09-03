package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {
        /*5) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra. Escreva um
algoritmo que leia o total de horas normais trabalhadas e o total de horas extras trabalhadas por um
empregado em um ano e calcule o salário anual deste trabalhador.

Exemplo : Entrada : Digite o número de horas trabalhadas no ano : 1760

Digite o número de horas extras trabalhadas no ano : 400

Saída : Seu salário anual é de : R$ 23600 */
        Scanner sc = new Scanner(System.in);

        double valorNormalTrabalhada = 10.00;
        double valorHoraExtra = 15.00;
        int horaNormal;
        int horaExtra;
        double salario;

        System.out.println("Escreva o número de horas trabalhadas no ano: ");
        horaNormal = sc.nextInt();

        System.out.println("Escreva o número de horas extras trabalhadas no ano: ");
        horaExtra = sc.nextInt();

        salario =(valorNormalTrabalhada * horaNormal) + (valorHoraExtra * horaExtra);
        System.out.println("Seu salário anual é de: "+ salario);

    sc.close();
    } 
}
