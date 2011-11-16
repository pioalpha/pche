package com.pioalpha.pche.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Escolaridade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5397699812030187478L;

	private Long idEscolaridade;
	private Integer ordem;
	private String nome;
		
	public Long getIdEscolaridade() {
		return idEscolaridade;
	}

	public void setIdEscolaridade(Long idEscolaridade) {
		this.idEscolaridade = idEscolaridade;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
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
        .append("idEscolaridade", this.idEscolaridade)
        .append("ordem", this.ordem)
        .append("nome", this.nome)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof Escolaridade)) {
            return false;
        }

        final Escolaridade escolaridade = (Escolaridade) o;

        return this.hashCode() == escolaridade.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
