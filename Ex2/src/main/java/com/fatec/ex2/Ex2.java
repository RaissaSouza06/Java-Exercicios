/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex2;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex2 {

    public static void main(String[] args) {
        double litros,valorlitros;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o numero de litros: ");
        litros = entrada.nextDouble();
        valorlitros = litros*5.39;
        System.out.println("O valor a ser pago eh: " + valorlitros);
    }
}
