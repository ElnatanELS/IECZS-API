package br.com.congregacionalzonasul.IECZSAPI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.congregacionalzonasul.IECZSAPI.Domain.Membro;

@Repository
public interface MembroRespository extends MongoRepository<Membro, String> {

}
