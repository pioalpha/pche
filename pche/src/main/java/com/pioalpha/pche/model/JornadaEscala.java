package com.pioalpha.pche.model;

public class JornadaEscala extends JornadaTrabalho {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7290061031211680045L;
	
	private Long idJornadaEscala;
	private Integer horasTrabalho;
	private Integer horasFolga;

	public Long getIdJornadaEscala() {
		return idJornadaEscala;
	}

	public void setIdJornadaEscala(Long idJornadaEscala) {
		this.idJornadaEscala = idJornadaEscala;
	}

	public Integer getHorasTrabalho() {
		return horasTrabalho;
	}

	public void setHorasTrabalho(Integer horasTrabalho) {
		this.horasTrabalho = horasTrabalho;
	}

	public Integer getHorasFolga() {
		return horasFolga;
	}

	public void setHorasFolga(Integer horasFolga) {
		this.horasFolga = horasFolga;
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
