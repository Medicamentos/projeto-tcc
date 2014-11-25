package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
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
	
	private List<MaterialViewModel> materiais;
	private List<TipoMedicamento> tiposMedicamentos;
	private List<TipoControle> tiposControles;
	private List<TipoConteudo> tiposConteudos;
	
	private Long codigoSelecionadoMaterial;
	private Long codigoSelecionadoTipoMedicamento;
	private Long codigoSelecionadoTipoControle;
	private Long codigoSelecionadoTipoConteudo;
	

	public MaterialViewModel() {
			
		}
		
	//Construtor para a tela consultarMedicamento
	public MaterialViewModel(List<Material> listaMateriais) {
		this.materiais = new ArrayList<MaterialViewModel>();
		for (Material material : listaMateriais) {
			
			MaterialViewModel materialViewModel = new MaterialViewModel();
			
			materialViewModel.setCodigoMaterial(material.getCodigoMaterial());
			materialViewModel.setDescricaoMaterial(material.getDescricaoMaterial());
			materialViewModel.setDescricaoPrincipioAtivo(material.getDescricaoPrincipioAtivo());
			materialViewModel.setValorMiligramagem(material.getValorMiligramagem());
			materialViewModel.setQuantidadeEstoqueMinimo(material.getQuantidadeEstoqueMinimo());
			materialViewModel.setTipoConteudo(material.getTipoConteudo());
			materialViewModel.setTipoControle(material.getTipoControle());
			materialViewModel.setTipoMedicamento(material.getTipoMedicamento());
			this.materiais.add(materialViewModel);
		}
				}
	
	//construtor para a tela listarMaterial
	public MaterialViewModel(List<TipoMedicamento> listaTiposMedicamento,  
							 List<TipoControle> listaTipoControle,
							 List<TipoConteudo> listaTiposConteudo) {
		
		this.tiposMedicamentos = listaTiposMedicamento;
		this.tiposControles = listaTipoControle;
		this.tiposConteudos = listaTiposConteudo;
	}
	
	
	//construtor para abrir a tela editarMaterial
	public MaterialViewModel(Material material,
			List<TipoConteudo> listaTipoConteudo,
			List<TipoControle> listaTipoControle,
			List<TipoMedicamento> listaTipoMedicamento) {
		
		this.setCodigoMaterial(material.getCodigoMaterial());
		this.setDescricaoMaterial(material.getDescricaoMaterial());
		this.setDescricaoPrincipioAtivo(material.getDescricaoPrincipioAtivo());
		this.setValorMiligramagem(material.getValorMiligramagem());
		this.setQuantidadeEstoqueMinimo(material.getQuantidadeEstoqueMinimo());
		this.setTiposConteudos(listaTipoConteudo);
		this.setTiposControles(listaTipoControle);
		this.setTiposMedicamentos(listaTipoMedicamento);
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

	public List<MaterialViewModel> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<MaterialViewModel> materiais) {
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

	public Long getCodigoSelecionadoTipoMedicamento() {
		return codigoSelecionadoTipoMedicamento;
	}

	public void setCodigoSelecionadoTipoMedicamento(
			Long codigoSelecionadoTipoMedicamento) {
		this.codigoSelecionadoTipoMedicamento = codigoSelecionadoTipoMedicamento;
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
