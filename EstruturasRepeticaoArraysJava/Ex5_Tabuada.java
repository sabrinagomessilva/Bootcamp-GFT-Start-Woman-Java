package dio.com.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicador = 0;
        int multiplicando = 0;
        int resultado = 0;

        System.out.println("Digite número: ");
        multiplicador = scan.nextInt();

       for (multiplicando = 0; multiplicando <=10; multiplicando++ ){
           resultado = multiplicador * multiplicando;

           System.out.println();
           System.out.printf(" %s x %s = %s " , multiplicador, multiplicando, resultado );

       }
    }
}
