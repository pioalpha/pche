package com.pioalpha.pche.model;

import java.util.Date;

public class EscolaridadeOcupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8192586033172285315L;

	private Long idEscolaridadeOcupacao;
	private Escolaridade escolaridadeMinima;
	private Ocupacao ocupacao;
	private Date dataAlteracao;
	
	public Long getIdEscolaridadeOcupacao() {
		return idEscolaridadeOcupacao;
	}

	public void setIdEscolaridadeOcupacao(Long idEscolaridadeOcupacao) {
		this.idEscolaridadeOcupacao = idEscolaridadeOcupacao;
	}

	public Escolaridade getEscolaridadeMinima() {
		return escolaridadeMinima;
	}

	public void setEscolaridadeMinima(Escolaridade escolaridadeMinima) {
		this.escolaridadeMinima = escolaridadeMinima;
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
