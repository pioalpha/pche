package com.pioalpha.pche.model;

import java.util.Date;

public class CurriculoCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3689804572670662566L;

	private Long idCurriculoCompetencia;
	private Competencia competencia;
	private NivelCompetencia nivelCompetencia;
	private Date dataAlteracao;
	private boolean visivel;
	
	public Long getIdCurriculoCompetencia() {
		return idCurriculoCompetencia;
	}

	public void setIdCurriculoCompetencia(Long idCurriculoCompetencia) {
		this.idCurriculoCompetencia = idCurriculoCompetencia;
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

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
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
