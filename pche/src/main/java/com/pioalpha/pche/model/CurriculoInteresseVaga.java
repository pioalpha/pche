package com.pioalpha.pche.model;

import java.util.Date;

public class CurriculoInteresseVaga extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 847309230322622173L;

	private Long idCurriculoInteresseVaga;
	private Vaga vaga;
	private Date dataAlteracao;
	
	public Long getIdCurriculoInteresseVaga() {
		return idCurriculoInteresseVaga;
	}

	public void setIdCurriculoInteresseVaga(Long idCurriculoInteresseVaga) {
		this.idCurriculoInteresseVaga = idCurriculoInteresseVaga;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
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
