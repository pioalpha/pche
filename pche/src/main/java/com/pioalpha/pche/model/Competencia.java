package com.pioalpha.pche.model;

import java.util.Collection;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Competencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2953108823282665592L;
	
	private Long idCompetencia;
	private String nome;
	private boolean generalizada;
	private TipoCompetencia tipoCompetencia;
	private Collection<NivelCompetencia> niveisCompetencia;
	
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

	public boolean isGeneralizada() {
		return generalizada;
	}

	public void setGeneralizada(boolean generalizada) {
		this.generalizada = generalizada;
	}

	public TipoCompetencia getTipoCompetencia() {
		return tipoCompetencia;
	}

	public void setTipoCompetencia(TipoCompetencia tipoCompetencia) {
		this.tipoCompetencia = tipoCompetencia;
	}

	public Collection<NivelCompetencia> getNiveisCompetencia() {
		return niveisCompetencia;
	}

	public void setNiveisCompetencia(Collection<NivelCompetencia> niveisCompetencia) {
		this.niveisCompetencia = niveisCompetencia;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idCompetencia", this.idCompetencia)
        .append("tipoCompetencia", this.tipoCompetencia)
        .append("nome", this.nome)
        .append("generalizada", this.generalizada)
        .append("niveisCompetencia", this.niveisCompetencia)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof Competencia)) {
            return false;
        }

        final Competencia competencia = (Competencia) o;

        return this.hashCode() == competencia.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
