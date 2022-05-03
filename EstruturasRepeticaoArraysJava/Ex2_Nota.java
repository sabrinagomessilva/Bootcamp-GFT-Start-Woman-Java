package dio.com.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a Nota: ");
        nota = scan.nextInt();

        System.out.println("Nota informada: " + nota);




        while ( nota < 0 || nota >10){
            System.out.println("Nota Inválida, Digite novamente");
            nota = scan.nextInt();

        }
        System.out.println("Fim");
    }


}
