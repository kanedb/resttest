package br.gov.pr.londrina.test.rest.model;

import java.util.Date;

public class Pet {
	private String nome;
	private EnumTipoPet tipo;
	private Date dtNascimento;

	public Pet() {
		super();
	}

	public Pet(String nome, EnumTipoPet tipo, Date dtNascimento) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.dtNascimento = dtNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnumTipoPet getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoPet tipo) {
		this.tipo = tipo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
