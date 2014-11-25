package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="tipo_controle")
public class TipoControle {
	
	@Id
	@GeneratedValue
	private Long codigoTipoControle;
    private String descricaoTipoControle;
	public Long getCodigoTipoControle() {
		return codigoTipoControle;
	}
	public void setCodigoTipoControle(Long codigoTipoControle) {
		this.codigoTipoControle = codigoTipoControle;
	}
	public String getDescricaoTipoControle() {
		return descricaoTipoControle;
	}
	public void setDescricaoTipoControle(String descricaoTipoControle) {
		this.descricaoTipoControle = descricaoTipoControle;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoTipoControle == null) ? 0 : codigoTipoControle
						.hashCode());
		result = prime
				* result
				+ ((descricaoTipoControle == null) ? 0 : descricaoTipoControle
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
		TipoControle other = (TipoControle) obj;
		if (codigoTipoControle == null) {
			if (other.codigoTipoControle != null)
				return false;
		} else if (!codigoTipoControle.equals(other.codigoTipoControle))
			return false;
		if (descricaoTipoControle == null) {
			if (other.descricaoTipoControle != null)
				return false;
		} else if (!descricaoTipoControle.equals(other.descricaoTipoControle))
			return false;
		return true;
	}
    
    
}
