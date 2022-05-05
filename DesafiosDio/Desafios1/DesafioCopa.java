import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DesafioCopa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite quantidade de total de figurinhas: ");
        int numTotal = scan.nextInt();
        System.out.println("\nDigite a quantidade de figuras compradas: ");
        int numFigCompradas = scan.nextInt();
        Set<Integer> setFig = new HashSet<>();
//TODO: Complete os espaços em branco com uma solução possível para o problema
        for (   int i = 0; i < numFigCompradas; i++) {
            System.out.println("\nDigite número da figurinha " + (i +1));
            setFig.add(scan.nextInt());


        }
        System.out.println("\nFaltam: " + (numTotal - setFig.size()));
    }
}

