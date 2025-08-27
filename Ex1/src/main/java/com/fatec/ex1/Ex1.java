/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex1;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex1 {

    public static void main(String[] args) {
        double salario, percentual, novoSalario;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o salario: ");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor do percentual de reajuste: ");
        percentual = entrada.nextDouble();
        novoSalario = salario+(salario*percentual)/100;
        System.out.println("O resultado do novo salario eh: " + novoSalario);
    }
}
