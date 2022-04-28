package dio.com.exercicios.loops;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

import static java.lang.System.*;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //leia

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome do aluno: ");
            nome = scan.next(); //irá capturar o nome e atribuí-lo à variável nome
            if (nome.equals("0")) break;
            System.out.println("Idade do aluno: ");
            idade = scan.nextInt();

        }

        System.out.println("Fim");
        //queremos que o programe peça nome e idade até que seja digitado o 0. Faremos isso com comendo while

    }
}
