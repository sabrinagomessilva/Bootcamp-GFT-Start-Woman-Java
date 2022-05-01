package dio.colletctions;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("\n---\tOrdem Aleatória\t---");
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "fantasia", 25));

        }};


        System.out.println("\n---\tOrdem Natural (TempoEpisodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println(minhasSeries2);

        System.out.println("\n---\tOrdem Nome/Gênero/TempoEpisodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries1);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


    }
}

class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private Integer TempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        TempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return TempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", TempoEpisodio=" + TempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && TempoEpisodio.equals(serie.TempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, TempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),o.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(o.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
       int nome = s1.getNome().compareTo(s2.getNome());
       if (nome != 0) return nome;

       int genero = s1.getGenero().compareTo(s2.getGenero());
       if (genero != 0) return genero;

       return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}
