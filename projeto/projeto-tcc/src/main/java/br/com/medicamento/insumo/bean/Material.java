package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="material")
public class Material {

	@Id
	@GeneratedValue
	private Long codigoMaterial;
	private String descricaoMaterial;
	private String descricaoPrincipioAtivo;
	private Long valorMiligramagem;
	private Long quantidadeEstoqueMinimo;
	private Long quantidadeEstoque; //estudar se esse atributo deve realmente ser aqui ou na tabela 'Material_Unidade'
	@ManyToOne
	@JoinColumn(name="codigoTipoMedicamento")
	private TipoMedicamento tipoMedicamento;
	@ManyToOne
	@JoinColumn(name="codigoTipoControle")
	private TipoControle  tipoControle; 
	@ManyToOne
	@JoinColumn(name="codigoTipoConteudo")
	private TipoConteudo  tipoConteudo;
	
	public Long getCodigoMaterial() {
		return codigoMaterial;
	}
	public void setCodigoMaterial(Long codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}
	public String getDescricaoMaterial() {
		return descricaoMaterial;
	}
	public void setDescricaoMaterial(String descricaoMaterial) {
		this.descricaoMaterial = descricaoMaterial;
	}
	public String getDescricaoPrincipioAtivo() {
		return descricaoPrincipioAtivo;
	}
	public void setDescricaoPrincipioAtivo(String descricaoPrincipioAtivo) {
		this.descricaoPrincipioAtivo = descricaoPrincipioAtivo;
	}
	public Long getValorMiligramagem() {
		return valorMiligramagem;
	}
	public void setValorMiligramagem(Long valorMiligramagem) {
		this.valorMiligramagem = valorMiligramagem;
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
	public TipoMedicamento getTipoMedicamento() {
		return tipoMedicamento;
	}
	public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}
	public TipoControle getTipoControle() {
		return tipoControle;
	}
	public void setTipoControle(TipoControle tipoControle) {
		this.tipoControle = tipoControle;
	}
	public TipoConteudo getTipoConteudo() {
		return tipoConteudo;
	}
	public void setTipoConteudo(TipoConteudo tipoConteudo) {
		this.tipoConteudo = tipoConteudo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoMaterial == null) ? 0 : codigoMaterial.hashCode());
		result = prime
				* result
				+ ((descricaoMaterial == null) ? 0 : descricaoMaterial
						.hashCode());
		result = prime
				* result
				+ ((descricaoPrincipioAtivo == null) ? 0
						: descricaoPrincipioAtivo.hashCode());
		result = prime
				* result
				+ ((quantidadeEstoque == null) ? 0 : quantidadeEstoque
						.hashCode());
		result = prime
				* result
				+ ((quantidadeEstoqueMinimo == null) ? 0
						: quantidadeEstoqueMinimo.hashCode());
		result = prime * result
				+ ((tipoConteudo == null) ? 0 : tipoConteudo.hashCode());
		result = prime * result
				+ ((tipoControle == null) ? 0 : tipoControle.hashCode());
		result = prime * result
				+ ((tipoMedicamento == null) ? 0 : tipoMedicamento.hashCode());
		result = prime
				* result
				+ ((valorMiligramagem == null) ? 0 : valorMiligramagem
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
		Material other = (Material) obj;
		if (codigoMaterial == null) {
			if (other.codigoMaterial != null)
				return false;
		} else if (!codigoMaterial.equals(other.codigoMaterial))
			return false;
		if (descricaoMaterial == null) {
			if (other.descricaoMaterial != null)
				return false;
		} else if (!descricaoMaterial.equals(other.descricaoMaterial))
			return false;
		if (descricaoPrincipioAtivo == null) {
			if (other.descricaoPrincipioAtivo != null)
				return false;
		} else if (!descricaoPrincipioAtivo
				.equals(other.descricaoPrincipioAtivo))
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
		if (tipoConteudo == null) {
			if (other.tipoConteudo != null)
				return false;
		} else if (!tipoConteudo.equals(other.tipoConteudo))
			return false;
		if (tipoControle == null) {
			if (other.tipoControle != null)
				return false;
		} else if (!tipoControle.equals(other.tipoControle))
			return false;
		if (tipoMedicamento == null) {
			if (other.tipoMedicamento != null)
				return false;
		} else if (!tipoMedicamento.equals(other.tipoMedicamento))
			return false;
		if (valorMiligramagem == null) {
			if (other.valorMiligramagem != null)
				return false;
		} else if (!valorMiligramagem.equals(other.valorMiligramagem))
			return false;
		return true;
	} 
	
	
	
}
