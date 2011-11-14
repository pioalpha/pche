package com.pioalpha.pche.model;

import java.util.Date;

public class OcupacaoCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3440809746832559038L;

	private Long idOcupacaoCompetencia;
	private Ocupacao ocupacao;
	private Competencia competencia;
	private Date dataAlteracao;
	
	public Long getIdOcupacaoCompetencia() {
		return idOcupacaoCompetencia;
	}

	public void setIdOcupacaoCompetencia(Long idOcupacaoCompetencia) {
		this.idOcupacaoCompetencia = idOcupacaoCompetencia;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
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
