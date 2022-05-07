package startwoman.java.consultaCepNome.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import startwoman.java.consultaCepNome.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface CepService {
	
	
	
	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
	 
}
