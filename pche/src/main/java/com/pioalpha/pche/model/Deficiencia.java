package com.pioalpha.pche.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Deficiencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6827163936701550395L;
	
	private Long idDeficiencia;
	private String nome;
		
	public Long getIdDeficiencia() {
		return idDeficiencia;
	}

	public void setIdDeficiencia(Long idDeficiencia) {
		this.idDeficiencia = idDeficiencia;
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
        .append("idDeficiencia", this.idDeficiencia)
        .append("nome", this.nome)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof Deficiencia)) {
            return false;
        }

        final Deficiencia deficiencia = (Deficiencia) o;

        return this.hashCode() == deficiencia.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
