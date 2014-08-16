package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="cargo")
public class Cargo {
	
	@Id
	@GeneratedValue
	private Integer codigoCargo;
    private String descricaoCargo;
    
	public Integer getCodigoCargo() {
		return codigoCargo;
	}
	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}
	public String getDescricaoCargo() {
		return descricaoCargo;
	}
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoCargo == null) ? 0 : codigoCargo.hashCode());
		result = prime * result
				+ ((descricaoCargo == null) ? 0 : descricaoCargo.hashCode());
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
		Cargo other = (Cargo) obj;
		if (codigoCargo == null) {
			if (other.codigoCargo != null)
				return false;
		} else if (!codigoCargo.equals(other.codigoCargo))
			return false;
		if (descricaoCargo == null) {
			if (other.descricaoCargo != null)
				return false;
		} else if (!descricaoCargo.equals(other.descricaoCargo))
			return false;
		return true;
	}

}
