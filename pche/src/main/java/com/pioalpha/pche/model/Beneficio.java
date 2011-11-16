package com.pioalpha.pche.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Beneficio extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8370071020233739075L;

	private Long idBeneficio;
	private String nome;
	
	public Long getIdBeneficio() {
		return idBeneficio;
	}

	public void setIdBeneficio(Long idBeneficio) {
		this.idBeneficio = idBeneficio;
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
        .append("idBeneficio", this.idBeneficio)
        .append("nome", this.nome)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof Beneficio)) {
            return false;
        }

        final Beneficio beneficio = (Beneficio) o;

        return this.hashCode() == beneficio.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
