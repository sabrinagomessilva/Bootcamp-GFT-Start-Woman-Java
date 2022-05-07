package startwoman.java.consultaCepNome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import startwoman.java.consultaCepNome.model.Pessoa;
import startwoman.java.consultaCepNome.service.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@PostMapping
	public ResponseEntity<Pessoa> inserir(@RequestBody Pessoa pessoa) {
		pessoaService.inserir(pessoa);
		return ResponseEntity.ok(pessoa);
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Pessoa>> buscarTodos() {
		Iterable<Pessoa> listaPessoas = pessoaService.buscarTodos();
		return ResponseEntity.ok(listaPessoas);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
		Pessoa pessoa = pessoaService.buscarPorId(id);
		return ResponseEntity.ok(pessoa);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
		pessoaService.atualizar(id, pessoa);
		return ResponseEntity.ok(pessoa);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		pessoaService.deletar(id);
		return ResponseEntity.ok().build();
	}
	
	//===============================================================
	
	@GetMapping("/censo/{nome}")
	public ResponseEntity<String> getCensoNome(@PathVariable String nome) {
		return ResponseEntity.ok(pessoaService.getCensoNome(nome));
	}
	
}
