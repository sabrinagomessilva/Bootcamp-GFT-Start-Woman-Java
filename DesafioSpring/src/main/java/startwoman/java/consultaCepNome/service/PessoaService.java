package startwoman.java.consultaCepNome.service;

import startwoman.java.consultaCepNome.model.Pessoa;

public interface PessoaService {

	void inserir(Pessoa pessoa);

	Iterable<Pessoa> buscarTodos();

	Pessoa buscarPorId(Long id);

	void atualizar(Long id, Pessoa pessoa);

	void deletar(Long id);

	String getCensoNome(String nome);

}
