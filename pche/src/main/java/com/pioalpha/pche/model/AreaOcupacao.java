package com.pioalpha.pche.model;

import java.util.Collection;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class AreaOcupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2584428241055578142L;

	private Long idAreaOcupacao;
	private String nome;
	private String descricao;
	private Collection<Ocupacao> ocupacoes;
	
	public Long getIdAreaOcupacao() {
		return idAreaOcupacao;
	}

	public void setIdAreaOcupacao(Long idAreaOcupacao) {
		this.idAreaOcupacao = idAreaOcupacao;
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
	
	public Collection<Ocupacao> getOcupacoes() {
		return ocupacoes;
	}

	public void setOcupacoes(Collection<Ocupacao> ocupacoes) {
		this.ocupacoes = ocupacoes;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idAreaOcupacao", this.idAreaOcupacao)
        .append("nome", this.nome)
        .append("descrição", this.descricao)
        .append("Ocupações", this.ocupacoes.toString())
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof AreaOcupacao)) {
            return false;
        }

        final AreaOcupacao areaOcupacao = (AreaOcupacao) o;

        return this.hashCode() == areaOcupacao.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (nome != null ? nome.hashCode() : 0);
        return result;
	}

}
