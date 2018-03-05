package br.com.congregacionalzonasul.IECZSAPI.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.congregacionalzonasul.IECZSAPI.Domain.Membro;

public interface MembroRespository extends MongoRepository<Membro, String> {

}
