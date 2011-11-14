package com.pioalpha.pche.model;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Candidato extends Contratante {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4261640818415517865L;
	
	private String senha;
	private String nome;
	private EnderecoCompleto enderecoCompleto;
	private Long cpf;
	private Date mesAnoUltimoAcesso;
	private Curriculo curriculo;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public EnderecoCompleto getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(EnderecoCompleto enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Date getMesAnoUltimoAcesso() {
		return mesAnoUltimoAcesso;
	}

	public void setMesAnoUltimoAcesso(Date mesAnoUltimoAcesso) {
		this.mesAnoUltimoAcesso = mesAnoUltimoAcesso;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("senha", this.senha)
        .append("nome", this.nome)
        .append("cpf", this.cpf)
        .append("mesAnoUltimoAcesso", this.mesAnoUltimoAcesso)
        .toString();
	}

	@Override
	public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Candidato)) {
            return false;
        }

        final Candidato candidato1 = (Candidato) o;

        return this.hashCode() == candidato1.hashCode();
	}

	@Override
	public int hashCode() {
		int result;
        result = (senha != null ? senha.hashCode() : 0);
        result = 29 * result + (nome != null ? nome.hashCode() : 0);
        result = 29 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 29 * result + (mesAnoUltimoAcesso != null ? mesAnoUltimoAcesso.hashCode() : 0);
        return result;
	}

}
