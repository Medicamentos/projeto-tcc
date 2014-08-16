package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "item_receita")
public class ItemReceita {

	@Id
	@GeneratedValue
	private Long codigoItemReceita;
	@JoinColumn(name="codigoUnidade")
    private Unidade unidade;
	@JoinColumn(name="codigoMaterial")
    private Material material;  
	@JoinColumn(name="codigoReceita")
    private Receita receita;  
    private Integer quanidadeItemReceita;
    
	public Long getCodigoItemReceita() {
		return codigoItemReceita;
	}
	public void setCodigoItemReceita(Long codigoItemReceita) {
		this.codigoItemReceita = codigoItemReceita;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Receita getReceita() {
		return receita;
	}
	public void setReceita(Receita receita) {
		this.receita = receita;
	}
	public Integer getQuanidadeItemReceita() {
		return quanidadeItemReceita;
	}
	public void setQuanidadeItemReceita(Integer quanidadeItemReceita) {
		this.quanidadeItemReceita = quanidadeItemReceita;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoItemReceita == null) ? 0 : codigoItemReceita
						.hashCode());
		result = prime * result
				+ ((material == null) ? 0 : material.hashCode());
		result = prime
				* result
				+ ((quanidadeItemReceita == null) ? 0 : quanidadeItemReceita
						.hashCode());
		result = prime * result + ((receita == null) ? 0 : receita.hashCode());
		result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
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
		ItemReceita other = (ItemReceita) obj;
		if (codigoItemReceita == null) {
			if (other.codigoItemReceita != null)
				return false;
		} else if (!codigoItemReceita.equals(other.codigoItemReceita))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (quanidadeItemReceita == null) {
			if (other.quanidadeItemReceita != null)
				return false;
		} else if (!quanidadeItemReceita.equals(other.quanidadeItemReceita))
			return false;
		if (receita == null) {
			if (other.receita != null)
				return false;
		} else if (!receita.equals(other.receita))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		return true;
	}
    
   
}
