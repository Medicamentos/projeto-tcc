package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="tipo_conteudo")
public class TipoConteudo {
	
	@Id
	@GeneratedValue
	private Long codigoTipoConteudo;
    private String descricaoTipoConteudo;
	public Long getCodigoTipoConteudo() {
		return codigoTipoConteudo;
	}
	public void setCodigoTipoConteudo(Long codigoTipoConteudo) {
		this.codigoTipoConteudo = codigoTipoConteudo;
	}
	public String getDescricaoTipoConteudo() {
		return descricaoTipoConteudo;
	}
	public void setDescricaoTipoConteudo(String descricaoTipoConteudo) {
		this.descricaoTipoConteudo = descricaoTipoConteudo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoTipoConteudo == null) ? 0 : codigoTipoConteudo
						.hashCode());
		result = prime
				* result
				+ ((descricaoTipoConteudo == null) ? 0 : descricaoTipoConteudo
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
		TipoConteudo other = (TipoConteudo) obj;
		if (codigoTipoConteudo == null) {
			if (other.codigoTipoConteudo != null)
				return false;
		} else if (!codigoTipoConteudo.equals(other.codigoTipoConteudo))
			return false;
		if (descricaoTipoConteudo == null) {
			if (other.descricaoTipoConteudo != null)
				return false;
		} else if (!descricaoTipoConteudo.equals(other.descricaoTipoConteudo))
			return false;
		return true;
	}
    
	
}
