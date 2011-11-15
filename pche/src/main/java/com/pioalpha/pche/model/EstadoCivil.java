package com.pioalpha.pche.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class EstadoCivil extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7238478509355573841L;
	
	private Long idEstadoCivil;
	private String nome;

	
	public Long getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Long idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idEstadoCivil", this.idEstadoCivil)
        .append("nome", this.nome)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof EstadoCivil)) {
            return false;
        }

        final EstadoCivil estadoCivel = (EstadoCivil) o;

        return this.hashCode() == estadoCivel.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
