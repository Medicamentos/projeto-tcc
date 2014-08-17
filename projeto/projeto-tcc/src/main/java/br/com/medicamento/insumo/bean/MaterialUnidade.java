package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="material_unidade")
public class MaterialUnidade {
	
	
	@Id
	@GeneratedValue
	private Long codigoMaterialUnidade;
	@ManyToOne
	@JoinColumn(name="codigoUnidade")
    private Unidade Unidade;
	@ManyToOne
	@JoinColumn(name="codigoMaterial")
	private Material Material; 
    private Long quantidadeEstoqueMinimo;
    private Long quantidadeEstoque;
    
	public Long getCodigoMaterialUnidade() {
		return codigoMaterialUnidade;
	}
	public void setCodigoMaterialUnidade(Long codigoMaterialUnidade) {
		this.codigoMaterialUnidade = codigoMaterialUnidade;
	}
	public Unidade getUnidade() {
		return Unidade;
	}
	public void setUnidade(Unidade unidade) {
		Unidade = unidade;
	}
	public Material getMaterial() {
		return Material;
	}
	public void setMaterial(Material material) {
		Material = material;
	}
	public Long getQuantidadeEstoqueMinimo() {
		return quantidadeEstoqueMinimo;
	}
	public void setQuantidadeEstoqueMinimo(Long quantidadeEstoqueMinimo) {
		this.quantidadeEstoqueMinimo = quantidadeEstoqueMinimo;
	}
	public Long getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Long quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Material == null) ? 0 : Material.hashCode());
		result = prime * result + ((Unidade == null) ? 0 : Unidade.hashCode());
		result = prime
				* result
				+ ((codigoMaterialUnidade == null) ? 0 : codigoMaterialUnidade
						.hashCode());
		result = prime
				* result
				+ ((quantidadeEstoque == null) ? 0 : quantidadeEstoque
						.hashCode());
		result = prime
				* result
				+ ((quantidadeEstoqueMinimo == null) ? 0
						: quantidadeEstoqueMinimo.hashCode());
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
		MaterialUnidade other = (MaterialUnidade) obj;
		if (Material == null) {
			if (other.Material != null)
				return false;
		} else if (!Material.equals(other.Material))
			return false;
		if (Unidade == null) {
			if (other.Unidade != null)
				return false;
		} else if (!Unidade.equals(other.Unidade))
			return false;
		if (codigoMaterialUnidade == null) {
			if (other.codigoMaterialUnidade != null)
				return false;
		} else if (!codigoMaterialUnidade.equals(other.codigoMaterialUnidade))
			return false;
		if (quantidadeEstoque == null) {
			if (other.quantidadeEstoque != null)
				return false;
		} else if (!quantidadeEstoque.equals(other.quantidadeEstoque))
			return false;
		if (quantidadeEstoqueMinimo == null) {
			if (other.quantidadeEstoqueMinimo != null)
				return false;
		} else if (!quantidadeEstoqueMinimo
				.equals(other.quantidadeEstoqueMinimo))
			return false;
		return true;
	}
    
    
}
