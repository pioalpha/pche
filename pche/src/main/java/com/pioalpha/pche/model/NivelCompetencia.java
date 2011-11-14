package com.pioalpha.pche.model;

import java.util.Date;

public class NivelCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8676560426579510389L;

	private Long idNivelCompetencia;
	private Integer ordem;
	private String descricao;
	private Date dataAlteracao;
	
	public Long getIdNivelCompetencia() {
		return idNivelCompetencia;
	}

	public void setIdNivelCompetencia(Long idNivelCompetencia) {
		this.idNivelCompetencia = idNivelCompetencia;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
