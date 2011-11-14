package com.pioalpha.pche.model;

import java.util.Collection;

public class InstituicaoEnsino extends Empresa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4327343665816697305L;
	
	private Collection<Curso> curso;
	private Collection<CursoUnidade> cursoUnidade;
	
	public Collection<Curso> getCurso() {
		return curso;
	}

	public void setCurso(Collection<Curso> curso) {
		this.curso = curso;
	}

	public Collection<CursoUnidade> getCursoUnidade() {
		return cursoUnidade;
	}

	public void setCursoUnidade(Collection<CursoUnidade> cursoUnidade) {
		this.cursoUnidade = cursoUnidade;
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
