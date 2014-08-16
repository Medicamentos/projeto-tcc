package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="laboratorio")
public class Laboratorio {
	
	  @Id	
	  @GeneratedValue
	  private Integer codigoLaboratorio;
	  private String nomeLaboratorio;
	  
	public Integer getCodigoLaboratorio() {
		return codigoLaboratorio;
	}
	public void setCodigoLaboratorio(Integer codigoLaboratorio) {
		this.codigoLaboratorio = codigoLaboratorio;
	}
	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}
	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoLaboratorio == null) ? 0 : codigoLaboratorio
						.hashCode());
		result = prime * result
				+ ((nomeLaboratorio == null) ? 0 : nomeLaboratorio.hashCode());
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
		Laboratorio other = (Laboratorio) obj;
		if (codigoLaboratorio == null) {
			if (other.codigoLaboratorio != null)
				return false;
		} else if (!codigoLaboratorio.equals(other.codigoLaboratorio))
			return false;
		if (nomeLaboratorio == null) {
			if (other.nomeLaboratorio != null)
				return false;
		} else if (!nomeLaboratorio.equals(other.nomeLaboratorio))
			return false;
		return true;
	}
	  
	  

}
