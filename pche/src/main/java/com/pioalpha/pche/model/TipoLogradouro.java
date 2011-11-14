package com.pioalpha.pche.model;

public class TipoLogradouro extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4460264935869295057L;

	private Long idTipoLogradouro;
	private String nome;
	private String sigla;
	
	
	public Long getIdTipoLogradouro() {
		return idTipoLogradouro;
	}

	public void setIdTipoLogradouro(Long idTipoLogradouro) {
		this.idTipoLogradouro = idTipoLogradouro;
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
