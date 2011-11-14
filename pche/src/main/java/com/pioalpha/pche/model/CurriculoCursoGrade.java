package com.pioalpha.pche.model;

import java.util.Date;

public class CurriculoCursoGrade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4816915056705673396L;

	private Long idCurriculoCursoGrade;
	private CursoGrade cursoGrade;
	private Date dataAlteracao;
	
	public Long getIdCurriculoCursoGrade() {
		return idCurriculoCursoGrade;
	}

	public void setIdCurriculoCursoGrade(Long idCurriculoCursoGrade) {
		this.idCurriculoCursoGrade = idCurriculoCursoGrade;
	}

	public CursoGrade getCursoGrade() {
		return cursoGrade;
	}

	public void setCursoGrade(CursoGrade cursoGrade) {
		this.cursoGrade = cursoGrade;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
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
