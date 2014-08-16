package br.com.medicamento.insumo.bean;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "item_material")
public class ItemMaterial {

	@Id
	@GeneratedValue
	private Long codigoItemMaterial;
	private Long numeroLote;
	@Temporal(TemporalType.DATE)
    private Calendar dataEntrada;
	@Temporal(TemporalType.DATE)
    private Calendar dataValidade;
    private Long quantidadeItemMaterial;  
    @ManyToOne
    @JoinColumn(name="codigoNotaFiscal")
    private NotaFiscal notaFiscal; 
    @ManyToOne
    @JoinColumn(name="codigoMaterial")
    private Material material;
    @ManyToOne
    @JoinColumn(name="codigoLaboratorio")
    private Laboratorio laboratorio;   
    @ManyToOne
    @JoinColumn(name="codigoFornecedor")
    private Fornecedor fornecedor;
    
	public Long getCodigoItemMaterial() {
		return codigoItemMaterial;
	}
	public void setCodigoItemMaterial(Long codigoItemMaterial) {
		this.codigoItemMaterial = codigoItemMaterial;
	}
	public Long getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(Long numeroLote) {
		this.numeroLote = numeroLote;
	}
	public Calendar getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Long getQuantidadeItemMaterial() {
		return quantidadeItemMaterial;
	}
	public void setQuantidadeItemMaterial(Long quantidadeItemMaterial) {
		this.quantidadeItemMaterial = quantidadeItemMaterial;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((codigoItemMaterial == null) ? 0 : codigoItemMaterial
						.hashCode());
		result = prime * result
				+ ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
		result = prime * result
				+ ((dataValidade == null) ? 0 : dataValidade.hashCode());
		result = prime * result
				+ ((fornecedor == null) ? 0 : fornecedor.hashCode());
		result = prime * result
				+ ((laboratorio == null) ? 0 : laboratorio.hashCode());
		result = prime * result
				+ ((material == null) ? 0 : material.hashCode());
		result = prime * result
				+ ((notaFiscal == null) ? 0 : notaFiscal.hashCode());
		result = prime * result
				+ ((numeroLote == null) ? 0 : numeroLote.hashCode());
		result = prime
				* result
				+ ((quantidadeItemMaterial == null) ? 0
						: quantidadeItemMaterial.hashCode());
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
		ItemMaterial other = (ItemMaterial) obj;
		if (codigoItemMaterial == null) {
			if (other.codigoItemMaterial != null)
				return false;
		} else if (!codigoItemMaterial.equals(other.codigoItemMaterial))
			return false;
		if (dataEntrada == null) {
			if (other.dataEntrada != null)
				return false;
		} else if (!dataEntrada.equals(other.dataEntrada))
			return false;
		if (dataValidade == null) {
			if (other.dataValidade != null)
				return false;
		} else if (!dataValidade.equals(other.dataValidade))
			return false;
		if (fornecedor == null) {
			if (other.fornecedor != null)
				return false;
		} else if (!fornecedor.equals(other.fornecedor))
			return false;
		if (laboratorio == null) {
			if (other.laboratorio != null)
				return false;
		} else if (!laboratorio.equals(other.laboratorio))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (notaFiscal == null) {
			if (other.notaFiscal != null)
				return false;
		} else if (!notaFiscal.equals(other.notaFiscal))
			return false;
		if (numeroLote == null) {
			if (other.numeroLote != null)
				return false;
		} else if (!numeroLote.equals(other.numeroLote))
			return false;
		if (quantidadeItemMaterial == null) {
			if (other.quantidadeItemMaterial != null)
				return false;
		} else if (!quantidadeItemMaterial.equals(other.quantidadeItemMaterial))
			return false;
		return true;
	}  
	
	
	
}
