/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudação;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class IMC {

    public static void main(String[] args) {
        String nome ;
        double altura;
        double peso;
        
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu Nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua Altura:");
        altura = leia.nextDouble();
        System.out.println("Informe seu Peso:");
        peso = leia.nextDouble();

        double imc;
        imc = peso / (altura * altura);

        if (imc < 18.5) {

            System.out.print("Abaixo do peso ");
        } else if (imc >= 18.6 && imc <= 24.9) {

            System.out.print("Saudavel ");
        } else if (imc >= 25 && imc <= 29.9) {

            System.out.print("Peso em excesso ");
        } else if (imc >= 30 && imc <= 34.9) {

            System.out.print("Obesidade Grau I ");
        } else if (imc >= 35 && imc <= 39.9) {

            System.out.print("Obesidade Grau II ");
        } else {

            System.out.print("Obesidade Grau III ");
            }

            System.out.println("Seu IMC é:" + imc);

        }
    }


