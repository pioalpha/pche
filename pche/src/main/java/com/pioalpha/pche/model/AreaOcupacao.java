package com.pioalpha.pche.model;

import java.util.Collection;

public class AreaOcupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2584428241055578142L;

	private Long idAreaOcupacao;
	private String nome;
	private String descricao;
	private Collection<Ocupacao> ocupacoes;
	
	public Long getIdAreaOcupacao() {
		return idAreaOcupacao;
	}

	public void setIdAreaOcupacao(Long idAreaOcupacao) {
		this.idAreaOcupacao = idAreaOcupacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Collection<Ocupacao> getOcupacoes() {
		return ocupacoes;
	}

	public void setOcupacoes(Collection<Ocupacao> ocupacoes) {
		this.ocupacoes = ocupacoes;
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
