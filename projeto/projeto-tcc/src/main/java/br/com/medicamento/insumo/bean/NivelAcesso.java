package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="nivel_acesso")
public class NivelAcesso {
	
	@Id
	@GeneratedValue
	private Integer codigoNivelAcesso;
    private String descricaoNivelAcesso;
    
	public Integer getCodigoNivelAcesso() {
		return codigoNivelAcesso;
	}
	public void setCodigoNivelAcesso(Integer codigoNivelAcesso) {
		this.codigoNivelAcesso = codigoNivelAcesso;
	}
	public String getDescricaoNivelAcesso() {
		return descricaoNivelAcesso;
	}
	public void setDescricaoNivelAcesso(String descricaoNivelAcesso) {
		this.descricaoNivelAcesso = descricaoNivelAcesso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoNivelAcesso == null) ? 0 : codigoNivelAcesso
						.hashCode());
		result = prime
				* result
				+ ((descricaoNivelAcesso == null) ? 0 : descricaoNivelAcesso
						.hashCode());
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
		NivelAcesso other = (NivelAcesso) obj;
		if (codigoNivelAcesso == null) {
			if (other.codigoNivelAcesso != null)
				return false;
		} else if (!codigoNivelAcesso.equals(other.codigoNivelAcesso))
			return false;
		if (descricaoNivelAcesso == null) {
			if (other.descricaoNivelAcesso != null)
				return false;
		} else if (!descricaoNivelAcesso.equals(other.descricaoNivelAcesso))
			return false;
		return true;
	}
    
    

}
