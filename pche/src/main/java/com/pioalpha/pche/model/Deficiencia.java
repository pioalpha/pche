package com.pioalpha.pche.model;

public class Deficiencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6827163936701550395L;
	
	private Long idDeficiencia;
	private String nome;
		
	public Long getIdDeficiencia() {
		return idDeficiencia;
	}

	public void setIdDeficiencia(Long idDeficiencia) {
		this.idDeficiencia = idDeficiencia;
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
