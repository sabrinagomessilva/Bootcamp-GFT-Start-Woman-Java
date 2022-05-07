package startwoman.java.consultaCepNome.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import startwoman.java.consultaCepNome.model.Endereco;
import startwoman.java.consultaCepNome.model.Pessoa;
import startwoman.java.consultaCepNome.repository.EnderecoRepository;
import startwoman.java.consultaCepNome.repository.PessoaRepository;



/**
 * Implementação da <b>Strategy</b> {@link PessoaService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
@Service
public class PessoaServiceImpl implements PessoaService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private CepService cepService;
	
	@Autowired
	private NomeService nomeService;
	
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Pessoa> buscarTodos() {
		// Buscar todos os registro de pessoas.
		return pessoaRepository.findAll();
	}

	@Override
	public Pessoa buscarPorId(Long id) {
		// Buscar Pessoa por ID.
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		if(!pessoa.isEmpty()) {
			return pessoa.get();
		}
		return null;
	}

	@Override
	public void inserir(Pessoa pessoa) {
		salvarPessoaComCep(pessoa);
	}

	@Override
	public void atualizar(Long id, Pessoa pessoa) {
		// Buscar Pessoa por ID, caso exista:
		Optional<Pessoa> pessoaBd = pessoaRepository.findById(id);
		if (pessoaBd.isPresent()) {
			salvarPessoaComCep(pessoa);
		}
	}

	@Override
	public void deletar(Long id) {
		// Deletar Pessoa por ID.
		pessoaRepository.deleteById(id);
	}

	private void salvarPessoaComCep(Pessoa pessoa) {
		// Verificar se o Endereco do Pessoa já existe (pelo CEP).
		String cep = pessoa.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			Endereco novoEndereco = cepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		pessoa.setEndereco(endereco);
		// Inserir Pessoa, vinculando o Endereco (novo ou existente).
		pessoaRepository.save(pessoa);
	}

	@Override
	public String getCensoNome(String nome) {
		return nomeService.getCensoNome(nome);
	}

	
	
}
