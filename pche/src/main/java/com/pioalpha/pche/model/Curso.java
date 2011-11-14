package com.pioalpha.pche.model;

import java.util.Collection;

public class Curso extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6794682098623817847L;

	private Long idCurso;
	private String nome;
	private Collection<CursoGrade> cursoGrade;
	private Escolaridade escolaridadeMinima;
		
	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<CursoGrade> getCursoGrade() {
		return cursoGrade;
	}

	public void setCursoGrade(Collection<CursoGrade> cursoGrade) {
		this.cursoGrade = cursoGrade;
	}
	
	public Escolaridade getEscolaridadeMinima() {
		return escolaridadeMinima;
	}

	public void setEscolaridadeMinima(Escolaridade escolaridadeMinima) {
		this.escolaridadeMinima = escolaridadeMinima;
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
