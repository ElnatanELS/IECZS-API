package br.com.congregacionalzonasul.IECZSAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.congregacionalzonasul.IECZSAPI.Domain.Membro;
import br.com.congregacionalzonasul.IECZSAPI.Repository.MembroRespository;

@Service
public class MembroService {
	
	@Autowired
	private MembroRespository membrorepository;
	
	public List<Membro> listarTodos() {
		return membrorepository.findAll();
	}
	
	public Membro Adicionar(Membro membro) {
		
		return membrorepository.save(membro);
		
	}
	
	

}
