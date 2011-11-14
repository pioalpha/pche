package com.pioalpha.pche.model;

import java.util.Date;

public class VagaCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2687731551097402450L;
	
	private Long idVagaCompetencia;
	private Competencia competencia;
	private NivelCompetencia nivelCompetenciaMinimo;
	private NivelCompetencia nivelCompetenciaDiferencial;
	private Date dataAlteracao;

	public Long getIdVagaCompetencia() {
		return idVagaCompetencia;
	}

	public void setIdVagaCompetencia(Long idVagaCompetencia) {
		this.idVagaCompetencia = idVagaCompetencia;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public NivelCompetencia getNivelCompetenciaMinimo() {
		return nivelCompetenciaMinimo;
	}

	public void setNivelCompetenciaMinimo(NivelCompetencia nivelCompetenciaMinimo) {
		this.nivelCompetenciaMinimo = nivelCompetenciaMinimo;
	}

	public NivelCompetencia getNivelCompetenciaDiferencial() {
		return nivelCompetenciaDiferencial;
	}

	public void setNivelCompetenciaDiferencial(
			NivelCompetencia nivelCompetenciaDiferencial) {
		this.nivelCompetenciaDiferencial = nivelCompetenciaDiferencial;
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
