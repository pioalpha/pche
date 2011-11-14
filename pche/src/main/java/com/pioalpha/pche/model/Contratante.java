package com.pioalpha.pche.model;

import java.util.Collection;

@SuppressWarnings("serial")
public abstract class Contratante extends ObjetoBase{

	private Long idContratante;
	private String telefone;
	private Collection<AvaliacaoCurriculoCompetencia> avaliacoesCurriculoCompetencia;
	private Collection<Vaga> vagas;
	
	public Long getIdContratante() {
		return idContratante;
	}

	public void setIdContratante(Long idContratante) {
		this.idContratante = idContratante;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Collection<AvaliacaoCurriculoCompetencia> getAvaliacoesCurriculoCompetencia() {
		return avaliacoesCurriculoCompetencia;
	}

	public void setAvaliacoesCurriculoCompetencia(
			Collection<AvaliacaoCurriculoCompetencia> avaliacoesCurriculoCompetencia) {
		this.avaliacoesCurriculoCompetencia = avaliacoesCurriculoCompetencia;
	}

	public Collection<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(Collection<Vaga> vagas) {
		this.vagas = vagas;
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
