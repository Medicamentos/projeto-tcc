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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoRegiao == null) ? 0 : codigoRegiao.hashCode());
		result = prime * result
				+ ((nomeRegiao == null) ? 0 : nomeRegiao.hashCode());
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
		Regiao other = (Regiao) obj;
		if (codigoRegiao == null) {
			if (other.codigoRegiao != null)
				return false;
		} else if (!codigoRegiao.equals(other.codigoRegiao))
			return false;
		if (nomeRegiao == null) {
			if (other.nomeRegiao != null)
				return false;
		} else if (!nomeRegiao.equals(other.nomeRegiao))
			return false;
		return true;
	}
	
	

}
