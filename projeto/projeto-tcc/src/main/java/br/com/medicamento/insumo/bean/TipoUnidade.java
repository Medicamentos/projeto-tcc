package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="tipo_unidade")
public class TipoUnidade {

	@Id
	@GeneratedValue
	private Integer codigoTipoUnidade;
    private String descricaoTipoUnidade;
    
	public Integer getCodigoTipoUnidade() {
		return codigoTipoUnidade;
	}
	public void setCodigoTipoUnidade(Integer codigoTipoUnidade) {
		this.codigoTipoUnidade = codigoTipoUnidade;
	}
	public String getDescricaoTipoUnidade() {
		return descricaoTipoUnidade;
	}
	public void setDescricaoTipoUnidade(String descricaoTipoUnidade) {
		this.descricaoTipoUnidade = descricaoTipoUnidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoTipoUnidade == null) ? 0 : codigoTipoUnidade
						.hashCode());
		result = prime
				* result
				+ ((descricaoTipoUnidade == null) ? 0 : descricaoTipoUnidade
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
		TipoUnidade other = (TipoUnidade) obj;
		if (codigoTipoUnidade == null) {
			if (other.codigoTipoUnidade != null)
				return false;
		} else if (!codigoTipoUnidade.equals(other.codigoTipoUnidade))
			return false;
		if (descricaoTipoUnidade == null) {
			if (other.descricaoTipoUnidade != null)
				return false;
		} else if (!descricaoTipoUnidade.equals(other.descricaoTipoUnidade))
			return false;
		return true;
	}
    
    
}
