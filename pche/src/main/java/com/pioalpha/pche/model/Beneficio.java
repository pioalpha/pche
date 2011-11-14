package com.pioalpha.pche.model;

public class Beneficio extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8370071020233739075L;

	private Long idBeneficio;
	private String nome;
	
	public Long getIdBeneficio() {
		return idBeneficio;
	}

	public void setIdBeneficio(Long idBeneficio) {
		this.idBeneficio = idBeneficio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
