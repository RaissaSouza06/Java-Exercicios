/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex6;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Ex6 {

    public static void main(String[] args) {
       float valor_parcela, taxa_juros, valor_atraso;
       int tempo;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o valor da parcela: ");
        valor_parcela = entrada.nextFloat();
        System.out.println("Digite o valor da taxa de juros: ");
        taxa_juros = entrada.nextFloat();
        System.out.println("Digite quantos meses a parcela esta em atraso: ");
        tempo = entrada.nextInt();
        valor_atraso = valor_parcela+(valor_parcela*(taxa_juros/100)*tempo);
         System.out.println("Valor do atraso: " + valor_atraso);
    }
}
