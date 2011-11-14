package com.pioalpha.pche.model;

public class Unidade extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1844560264126739527L;

	private Long idUnidade;
	private String email;
	private String senha;
	private String telefone;
	private String contato;
	private EnderecoCompleto enderecoCompleto;
	
	public Long getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(Long idUnidade) {
		this.idUnidade = idUnidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public EnderecoCompleto getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(EnderecoCompleto enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
