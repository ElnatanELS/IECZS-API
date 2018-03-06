package br.com.congregacionalzonasul.IECZSAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.congregacionalzonasul.IECZSAPI.Domain.Membro;
import br.com.congregacionalzonasul.IECZSAPI.service.MembroService;

@Controller
@RestController("/Membro")
public class MembroController {
	
	@Autowired
	private MembroService membroService;
	
	@GetMapping
	public List<Membro> listar() {
		
		return membroService.listarTodos();
		
	}
	
	@PostMapping
	public Membro addMembro(@RequestBody Membro membro) {
		
		return membroService.Adicionar(membro);
		
	}

}
