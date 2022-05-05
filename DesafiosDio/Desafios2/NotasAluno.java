import java.util.Scanner;

public class NotasAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = input.nextDouble();
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        double media = ((nota1 *  2   ) + (nota2 *   3 ) + (nota3 *  5  )) / (2+3+5);
        System.out.printf("A média do Aluno é = %.1f", media);
    }
}
