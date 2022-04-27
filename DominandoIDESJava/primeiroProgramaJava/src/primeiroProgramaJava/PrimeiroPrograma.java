package primeiroProgramaJava;

import primeiroProgramaJava.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		
		System.out.print(gato);
		System.out.print(livros);
		
		
		/*int a = 2;
		int b = 3;
		
		System.out.print("Hello Word! " + (a+b));*/

	}

}

class Livros {
	private String nome;
	private String npage;
}
