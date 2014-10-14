package br.com.medicamento.insumo.viewmodel;

import java.util.List;

import br.com.medicamento.insumo.bean.TipoConteudo;
import br.com.medicamento.insumo.bean.TipoControle;
import br.com.medicamento.insumo.bean.TipoMedicamento;

public class MaterialViewModel {
	
	private Long codigoMaterial;
	private String descricaoMaterial;
	private String descricaoPrincipioAtivo;
	private Long valorMiligramagem;
	private Long quantidadeEstoqueMinimo;
	private Long quantidadeEstoque;
	private TipoMedicamento tipoMedicamento;
	private TipoControle  tipoControle; 
	private TipoConteudo  tipoConteudo;
	private List<MaterialViewModel> materiais;
	
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
	public List<MaterialViewModel> getMateriais() {
		return materiais;
	}
	public void setMateriais(List<MaterialViewModel> materiais) {
		this.materiais = materiais;
	}

}
