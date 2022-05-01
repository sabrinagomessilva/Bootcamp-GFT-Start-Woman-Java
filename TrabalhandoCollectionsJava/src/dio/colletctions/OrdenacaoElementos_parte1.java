package dio.colletctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoElementos_parte1 {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Kurt", 17, "amarelo"));
            add(new Gato("Tesla", 7, "preto"));
            add(new Gato("Kurt", 4, "cinza"));
        }};

        //mostrar ordem de inserção
        System.out.println("\n---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem de aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem Idade\t---");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem Cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gt1, Gato gt2) {
        return Integer.compare(gt1.getIdade(), gt2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gt1, Gato gt2) {
        return gt1.getCor().compareToIgnoreCase(gt2.getCor());
    }
}

class  ComparatorNomeCorIdade implements Comparator<Gato> {


    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}