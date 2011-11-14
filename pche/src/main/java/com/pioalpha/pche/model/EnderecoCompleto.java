package com.pioalpha.pche.model;

public class EnderecoCompleto extends ObjetoBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5982102042182788520L;
	
	private Long idEnderecoCompleto;
	private Bairro bairro;
	private TipoLogradouro tipoLogradouro;
	private String Logradouro;
	private Integer numero;
	private String complemento;
	private Long cep;

	
	public Long getIdEnderecoCompleto() {
		return idEnderecoCompleto;
	}

	public void setIdEnderecoCompleto(Long idEnderecoCompleto) {
		this.idEnderecoCompleto = idEnderecoCompleto;
	}

	
	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
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
