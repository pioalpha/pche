package com.pioalpha.pche.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Teste {
	
	public static void main(String[] args) throws ParseException {
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

		//Escolaridades
		adm.setEscolaridades(new ArrayList<Escolaridade>());
		Escolaridade escolaridadeEI = new Escolaridade();
		escolaridadeEI.setOrdem(0);
		escolaridadeEI.setNome("Educação Infantil");
		adm.getEscolaridades().add(escolaridadeEI);
		Escolaridade escolaridadeEFI = new Escolaridade();
		escolaridadeEFI.setOrdem(1);
		escolaridadeEFI.setNome("Ensino Fundamental Incompleto");
		adm.getEscolaridades().add(escolaridadeEFI);
		Escolaridade escolaridadeEFC = new Escolaridade();
		escolaridadeEFC.setOrdem(2);
		escolaridadeEFC.setNome("Ensino Fundamental Completo");
		adm.getEscolaridades().add(escolaridadeEFC);
		Escolaridade escolaridadeEMI = new Escolaridade();
		escolaridadeEMI.setOrdem(3);
		escolaridadeEMI.setNome("Ensino Médio Incompleto");
		adm.getEscolaridades().add(escolaridadeEMI);
		Escolaridade escolaridadeEMC = new Escolaridade();
		escolaridadeEMC.setOrdem(4);
		escolaridadeEMC.setNome("Ensino Médio Completo");
		adm.getEscolaridades().add(escolaridadeEMC);
		Escolaridade escolaridadeESI = new Escolaridade();
		escolaridadeESI.setOrdem(5);
		escolaridadeESI.setNome("Ensino Superior Incompleto");
		adm.getEscolaridades().add(escolaridadeESI);
		Escolaridade escolaridadeESC = new Escolaridade();
		escolaridadeESC.setOrdem(6);
		escolaridadeESC.setNome("Ensino Superior Completo");
		adm.getEscolaridades().add(escolaridadeESC);

		//Ocupações
		Collection<Ocupacao> ocupacoes = new ArrayList<Ocupacao>();
		Ocupacao ocupacaoPS = new Ocupacao();
		ocupacaoPS.setNome("Programador de Sistemas de Informação");
		ocupacaoPS.setDescricao("Trabalha com Sistemas");
		ocupacoes.add(ocupacaoPS);
		Ocupacao ocupacaoPI = new Ocupacao();
		ocupacaoPI.setNome("Programador de Internet");
		ocupacaoPI.setDescricao("Trabalha com Internet");
		ocupacoes.add(ocupacaoPI);
		Ocupacao ocupacaoPN = new Ocupacao();
		ocupacaoPN.setNome("Programador de Máquinas - Ferramenta com Comando Numérico");
		ocupacaoPN.setDescricao("Trabalha com Máquinas");
		ocupacoes.add(ocupacaoPN);
		Ocupacao ocupacaoPM = new Ocupacao();
		ocupacaoPM.setNome("Programador Multimidia");
		ocupacaoPM.setDescricao("Trabalha com Multimidia");
		ocupacoes.add(ocupacaoPM);

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
		Competencia competenciaJAVAEE = new Competencia();
		competenciaJAVAEE.setNome("Programação JAVA EE");
		competenciaJAVAEE.setGeneralizada(false);
		competenciaJAVAEE.setNiveisCompetencia(niveisCompetenciaJAVAEE);
		competenciaJAVAEE.setTipoCompetencia(tipoCompetencia);
		adm.getCompetencias().add(competenciaJAVAEE);

		//Competência: Programação em Geral, Generalizada: true 
		Competencia competenciaProgramacao = new Competencia();
		competenciaProgramacao.setNome("Qualquer Linguagem");
		competenciaProgramacao.setGeneralizada(true);
		competenciaProgramacao.setNiveisCompetencia(niveisCompetenciaProgramacao);
		competenciaProgramacao.setTipoCompetencia(tipoCompetencia);
		adm.getCompetencias().add(competenciaProgramacao);
		
		//Benfícios: Vale Transporte, Ticket Refeição, Férias, ...
		adm.setBeneficios(new ArrayList<Beneficio>());
		Beneficio beneficio = new Beneficio();
		beneficio.setNome("Vale Transporte");
		adm.getBeneficios().add(beneficio);
		beneficio = new Beneficio();
		beneficio.setNome("Ticket Refeição");
		adm.getBeneficios().add(beneficio);
		beneficio = new Beneficio();
		beneficio.setNome("Férias");
		adm.getBeneficios().add(beneficio);
		
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Escolaridade Ocupação: Ensino Médio Completo para PI, PM
		adm.setEscolaridadesOcupacao(new ArrayList<EscolaridadeOcupacao>());
		EscolaridadeOcupacao escolaridadeOcupacaoPI = new EscolaridadeOcupacao();
		escolaridadeOcupacaoPI.setOcupacao(ocupacaoPI);
		escolaridadeOcupacaoPI.setEscolaridadeMinima(escolaridadeEMC);
		escolaridadeOcupacaoPI.setDataAlteracao(sdf.parse("17/10/2011"));
		adm.getEscolaridadesOcupacao().add(escolaridadeOcupacaoPI);
		EscolaridadeOcupacao escolaridadeOcupacaoPM = new EscolaridadeOcupacao();
		escolaridadeOcupacaoPM.setOcupacao(ocupacaoPM);
		escolaridadeOcupacaoPM.setEscolaridadeMinima(escolaridadeEMC);
		escolaridadeOcupacaoPM.setDataAlteracao(sdf.parse("17/10/2011"));
		adm.getEscolaridadesOcupacao().add(escolaridadeOcupacaoPM);
		
		//Ocupação Competências: PI, PS com JAVAEE
		adm.setOcupacaoCompetencias(new ArrayList<OcupacaoCompetencia>());
		OcupacaoCompetencia ocupacaoCompetenciaPI = new OcupacaoCompetencia();
		ocupacaoCompetenciaPI.setOcupacao(ocupacaoPI);
		ocupacaoCompetenciaPI.setCompetencia(competenciaJAVAEE);
		ocupacaoCompetenciaPI.setDataAlteracao(sdf.parse("17/10/2011"));
		adm.getOcupacaoCompetencias().add(ocupacaoCompetenciaPI);
		OcupacaoCompetencia ocupacaoCompetenciaPS = new OcupacaoCompetencia();
		ocupacaoCompetenciaPS.setOcupacao(ocupacaoPS);
		ocupacaoCompetenciaPS.setCompetencia(competenciaJAVAEE);
		ocupacaoCompetenciaPS.setDataAlteracao(sdf.parse("17/10/2011"));
		adm.getOcupacaoCompetencias().add(ocupacaoCompetenciaPS);
		
		System.out.println(adm.getEstadosCiveis().toString());
		System.out.println(adm.getSexos().toString());
		System.out.println(adm.getDeficiencias().toString());
		System.out.println(adm.getAreasOcupacao().toString());
		System.out.println(adm.getEscolaridades().toString());
		System.out.println(adm.getBeneficios().toString());
		
		System.out.println(adm.getCategoriasCompetencia().toString());
		System.out.println(adm.getCompetencias().toString());
		
		System.out.println(adm.getEscolaridadesOcupacao().toString());
		System.out.println(adm.getOcupacaoCompetencias().toString());
	}
	
}
