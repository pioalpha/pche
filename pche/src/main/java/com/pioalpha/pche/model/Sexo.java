package com.pioalpha.pche.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Sexo extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3935316353278087342L;

	private Long idSexo;
	private String nome;
	
	public Long getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Long idSexo) {
		this.idSexo = idSexo;
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
        .append("idSexo", this.idSexo)
        .append("nome", this.nome)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof Sexo)) {
            return false;
        }

        final Sexo sexo = (Sexo) o;

        return this.hashCode() == sexo.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
