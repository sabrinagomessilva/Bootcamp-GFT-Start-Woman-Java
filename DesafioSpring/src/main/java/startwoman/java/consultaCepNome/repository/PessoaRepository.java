package startwoman.java.consultaCepNome.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import startwoman.java.consultaCepNome.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
