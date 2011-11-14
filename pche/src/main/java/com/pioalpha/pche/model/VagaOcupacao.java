package com.pioalpha.pche.model;

import java.util.Date;

public class VagaOcupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7185476851468345645L;

	private Long idVagaOcupacao;
	private Ocupacao ocupacao;
	private Date dataAlteracao;
	
	public Long getIdVagaOcupacao() {
		return idVagaOcupacao;
	}

	public void setIdVagaOcupacao(Long idVagaOcupacao) {
		this.idVagaOcupacao = idVagaOcupacao;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
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
