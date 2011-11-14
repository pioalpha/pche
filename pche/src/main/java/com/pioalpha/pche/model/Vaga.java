package com.pioalpha.pche.model;

import java.util.Collection;

public class Vaga extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9113078852237659204L;
	
	private Long idVaga;
	private EnderecoCompleto enderecoCompleto;
	private Collection<VagaBeneficio> vagaBeneficios;
	private TipoContrato tipoContrato;
	private JornadaTrabalho jornadaTrabalho;
	private Collection<VagaCompetencia> vagaCompetencias;
	private Collection<VagaOcupacao> vagaOcupacoes;
	private Collection<VagaInteresseCurriculo> vagaInteresseCurriculos;
	private Escolaridade escolaridadeMinima;

	public Long getIdVaga() {
		return idVaga;
	}

	public void setIdVaga(Long idVaga) {
		this.idVaga = idVaga;
	}

	public EnderecoCompleto getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(EnderecoCompleto enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	public Collection<VagaBeneficio> getVagaBeneficios() {
		return vagaBeneficios;
	}

	public void setVagaBeneficios(Collection<VagaBeneficio> vagaBeneficios) {
		this.vagaBeneficios = vagaBeneficios;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public JornadaTrabalho getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public Collection<VagaCompetencia> getVagaCompetencias() {
		return vagaCompetencias;
	}

	public void setVagaCompetencias(Collection<VagaCompetencia> vagaCompetencias) {
		this.vagaCompetencias = vagaCompetencias;
	}

	public Collection<VagaOcupacao> getVagaOcupacoes() {
		return vagaOcupacoes;
	}

	public void setVagaOcupacoes(Collection<VagaOcupacao> vagaOcupacoes) {
		this.vagaOcupacoes = vagaOcupacoes;
	}

	public Collection<VagaInteresseCurriculo> getVagaInteresseCurriculos() {
		return vagaInteresseCurriculos;
	}

	public void setVagaInteresseCurriculos(
			Collection<VagaInteresseCurriculo> vagaInteresseCurriculos) {
		this.vagaInteresseCurriculos = vagaInteresseCurriculos;
	}

	public Escolaridade getEscolaridadeMinima() {
		return escolaridadeMinima;
	}

	public void setEscolaridadeMinima(Escolaridade escolaridadeMinima) {
		this.escolaridadeMinima = escolaridadeMinima;
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
