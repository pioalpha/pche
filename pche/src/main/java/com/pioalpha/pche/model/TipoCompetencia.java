package com.pioalpha.pche.model;

import java.util.Collection;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TipoCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8987649306759626398L;

	private Long idTipoCompetencia;
	private String nome;
	private AreaOcupacao areaOcupacao;
	private Collection<Competencia> competencias;
	
	public Long getIdTipoCompetencia() {
		return idTipoCompetencia;
	}

	public void setIdTipoCompetencia(Long idTipoCompetencia) {
		this.idTipoCompetencia = idTipoCompetencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AreaOcupacao getAreaOcupacao() {
		return areaOcupacao;
	}

	public void setAreaOcupacao(AreaOcupacao areaOcupacao) {
		this.areaOcupacao = areaOcupacao;
	}

	public Collection<Competencia> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Collection<Competencia> competencias) {
		this.competencias = competencias;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idTipoCompetencia", this.idTipoCompetencia)
        .append("nome", this.nome)
        .append("areaOcupacao", this.areaOcupacao)
        .append("competencias", this.competencias)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof TipoCompetencia)) {
            return false;
        }

        final TipoCompetencia tipoCompetencia = (TipoCompetencia) o;

        return this.hashCode() == tipoCompetencia.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
