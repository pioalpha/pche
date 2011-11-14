package com.pioalpha.pche.model;

import java.util.Collection;

public class Estado extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4681323152941636545L;
	
	private Long idEstado;
	private String nome;
	private String sigla;
	Collection<Cidade> cidade;
	
	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Collection<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(Collection<Cidade> cidade) {
		this.cidade = cidade;
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
