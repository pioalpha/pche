package com.pioalpha.pche.model;

import java.util.Collection;
import java.util.Date;

public class Curriculo extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2575059820945544658L;

	private String email;
	private Date dataNascimento;
	private Date mesAnoUltimoAcesso;
	private boolean contratado;
	private Double pretensaoSalarial;
	private Bairro bairro;
	private EstadoCivil estadoCivil;
	private Sexo sexo;
	private Deficiencia deficiencia;
	private Escolaridade escolaridade;
	private Collection<CurriculoOcupacao> curriculoOcupacoes;
	private Collection<CurriculoCursoGrade> curriculoCursosGrade;
	private Collection<CurriculoCompetencia> curriculoCompetencias;
	private Collection<CurriculoInteresseVaga> curriculoInteresseVagas;
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getMesAnoUltimoAcesso() {
		return mesAnoUltimoAcesso;
	}

	public void setMesAnoUltimoAcesso(Date mesAnoUltimoAcesso) {
		this.mesAnoUltimoAcesso = mesAnoUltimoAcesso;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

	public Double getPretensaoSalarial() {
		return pretensaoSalarial;
	}

	public void setPretensaoSalarial(Double pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Deficiencia getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(Deficiencia deficiencia) {
		this.deficiencia = deficiencia;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Collection<CurriculoOcupacao> getCurriculoOcupacoes() {
		return curriculoOcupacoes;
	}

	public void setCurriculoOcupacoes(
			Collection<CurriculoOcupacao> curriculoOcupacoes) {
		this.curriculoOcupacoes = curriculoOcupacoes;
	}

	public Collection<CurriculoCursoGrade> getCurriculoCursosGrade() {
		return curriculoCursosGrade;
	}

	public void setCurriculoCursosGrade(
			Collection<CurriculoCursoGrade> curriculoCursosGrade) {
		this.curriculoCursosGrade = curriculoCursosGrade;
	}

	public Collection<CurriculoCompetencia> getCurriculoCompetencias() {
		return curriculoCompetencias;
	}

	public void setCurriculoCompetencias(
			Collection<CurriculoCompetencia> curriculoCompetencias) {
		this.curriculoCompetencias = curriculoCompetencias;
	}

	public Collection<CurriculoInteresseVaga> getCurriculoInteresseVagas() {
		return curriculoInteresseVagas;
	}

	public void setCurriculoInteresseVagas(
			Collection<CurriculoInteresseVaga> curriculoInteresseVagas) {
		this.curriculoInteresseVagas = curriculoInteresseVagas;
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
