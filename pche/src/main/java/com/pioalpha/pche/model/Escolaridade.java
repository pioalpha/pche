package com.pioalpha.pche.model;

public class Escolaridade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5397699812030187478L;

	private Long idEscolaridade;
	private Integer ordem;
	private String nome;
		
	public Long getIdEscolaridade() {
		return idEscolaridade;
	}

	public void setIdEscolaridade(Long idEscolaridade) {
		this.idEscolaridade = idEscolaridade;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
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
