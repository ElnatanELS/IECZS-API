package br.com.congregacionalzonasul.IECZSAPI.Domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Membros")
public class Membro {
	
	@Id
	private String id;
	
	private String nome;
	
	private Long rg;
	
	private Date dataDeNascimento;
	
	private List<String> departamentos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@OneToMany
	public List<String> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<String> departamentos) {
		this.departamentos = departamentos;
	}
	
	

}
