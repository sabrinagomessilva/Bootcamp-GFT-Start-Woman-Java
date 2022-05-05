import java.util.Scanner;

public class DesafioCoxinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite total coxinha e total participantes: ");
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        double media = Double.parseDouble( inputSplit[0]
        )/Double.parseDouble(      inputSplit[1]         );

        System.out.printf("%.2f",    media   );
    }
}
