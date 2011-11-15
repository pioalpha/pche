package com.pioalpha.pche.model;

import java.util.Collection;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class CategoriaCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4359117797748036782L;

	private Long idCategoriaCompetencia;
	private String nome;
	private Collection<TipoCompetencia> tiposCompetencia;
	
	public Long getIdCategoriaCompetencia() {
		return idCategoriaCompetencia;
	}

	public void setIdCategoriaCompetencia(Long idCategoriaCompetencia) {
		this.idCategoriaCompetencia = idCategoriaCompetencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<TipoCompetencia> getTiposCompetencia() {
		return tiposCompetencia;
	}

	public void setTiposCompetencia(Collection<TipoCompetencia> tiposCompetencia) {
		this.tiposCompetencia = tiposCompetencia;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idCategoriaCompetencia", this.idCategoriaCompetencia)
        .append("nome", this.nome)
        .append("tiposCompetencia", this.tiposCompetencia)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof CategoriaCompetencia)) {
            return false;
        }

        final CategoriaCompetencia categoriaCompetencia = (CategoriaCompetencia) o;

        return this.hashCode() == categoriaCompetencia.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
