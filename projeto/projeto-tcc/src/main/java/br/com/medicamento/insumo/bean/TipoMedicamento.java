package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="tipo_medicamento")
public class TipoMedicamento {
	
	@Id
	@GeneratedValue
	private Integer codigoTipoMedicamento;
    private String descricaoTipoMedicamento;
    
	public Integer getCodigoTipoMedicamento() {
		return codigoTipoMedicamento;
	}
	public void setCodigoTipoMedicamento(Integer codigoTipoMedicamento) {
		this.codigoTipoMedicamento = codigoTipoMedicamento;
	}
	public String getDescricaoTipoMedicamento() {
		return descricaoTipoMedicamento;
	}
	public void setDescricaoTipoMedicamento(String descricaoTipoMedicamento) {
		this.descricaoTipoMedicamento = descricaoTipoMedicamento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoTipoMedicamento == null) ? 0 : codigoTipoMedicamento
						.hashCode());
		result = prime
				* result
				+ ((descricaoTipoMedicamento == null) ? 0
						: descricaoTipoMedicamento.hashCode());
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
		TipoMedicamento other = (TipoMedicamento) obj;
		if (codigoTipoMedicamento == null) {
			if (other.codigoTipoMedicamento != null)
				return false;
		} else if (!codigoTipoMedicamento.equals(other.codigoTipoMedicamento))
			return false;
		if (descricaoTipoMedicamento == null) {
			if (other.descricaoTipoMedicamento != null)
				return false;
		} else if (!descricaoTipoMedicamento
				.equals(other.descricaoTipoMedicamento))
			return false;
		return true;
	}
    
	
    
}
