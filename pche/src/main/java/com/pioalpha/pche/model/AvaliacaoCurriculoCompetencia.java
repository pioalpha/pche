package com.pioalpha.pche.model;

import java.util.Date;

public class AvaliacaoCurriculoCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4559366278777527236L;

	private Long idAvaliacaoCurriculoCompetencia;
	private CurriculoCompetencia curriculoCompetencia;
	private Integer notaAvalizaco;
	private Date dataAvaliacao;
	
	public Long getIdAvaliacaoCurriculoCompetencia() {
		return idAvaliacaoCurriculoCompetencia;
	}

	public void setIdAvaliacaoCurriculoCompetencia(
			Long idAvaliacaoCurriculoCompetencia) {
		this.idAvaliacaoCurriculoCompetencia = idAvaliacaoCurriculoCompetencia;
	}

	public CurriculoCompetencia getCurriculoCompetencia() {
		return curriculoCompetencia;
	}

	public void setCurriculoCompetencia(CurriculoCompetencia curriculoCompetencia) {
		this.curriculoCompetencia = curriculoCompetencia;
	}

	public Integer getNotaAvalizaco() {
		return notaAvalizaco;
	}

	public void setNotaAvalizaco(Integer notaAvalizaco) {
		this.notaAvalizaco = notaAvalizaco;
	}

	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
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
