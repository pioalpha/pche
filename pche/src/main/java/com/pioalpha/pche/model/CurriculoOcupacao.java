package com.pioalpha.pche.model;

import java.util.Date;

public class CurriculoOcupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5371348302211888922L;

	private Long idCurriculoOcupacao;
	private TipoOcupacao tipoOcupacao;
	private Ocupacao ocupacao;
	private Date dataAlteracao;
	
	public Long getIdCurriculoOcupacao() {
		return idCurriculoOcupacao;
	}

	public void setIdCurriculoOcupacao(Long idCurriculoOcupacao) {
		this.idCurriculoOcupacao = idCurriculoOcupacao;
	}

	public TipoOcupacao getTipoOcupacao() {
		return tipoOcupacao;
	}

	public void setTipoOcupacao(TipoOcupacao tipoOcupacao) {
		this.tipoOcupacao = tipoOcupacao;
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
