/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex5;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Ex5 {

    public static void main(String[] args) {
       int qtd, salario;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite a quantidade de moveis vendidos: ");
        qtd = entrada.nextInt();
        salario = 1000+(50*qtd);
         System.out.println("Quantidade vendida: " + qtd);
          System.out.println("Salário do funcionário: " + salario);
    }
}
