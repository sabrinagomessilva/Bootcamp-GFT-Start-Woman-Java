package startwoman.java.consultaCepNome.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import startwoman.java.consultaCepNome.model.Endereco;

@FeignClient(name = "sensoNome", url = "https://servicodados.ibge.gov.br/api/v2/censos/nomes/")
public interface NomeService {
	
	
	
	@GetMapping("/{nome}")
	String getCensoNome(@PathVariable("nome") String nome);
	 
}
