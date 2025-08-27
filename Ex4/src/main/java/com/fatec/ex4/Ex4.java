/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex4;
import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class Ex4 {

    public static void main(String[] args) {
        float lado1,lado2, area, perimetro;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite o valor do lado1: ");
        lado1 = entrada.nextFloat();
        System.out.println("Digite o valor do lado2: ");
        lado2 = entrada.nextFloat();
        area = lado1*lado2;
        System.out.println("O valor da area do retangulo: " + area);
        perimetro = (2*lado1)+(2*lado2);
        System.out.println("O valor do perimetro do retangulo: " + perimetro);
    }
}
