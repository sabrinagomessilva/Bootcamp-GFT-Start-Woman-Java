package banco.dio;

public class Cliente {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
	
}
