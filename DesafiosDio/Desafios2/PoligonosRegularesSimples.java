import java.util.Scanner;

public class PoligonosRegularesSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        String[] split = N.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        int P = Integer.parseInt(split[0  ]) * Integer.parseInt(split[1  ]);

        System.out.println( P    );
    }
}
