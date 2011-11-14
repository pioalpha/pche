package com.pioalpha.pche.model;

import java.util.Collection;

public class Cidade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2597659760922635305L;

	private Long idCidade;
	private String nome;
	private Collection<Bairro> bairro;
	
	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Bairro> getBairro() {
		return bairro;
	}

	public void setBairro(Collection<Bairro> bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
