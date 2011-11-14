package com.pioalpha.pche.model;

import java.util.Date;

public class VagaBeneficio extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9062098694607142843L;

	private Long idVagaBeneficio;
	private String detalhe;
	private Date dataAlteracao;
	
	public Long getIdVagaBeneficio() {
		return idVagaBeneficio;
	}

	public void setIdVagaBeneficio(Long idVagaBeneficio) {
		this.idVagaBeneficio = idVagaBeneficio;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
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
