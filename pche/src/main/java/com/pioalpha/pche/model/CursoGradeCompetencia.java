package com.pioalpha.pche.model;

import java.util.Date;

public class CursoGradeCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3560435913611491463L;

	private Long idCursoGradeCompetencia;
	private Competencia competencia;
	private NivelCompetencia nivelCompetencia;
	private Date dataAlteracao;
	
	public Long getIdCursoGradeCompetencia() {
		return idCursoGradeCompetencia;
	}

	public void setIdCursoGradeCompetencia(Long idCursoGradeCompetencia) {
		this.idCursoGradeCompetencia = idCursoGradeCompetencia;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public NivelCompetencia getNivelCompetencia() {
		return nivelCompetencia;
	}

	public void setNivelCompetencia(NivelCompetencia nivelCompetencia) {
		this.nivelCompetencia = nivelCompetencia;
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
