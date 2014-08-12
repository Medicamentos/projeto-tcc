package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "regiao")
public class Regiao {

	@Id
	@GeneratedValue
	private Long codigoRegiao;
	private String nomeRegiao;

	public Long getCodigoRegiao() {
		return codigoRegiao;
	}

	public void setCodigoRegiao(Long codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}

	public String getNomeRegiao() {
		return nomeRegiao;
	}

	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}

}
