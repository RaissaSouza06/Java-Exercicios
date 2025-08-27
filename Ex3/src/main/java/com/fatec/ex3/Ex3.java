/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex3;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex3 {

    public static void main(String[] args) {
        String nome;
        int qtd;
        float preco, total;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o nome do produto: ");
        nome = entrada.next();
        System.out.println("Digite a quantidade comprada: ");
        qtd = entrada.nextInt();
        System.out.println("Digite o preco do produto: ");
        preco = entrada.nextFloat();
        total=qtd*preco;
        System.out.println("Nome do produto: " + nome);
        System.out.println("Total a pagar: R$ " + total);
        
    }
}
