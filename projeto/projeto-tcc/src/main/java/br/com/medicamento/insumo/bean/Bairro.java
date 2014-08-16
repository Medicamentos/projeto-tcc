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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoBairro == null) ? 0 : codigoBairro.hashCode());
		result = prime * result
				+ ((nomeBairro == null) ? 0 : nomeBairro.hashCode());
		result = prime * result + ((regiao == null) ? 0 : regiao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bairro other = (Bairro) obj;
		if (codigoBairro == null) {
			if (other.codigoBairro != null)
				return false;
		} else if (!codigoBairro.equals(other.codigoBairro))
			return false;
		if (nomeBairro == null) {
			if (other.nomeBairro != null)
				return false;
		} else if (!nomeBairro.equals(other.nomeBairro))
			return false;
		if (regiao == null) {
			if (other.regiao != null)
				return false;
		} else if (!regiao.equals(other.regiao))
			return false;
		return true;
	}

	
	
}
