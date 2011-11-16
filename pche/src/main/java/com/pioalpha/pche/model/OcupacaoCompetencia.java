package com.pioalpha.pche.model;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OcupacaoCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3440809746832559038L;

	private Long idOcupacaoCompetencia;
	private Ocupacao ocupacao;
	private Competencia competencia;
	private Date dataAlteracao;
	
	public Long getIdOcupacaoCompetencia() {
		return idOcupacaoCompetencia;
	}

	public void setIdOcupacaoCompetencia(Long idOcupacaoCompetencia) {
		this.idOcupacaoCompetencia = idOcupacaoCompetencia;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
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
        .append("idOcupacaoCompetencia", this.idOcupacaoCompetencia)
        .append("ocupacao", this.ocupacao)
        .append("competencia", this.competencia)
        .append("dataAlteracao", this.dataAlteracao)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof OcupacaoCompetencia)) {
            return false;
        }

        final OcupacaoCompetencia ocupacaoCompetencia = (OcupacaoCompetencia) o;

        return this.hashCode() == ocupacaoCompetencia.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (ocupacao != null ? ocupacao.hashCode() : 0);
        result = 29 * result + (competencia != null ? competencia.hashCode() : 0);
        return result;
	}

}
