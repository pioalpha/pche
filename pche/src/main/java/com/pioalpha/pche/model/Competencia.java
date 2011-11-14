package com.pioalpha.pche.model;

import java.util.Collection;

public class Competencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2953108823282665592L;
	
	private Long idCompetencia;
	private String nome;
	private TipoCompetencia tipoCompetencia;
	private Collection<NivelCompetencia> nivelCompetencia;
	
	public Long getIdCompetencia() {
		return idCompetencia;
	}

	public void setIdCompetencia(Long idCompetencia) {
		this.idCompetencia = idCompetencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCompetencia getTipoCompetencia() {
		return tipoCompetencia;
	}

	public void setTipoCompetencia(TipoCompetencia tipoCompetencia) {
		this.tipoCompetencia = tipoCompetencia;
	}

	public Collection<NivelCompetencia> getNivelCompetencia() {
		return nivelCompetencia;
	}

	public void setNivelCompetencia(Collection<NivelCompetencia> nivelCompetencia) {
		this.nivelCompetencia = nivelCompetencia;
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
