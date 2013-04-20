package br.usp.tcc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@XmlRootElement
public class Paciente {

	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "Apenas letras e espacoes sao permitidos")
	private String nome;
	
	@NotNull
    @NotEmpty
    @Email
	private String email;
	
	@NotNull
    @Size(min = 10, max = 12)
    @Digits(fraction = 0, integer = 12)
    @Column(name = "phone_number")
	private String telefone;
	
	@NotNull
	private Date dataNasc;
	
	@NotNull
    private String prontuario;
	
	private String enfermeiro;
	private String descricao;

	@Transient
	private List<AvaliacaoBraden> braden;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(String enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	public String getSexoDesc(){
		return this.sexo == Sexo.F ? "Feminino" : "Masculino";
	}

	public List<AvaliacaoBraden> getBraden() {
		ArrayList<AvaliacaoBraden> arrayList = new ArrayList<AvaliacaoBraden>();
		
		arrayList.add(new AvaliacaoBraden(1l, new Date(), LevelBraden.ONE, LevelBraden.TWO, LevelBraden.ONE, LevelBraden.ONE, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(2l, new Date(), LevelBraden.ONE, LevelBraden.TWO, LevelBraden.ONE, LevelBraden.ONE, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(3l, new Date(), LevelBraden.ONE, LevelBraden.TWO, LevelBraden.ONE, LevelBraden.ONE, LevelBraden.FOUR, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(4l, new Date(), LevelBraden.ONE, LevelBraden.THREE, LevelBraden.THREE, LevelBraden.THREE, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(5l, new Date(), LevelBraden.TWO, LevelBraden.TWO, LevelBraden.ONE, LevelBraden.ONE, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(6l, new Date(), LevelBraden.TWO, LevelBraden.FOUR, LevelBraden.FOUR, LevelBraden.THREE, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(7l, new Date(), LevelBraden.THREE, LevelBraden.TWO, LevelBraden.ONE, LevelBraden.FOUR, LevelBraden.THREE, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(8l, new Date(), LevelBraden.TWO, LevelBraden.TWO, LevelBraden.FOUR, LevelBraden.THREE, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(9l, new Date(), LevelBraden.FOUR, LevelBraden.FOUR, LevelBraden.FOUR, LevelBraden.FOUR, LevelBraden.TWO, LevelBraden.ONE));
		arrayList.add(new AvaliacaoBraden(10l, new Date(), LevelBraden.FOUR, LevelBraden.TWO, LevelBraden.ONE, LevelBraden.THREE, LevelBraden.TWO, LevelBraden.ONE));
		
		
		return arrayList;
	}

	public void setBraden(List<AvaliacaoBraden> braden) {
		this.braden = braden;
	}
}
