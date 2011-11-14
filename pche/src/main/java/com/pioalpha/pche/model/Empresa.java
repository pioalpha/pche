package com.pioalpha.pche.model;

import java.util.Collection;

public class Empresa extends Contratante {

	/**
	 * 
	 */
	private static final long serialVersionUID = 945337568551069410L;

	private String razaoSocial;
	private String nomeFantasia;
	private String email;
	private String senha;
	private String contato;
	private String pagina;
	private Collection<Unidade> unidade;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public Collection<Unidade> getUnidade() {
		return unidade;
	}

	public void setUnidade(Collection<Unidade> unidade) {
		this.unidade = unidade;
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
