package com.pioalpha.pche.model;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class EscolaridadeOcupacao extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8192586033172285315L;

	private Long idEscolaridadeOcupacao;
	private Escolaridade escolaridadeMinima;
	private Ocupacao ocupacao;
	private Date dataAlteracao;
	
	public Long getIdEscolaridadeOcupacao() {
		return idEscolaridadeOcupacao;
	}

	public void setIdEscolaridadeOcupacao(Long idEscolaridadeOcupacao) {
		this.idEscolaridadeOcupacao = idEscolaridadeOcupacao;
	}

	public Escolaridade getEscolaridadeMinima() {
		return escolaridadeMinima;
	}

	public void setEscolaridadeMinima(Escolaridade escolaridadeMinima) {
		this.escolaridadeMinima = escolaridadeMinima;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("idEscolaridadeOcpacao", this.idEscolaridadeOcupacao)
        .append("escolaridadeMinima", this.escolaridadeMinima)
        .append("ocupacao", this.ocupacao)
        .append("dataAlteracao", this.dataAlteracao)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof EscolaridadeOcupacao)) {
            return false;
        }

        final EscolaridadeOcupacao escolaridadeOcupacao = (EscolaridadeOcupacao) o;

        return this.hashCode() == escolaridadeOcupacao.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (escolaridadeMinima != null ? escolaridadeMinima.hashCode() : 0);
        result = 29 * result + (ocupacao != null ? ocupacao.hashCode() : 0);
        return result;
	}

}
