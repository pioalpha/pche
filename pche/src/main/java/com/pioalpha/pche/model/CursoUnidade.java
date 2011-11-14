package com.pioalpha.pche.model;

public class CursoUnidade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4525904151322314218L;

	private Long idCursoUnidade;
	private Curso curso;
	private Unidade unidade;
	
	public Long getIdCursoUnidade() {
		return idCursoUnidade;
	}

	public void setIdCursoUnidade(Long idCursoUnidade) {
		this.idCursoUnidade = idCursoUnidade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
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
