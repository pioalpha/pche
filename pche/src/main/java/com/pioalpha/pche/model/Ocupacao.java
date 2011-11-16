package com.pioalpha.pche.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Ocupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9150820261351718140L;

	private Long idOcupacao;
	private String nome;
	private String descricao;
	
	public Long getIdOcupacao() {
		return idOcupacao;
	}

	public void setIdOcupacao(Long idOcupacao) {
		this.idOcupacao = idOcupacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idOcupacao", this.idOcupacao)
        .append("nome", this.nome)
        .append("descrição", this.descricao)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof Ocupacao)) {
            return false;
        }

        final Ocupacao ocupacao = (Ocupacao) o;

        return this.hashCode() == ocupacao.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
