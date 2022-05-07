package startwoman.java.consultaCepNome.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import startwoman.java.consultaCepNome.model.Endereco;

@Repository
public interface EnderecoRepository  extends CrudRepository<Endereco, String> {

}
