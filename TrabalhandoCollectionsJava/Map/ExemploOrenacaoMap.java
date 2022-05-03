package dio.colletctions.Map;

import java.util.*;

public class ExemploOrenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livros> meusLivros = new HashMap<>() {{
            put(" Carroll, Lewis", new Livros("Alice no País das Maravilhas", 224 ));
            put(" Orwell, George", new Livros("1984", 379 ));
            put(" Osho, Osho", new Livros("O barco Vazio", 361 ));
            put(" Lispector, Clarice", new Livros("A hora da Estrela", 90 ));
        }};

        for (Map.Entry<String, Livros> livro: meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNomes());

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>() {{
            put(" Carroll, Lewis", new Livros("Alice no País das Maravilhas", 224 ));
            put(" Orwell, George", new Livros("1984", 379 ));
            put(" Rajneesh, Osho", new Livros("O barco Vazio", 361 ));
            put(" Lispector, Clarice", new Livros("A hora da Estrela", 90 ));
        }};

        for (Map.Entry<String, Livros> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomes());

        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomes());

        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomes());


    }

}

class Livros {
    String nomes;
    Integer paginas;

    public Livros(String nomes, Integer paginas) {
        this.nomes = nomes;
        this.paginas = paginas;
    }

    public String getNomes() {
        return nomes;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nomes.equals(livros.nomes) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomes, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nomes='" + nomes + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNomes().compareToIgnoreCase(l2.getValue().getNomes());
    }
}
