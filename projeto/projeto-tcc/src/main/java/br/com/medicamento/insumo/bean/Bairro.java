package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "bairro")
public class Bairro {

	@Id
	@GeneratedValue
	private Long codigoBairro;
	@ManyToOne
	@JoinColumn(name = "codigoRegiao")
	private Regiao regiao;
	private String nomeBairro;

	public Long getCodigoBairro() {
		return codigoBairro;
	}

	public void setCodigoBairro(Long codigoBairro) {
		this.codigoBairro = codigoBairro;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

}
