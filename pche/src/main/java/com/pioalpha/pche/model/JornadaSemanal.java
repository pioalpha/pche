package com.pioalpha.pche.model;

import java.util.Date;

public class JornadaSemanal extends JornadaTrabalho {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4360533648799044594L;

	private Long idJornadaSemanal;
	private Integer horasSegunda;
	private Integer horasTerca;
	private Integer horasQuarta;
	private Integer horasQuinta;
	private Integer horasSexta;
	private Integer horasSabado;
	private Integer horasDomingo;
	private Date horaEntradaPadrao;
	private Date horaSaidaPadrao;
	
	public Long getIdJornadaSemanal() {
		return idJornadaSemanal;
	}
	public void setIdJornadaSemanal(Long idJornadaSemanal) {
		this.idJornadaSemanal = idJornadaSemanal;
	}
	public Integer getHorasSegunda() {
		return horasSegunda;
	}
	public void setHorasSegunda(Integer horasSegunda) {
		this.horasSegunda = horasSegunda;
	}
	public Integer getHorasTerca() {
		return horasTerca;
	}
	public void setHorasTerca(Integer horasTerca) {
		this.horasTerca = horasTerca;
	}
	public Integer getHorasQuarta() {
		return horasQuarta;
	}
	public void setHorasQuarta(Integer horasQuarta) {
		this.horasQuarta = horasQuarta;
	}
	public Integer getHorasQuinta() {
		return horasQuinta;
	}
	public void setHorasQuinta(Integer horasQuinta) {
		this.horasQuinta = horasQuinta;
	}
	public Integer getHorasSexta() {
		return horasSexta;
	}
	public void setHorasSexta(Integer horasSexta) {
		this.horasSexta = horasSexta;
	}
	public Integer getHorasSabado() {
		return horasSabado;
	}
	public void setHorasSabado(Integer horasSabado) {
		this.horasSabado = horasSabado;
	}
	public Integer getHorasDomingo() {
		return horasDomingo;
	}
	public void setHorasDomingo(Integer horasDomingo) {
		this.horasDomingo = horasDomingo;
	}
	
	public Date getHoraEntradaPadrao() {
		return horaEntradaPadrao;
	}
	public void setHoraEntradaPadrao(Date horaEntradaPadrao) {
		this.horaEntradaPadrao = horaEntradaPadrao;
	}
	public Date getHoraSaidaPadrao() {
		return horaSaidaPadrao;
	}
	public void setHoraSaidaPadrao(Date horaSaidaPadrao) {
		this.horaSaidaPadrao = horaSaidaPadrao;
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
