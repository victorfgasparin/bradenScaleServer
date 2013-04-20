package br.usp.tcc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AvaliacaoBraden {

	
	public AvaliacaoBraden(Long id, Date data, LevelBraden percepcaoSensorial,
			LevelBraden umidade, LevelBraden atividade, LevelBraden mobilidade,
			LevelBraden nutricao, LevelBraden friccao) {
		super();
		this.id = id;
		this.data = data;
		this.percepcaoSensorial = percepcaoSensorial;
		this.umidade = umidade;
		this.atividade = atividade;
		this.mobilidade = mobilidade;
		this.nutricao = nutricao;
		this.friccao = friccao;
	}

	public AvaliacaoBraden() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date data;
	
	@Enumerated(EnumType.ORDINAL)
	private LevelBraden percepcaoSensorial;
	
	@Enumerated(EnumType.ORDINAL)
	private LevelBraden umidade;
	
	@Enumerated(EnumType.ORDINAL)
	private LevelBraden atividade;
	
	@Enumerated(EnumType.ORDINAL)
	private LevelBraden mobilidade;
	
	@Enumerated(EnumType.ORDINAL)
	private LevelBraden nutricao;
	
	@Enumerated(EnumType.ORDINAL)
	private LevelBraden friccao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public LevelBraden getPercepcaoSensorial() {
		return percepcaoSensorial;
	}

	public void setPercepcaoSensorial(LevelBraden percepcaoSensorial) {
		this.percepcaoSensorial = percepcaoSensorial;
	}

	public LevelBraden getUmidade() {
		return umidade;
	}

	public void setUmidade(LevelBraden umidade) {
		this.umidade = umidade;
	}

	public LevelBraden getAtividade() {
		return atividade;
	}

	public void setAtividade(LevelBraden atividade) {
		this.atividade = atividade;
	}

	public LevelBraden getMobilidade() {
		return mobilidade;
	}

	public void setMobilidade(LevelBraden mobilidade) {
		this.mobilidade = mobilidade;
	}

	public LevelBraden getNutricao() {
		return nutricao;
	}

	public void setNutricao(LevelBraden nutricao) {
		this.nutricao = nutricao;
	}

	public LevelBraden getFriccao() {
		return friccao;
	}

	public void setFriccao(LevelBraden friccao) {
		this.friccao = friccao;
	}
	
	
	
	
	
}
