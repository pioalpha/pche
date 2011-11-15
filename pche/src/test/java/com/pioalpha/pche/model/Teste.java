package com.pioalpha.pche.model;

import java.util.ArrayList;
import java.util.Collection;

public class Teste {
	
	public static void main(String[] args) {
		Administrador adm = new Administrador();
		
		//Estados Civeis: Solteiro, Casado, Separado, Divorciado, Viuvo
		adm.setEstadosCiveis(new ArrayList<EstadoCivil>());
		EstadoCivil estadoCivil = new EstadoCivil();
		estadoCivil.setNome("Solteiro");
		adm.getEstadosCiveis().add(estadoCivil);
		estadoCivil = new EstadoCivil();
		estadoCivil.setNome("Casado");
		adm.getEstadosCiveis().add(estadoCivil);
		estadoCivil = new EstadoCivil();
		estadoCivil.setNome("Separado");
		adm.getEstadosCiveis().add(estadoCivil);
		estadoCivil = new EstadoCivil();
		estadoCivil.setNome("Divorciado");
		adm.getEstadosCiveis().add(estadoCivil);
		estadoCivil = new EstadoCivil();
		estadoCivil.setNome("Viuvo");
		adm.getEstadosCiveis().add(estadoCivil);

		//Sexos: Masculino, Feminino
		adm.setSexos(new ArrayList<Sexo>());
		Sexo sexo = new Sexo();
		sexo.setNome("Masculino");
		adm.getSexos().add(sexo);
		sexo = new Sexo();
		sexo.setNome("Feminino");
		adm.getSexos().add(sexo);
		
		//Deficiências: Física, Auditiva, Visual, Mental, Multipla
		adm.setDeficiencias(new ArrayList<Deficiencia>());
		Deficiencia deficiencia = new Deficiencia();
		deficiencia.setNome("Física");
		adm.getDeficiencias().add(deficiencia);
		deficiencia = new Deficiencia();
		deficiencia.setNome("Auditiva");
		adm.getDeficiencias().add(deficiencia);
		deficiencia = new Deficiencia();
		deficiencia.setNome("Visual");
		adm.getDeficiencias().add(deficiencia);
		deficiencia = new Deficiencia();
		deficiencia.setNome("Mental");
		adm.getDeficiencias().add(deficiencia);
		deficiencia = new Deficiencia();
		deficiencia.setNome("Multipla");
		adm.getDeficiencias().add(deficiencia);
		
		//Ocupações
		Collection<Ocupacao> ocupacoes = new ArrayList<Ocupacao>();
		Ocupacao ocupacao = new Ocupacao();
		ocupacao.setNome("Programador de Sistemas de Informação");
		ocupacao.setDescricao("Trabalha com Sistemas");
		ocupacoes.add(ocupacao);
		ocupacao = new Ocupacao();
		ocupacao.setNome("Programador de Internet");
		ocupacao.setDescricao("Trabalha com Internet");
		ocupacoes.add(ocupacao);
		ocupacao = new Ocupacao();
		ocupacao.setNome("Programador de Máquinas - Ferramenta com Comando Numérico");
		ocupacao.setDescricao("Trabalha com Máquinas");
		ocupacoes.add(ocupacao);
		ocupacao = new Ocupacao();
		ocupacao.setNome("Programador Multimidia");
		ocupacao.setDescricao("Trabalha com Multimidia");
		ocupacoes.add(ocupacao);
		
		//Áreas de Ocupação
		adm.setAreasOcupacao(new ArrayList<AreaOcupacao>());
		AreaOcupacao areaOcupacao = new AreaOcupacao();
		areaOcupacao.setNome("Informática");
		areaOcupacao.setDescricao("Trabalha na Área de Informática");
		areaOcupacao.setOcupacoes(ocupacoes);
		adm.getAreasOcupacao().add(areaOcupacao);
		
		//Tipo Competência: Linguagens de Programação
		Collection<TipoCompetencia> tiposCompetencia = new ArrayList<TipoCompetencia>();
		TipoCompetencia tipoCompetencia = new TipoCompetencia();
		tipoCompetencia.setNome("Linguagens de Programação");
		tiposCompetencia.add(tipoCompetencia);

		//Categoria Competência: Técnica
		adm.setCategoriasCompetencia(new ArrayList<CategoriaCompetencia>());
		CategoriaCompetencia categoriaCompetencia = new CategoriaCompetencia();
		categoriaCompetencia.setNome("Técnica");
		categoriaCompetencia.setTiposCompetencia(tiposCompetencia);
		adm.getCategoriasCompetencia().add(categoriaCompetencia);

		//Nível Competência: 0 - Noções, 1 - Criação de Classes EJB, ...
		Collection<NivelCompetencia> niveisCompetenciaJAVAEE = new ArrayList<NivelCompetencia>();
		NivelCompetencia nivelCompetencia = new NivelCompetencia();
		nivelCompetencia.setOrdem(0);
		nivelCompetencia.setDescricao("Noções");
		niveisCompetenciaJAVAEE.add(nivelCompetencia);
		nivelCompetencia = new NivelCompetencia();
		nivelCompetencia.setOrdem(1);
		nivelCompetencia.setDescricao("Criação de Classes EJB");
		niveisCompetenciaJAVAEE.add(nivelCompetencia);
		
		//Nível Competência: 0 - Noções, 1 - Experiência, ...
		Collection<NivelCompetencia> niveisCompetenciaProgramacao = new ArrayList<NivelCompetencia>();
		nivelCompetencia = new NivelCompetencia();
		nivelCompetencia.setOrdem(0);
		nivelCompetencia.setDescricao("Noções");
		niveisCompetenciaProgramacao.add(nivelCompetencia);
		nivelCompetencia = new NivelCompetencia();
		nivelCompetencia.setOrdem(1);
		nivelCompetencia.setDescricao("Experiência");
		niveisCompetenciaProgramacao.add(nivelCompetencia);

		//Competência: Programação JAVA EE, Generalizada: false
		adm.setCompetencias(new ArrayList<Competencia>());
		Competencia competencia = new Competencia();
		competencia.setNome("Programação JAVA EE");
		competencia.setGeneralizada(false);
		competencia.setNiveisCompetencia(niveisCompetenciaJAVAEE);
		competencia.setTipoCompetencia(tipoCompetencia);
		adm.getCompetencias().add(competencia);

		//Competência: Programação em Geral, Generalizada: true 
		competencia = new Competencia();
		competencia.setNome("Qualquer Linguagem");
		competencia.setGeneralizada(true);
		competencia.setNiveisCompetencia(niveisCompetenciaProgramacao);
		competencia.setTipoCompetencia(tipoCompetencia);
		adm.getCompetencias().add(competencia);
		
		System.out.println(adm.getEstadosCiveis().toString());
		System.out.println(adm.getSexos().toString());
		System.out.println(adm.getDeficiencias().toString());
		System.out.println(adm.getAreasOcupacao().toString());
		
		System.out.println(adm.getCategoriasCompetencia().toString());
		System.out.println(adm.getCompetencias().toString());
	}
	
}
