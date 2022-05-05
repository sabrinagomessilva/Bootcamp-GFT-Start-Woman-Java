import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        double media = ((nota1 *  2   ) + (nota2 *   3 ) + (nota3 *  5  )) / (2+3+5);
        System.out.printf("MEDIA = %.1f", media);
    }
}