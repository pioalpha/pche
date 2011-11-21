package com.pioalpha.pche.model;

import java.util.Collection;

public class Administrador extends Candidato {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8684078574624147337L;
	
	private Collection<Estado> estados;
	private Collection<TipoLogradouro> tiposLogradouro;
	private Collection<EstadoCivil> estadosCiveis;
	private Collection<Deficiencia> deficiencias;
	private Collection<Sexo> sexos;
	private Collection<Escolaridade> escolaridades;
	private Collection<CategoriaCompetencia> categoriasCompetencia;
	private Collection<AreaOcupacao> areasOcupacao;
	private Collection<EscolaridadeOcupacao> escolaridadesOcupacao;
	private Collection<Beneficio> beneficios;
	private Collection<OcupacaoCompetencia> ocupacaoCompetencias;
	
	public Collection<Estado> getEstados() {
		return estados;
	}

	public void setEstados(Collection<Estado> estados) {
		this.estados = estados;
	}

	public Collection<TipoLogradouro> getTiposLogradouro() {
		return tiposLogradouro;
	}

	public void setTiposLogradouro(Collection<TipoLogradouro> tiposLogradouro) {
		this.tiposLogradouro = tiposLogradouro;
	}

	public Collection<EstadoCivil> getEstadosCiveis() {
		return estadosCiveis;
	}

	public void setEstadosCiveis(Collection<EstadoCivil> estadosCiveis) {
		this.estadosCiveis = estadosCiveis;
	}

	public Collection<Deficiencia> getDeficiencias() {
		return deficiencias;
	}

	public void setDeficiencias(Collection<Deficiencia> deficiencias) {
		this.deficiencias = deficiencias;
	}

	public Collection<Sexo> getSexos() {
		return sexos;
	}

	public void setSexos(Collection<Sexo> sexos) {
		this.sexos = sexos;
	}

	public Collection<Escolaridade> getEscolaridades() {
		return escolaridades;
	}

	public void setEscolaridades(Collection<Escolaridade> escolaridades) {
		this.escolaridades = escolaridades;
	}

	public Collection<CategoriaCompetencia> getCategoriasCompetencia() {
		return categoriasCompetencia;
	}

	public void setCategoriasCompetencia(
			Collection<CategoriaCompetencia> categoriasCompetencia) {
		this.categoriasCompetencia = categoriasCompetencia;
	}

	public Collection<AreaOcupacao> getAreasOcupacao() {
		return areasOcupacao;
	}

	public void setAreasOcupacao(Collection<AreaOcupacao> areasOcupacao) {
		this.areasOcupacao = areasOcupacao;
	}

	public Collection<EscolaridadeOcupacao> getEscolaridadesOcupacao() {
		return escolaridadesOcupacao;
	}

	public void setEscolaridadesOcupacao(
			Collection<EscolaridadeOcupacao> escolaridadesOcupacao) {
		this.escolaridadesOcupacao = escolaridadesOcupacao;
	}

	public Collection<Beneficio> getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(Collection<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}

	public Collection<OcupacaoCompetencia> getOcupacaoCompetencias() {
		return ocupacaoCompetencias;
	}

	public void setOcupacaoCompetencias(
			Collection<OcupacaoCompetencia> ocupacaoCompetencias) {
		this.ocupacaoCompetencias = ocupacaoCompetencias;
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
