package com.pioalpha.pche.model;

import java.util.Date;

public class VagaInteresseCurriculo extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1773517841994242618L;

	private Long idVagaInteresseCurriculo;
	private Curriculo curriculo;
	private Date dataAlteração;
	private Date dataEmailEnviado;
	
	public Long getIdVagaInteresseCurriculo() {
		return idVagaInteresseCurriculo;
	}

	public void setIdVagaInteresseCurriculo(Long idVagaInteresseCurriculo) {
		this.idVagaInteresseCurriculo = idVagaInteresseCurriculo;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	public Date getDataAlteração() {
		return dataAlteração;
	}

	public void setDataAlteração(Date dataAlteração) {
		this.dataAlteração = dataAlteração;
	}

	public Date getDataEmailEnviado() {
		return dataEmailEnviado;
	}

	public void setDataEmailEnviado(Date dataEmailEnviado) {
		this.dataEmailEnviado = dataEmailEnviado;
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
