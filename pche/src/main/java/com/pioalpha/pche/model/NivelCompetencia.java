package com.pioalpha.pche.model;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class NivelCompetencia extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8676560426579510389L;

	private Long idNivelCompetencia;
	private Integer ordem;
	private String descricao;
	private Date dataAlteracao;
	
	public Long getIdNivelCompetencia() {
		return idNivelCompetencia;
	}

	public void setIdNivelCompetencia(Long idNivelCompetencia) {
		this.idNivelCompetencia = idNivelCompetencia;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
        .append("idNivelCompetencia", this.idNivelCompetencia)
        .append("ordem", this.ordem)
        .append("descricao", this.descricao)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
            return true;
        }
        if (!(o instanceof NivelCompetencia)) {
            return false;
        }

        final NivelCompetencia nivelCompetencia = (NivelCompetencia) o;

        return this.hashCode() == nivelCompetencia.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (descricao != null ? descricao.hashCode() : 0);
        return result;
	}

}
