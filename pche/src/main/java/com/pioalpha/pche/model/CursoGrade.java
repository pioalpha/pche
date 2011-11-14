package com.pioalpha.pche.model;

import java.util.Collection;

public class CursoGrade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5946979130365392955L;

	private Long idCursoGrade;
	private Collection<CursoGradeCompetencia> cursoGradeCompetencia;
	private Integer ano;
	
	public Long getIdCursoGrade() {
		return idCursoGrade;
	}

	public void setIdCursoGrade(Long idCursoGrade) {
		this.idCursoGrade = idCursoGrade;
	}

	public Collection<CursoGradeCompetencia> getCursoGradeCompetencia() {
		return cursoGradeCompetencia;
	}

	public void setCursoGradeCompetencia(
			Collection<CursoGradeCompetencia> cursoGradeCompetencia) {
		this.cursoGradeCompetencia = cursoGradeCompetencia;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
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
