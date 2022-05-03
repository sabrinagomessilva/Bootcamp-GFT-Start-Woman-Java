package dio.colletctions;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d)); // indexOf irá mostrar a nota dessa posição

        //add nota em uma posição

        System.out.println("\nAdcione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0 );
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5.0)); //notas.contains(5.0) irá verificar e retornar boolean;

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        //é só imprimir, professora fez com foreach

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        //Exiba a soma dos valores: para isso faremos com o iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média dos valores: " + (soma/notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0.0);

        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0: ");
        notas.remove(0);

        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
