package br.dio.com.arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //Primeiro criar classe Random para gerar n. aleatórios
        Scanner scan = new Scanner(System.in);

        //Segundo criar um array para guardar números aleatórios
        int[] numerosAleatorios = new int [20];


        //colocar valor dentro dos numeros aleatórios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

            System.out.print("Numeros Aleatórios: ");
            for ( int numero: numerosAleatorios ) {
                System.out.print(numero + "-");

            }
        System.out.print("\nAntecessores dos Numeros Aleatórios: ");
        for ( int numero: numerosAleatorios ) {
            System.out.print((numero - 1) + "-");

        }

        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for ( int numero: numerosAleatorios ) {
            System.out.print((numero +1) + "-");


        }

    }
}
