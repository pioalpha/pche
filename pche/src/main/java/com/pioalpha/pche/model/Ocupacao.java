package com.pioalpha.pche.model;

public class Ocupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9150820261351718140L;

	private Long idOcupacao;
	private String nome;
	private String descricao;
	
	public Long getIdOcupacao() {
		return idOcupacao;
	}

	public void setIdOcupacao(Long idOcupacao) {
		this.idOcupacao = idOcupacao;
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
