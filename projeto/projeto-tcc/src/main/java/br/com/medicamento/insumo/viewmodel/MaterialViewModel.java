package br.com.medicamento.insumo.viewmodel;

import java.util.List;

import br.com.medicamento.insumo.bean.Material;
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
	
	private List<Material> materiais;
	private List<TipoMedicamento> tiposMedicamentos;
	private List<TipoControle> tiposControles;
	private List<TipoConteudo> tiposConteudos;
	private Long codigoSelecionadoMaterial;
	private Long codigoSelecionadoTiposMedicamento;
	private Long codigoSelecionadoTipoControle;
	private Long codigoSelecionadoTipoConteudo;
	
	//Construtor default
		public MaterialViewModel() {
				}
		
	//Construtor para a tela ConsultarMedicamento.jsp
	public MaterialViewModel(List<Material> materiais) {
		this.materiais = materiais;
				}
	
	
	public MaterialViewModel(List<TipoMedicamento> tiposMedicamentos,  
							 List<TipoControle> tiposControles,
							 List<TipoConteudo> tiposConteudos) {
		
		this.tiposMedicamentos = tiposMedicamentos;
		this.tiposControles = tiposControles;
		this.tiposConteudos = tiposConteudos;
	}
	
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
	public List<Material> getMateriais() {
		return materiais;
	}
	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}
	public List<TipoMedicamento> getTiposMedicamentos() {
		return tiposMedicamentos;
	}
	public void setTiposMedicamentos(List<TipoMedicamento> tiposMedicamentos) {
		this.tiposMedicamentos = tiposMedicamentos;
	}
	public List<TipoControle> getTiposControles() {
		return tiposControles;
	}
	public void setTiposControles(List<TipoControle> tiposControles) {
		this.tiposControles = tiposControles;
	}
	public List<TipoConteudo> getTiposConteudos() {
		return tiposConteudos;
	}
	public void setTiposConteudos(List<TipoConteudo> tiposConteudos) {
		this.tiposConteudos = tiposConteudos;
	}
	public Long getCodigoSelecionadoMaterial() {
		return codigoSelecionadoMaterial;
	}
	public void setCodigoSelecionadoMaterial(Long codigoSelecionadoMaterial) {
		this.codigoSelecionadoMaterial = codigoSelecionadoMaterial;
	}
	public Long getCodigoSelecionadoTiposMedicamento() {
		return codigoSelecionadoTiposMedicamento;
	}
	public void setCodigoSelecionadoTiposMedicamento(
			Long codigoSelecionadoTiposMedicamento) {
		this.codigoSelecionadoTiposMedicamento = codigoSelecionadoTiposMedicamento;
	}
	public Long getCodigoSelecionadoTipoControle() {
		return codigoSelecionadoTipoControle;
	}
	public void setCodigoSelecionadoTipoControle(Long codigoSelecionadoTipoControle) {
		this.codigoSelecionadoTipoControle = codigoSelecionadoTipoControle;
	}
	public Long getCodigoSelecionadoTipoConteudo() {
		return codigoSelecionadoTipoConteudo;
	}
	public void setCodigoSelecionadoTipoConteudo(Long codigoSelecionadoTipoConteudo) {
		this.codigoSelecionadoTipoConteudo = codigoSelecionadoTipoConteudo;
	}
	
	
}
