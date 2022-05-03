package dio.com.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int quantidadeNumero = 0;
        int totalPar = 0;
        int totalImpar = 0;

        int count = 0;

        System.out.println("Informe o quantidade: ");
        quantidadeNumero = scan.nextInt();

        for (int i = 0; i < quantidadeNumero; i++) {

            System.out.println("Informe numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) {
                totalPar++;

            }else {
                totalImpar++;
            }
        }
        System.out.println("A quantidade de números pares é: " +totalPar);
        System.out.println("A quantidade de números ímpares é: " +totalImpar);

    }
}
