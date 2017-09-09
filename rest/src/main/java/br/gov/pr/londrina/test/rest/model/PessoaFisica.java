package br.gov.pr.londrina.test.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaFisica {
	private String nome;
	private Integer cpf;
	private List<Pet> pets;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Integer cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.pets = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

}
