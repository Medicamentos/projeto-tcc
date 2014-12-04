package br.com.medicamento.insumo.viewmodel;

import java.util.Calendar;
import java.util.List;

import br.com.medicamento.insumo.bean.Laboratorio;
import br.com.medicamento.insumo.bean.Material;
import br.com.medicamento.insumo.bean.NotaFiscal;

public class ItemMaterialViewModel {
	
	private Long codigoItemMaterial;
	private Long numeroLote;
	private Calendar dataEntrada;
	private Calendar dataValidade;
	private Long quantidadeItemMaterial;  
	private NotaFiscal notaFiscal; 
	private Material material;
	private Laboratorio laboratorio;  
	
	private List<Laboratorio> listaLaboratorio;
	private List<Material> listaMaterial;
	private List<ItemMaterialViewModel> listaItensMaterial;
	
	private int codigoSelecionadoLaboratorio;
	private int codigoSelecionadoMaterial;
	
	public ItemMaterialViewModel() {
	}

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

	public List<Laboratorio> getListaLaboratorio() {
		return listaLaboratorio;
	}

	public void setListaLaboratorio(List<Laboratorio> listaLaboratorio) {
		this.listaLaboratorio = listaLaboratorio;
	}

	public List<Material> getListaMaterial() {
		return listaMaterial;
	}

	public void setListaMaterial(List<Material> listaMaterial) {
		this.listaMaterial = listaMaterial;
	}

	public List<ItemMaterialViewModel> getListaItensMaterial() {
		return listaItensMaterial;
	}

	public void setListaItensMaterial(List<ItemMaterialViewModel> listaItensMaterial) {
		this.listaItensMaterial = listaItensMaterial;
	}

	public int getCodigoSelecionadoLaboratorio() {
		return codigoSelecionadoLaboratorio;
	}

	public void setCodigoSelecionadoLaboratorio(int codigoSelecionadoLaboratorio) {
		this.codigoSelecionadoLaboratorio = codigoSelecionadoLaboratorio;
	}

	public int getCodigoSelecionadoMaterial() {
		return codigoSelecionadoMaterial;
	}

	public void setCodigoSelecionadoMaterial(int codigoSelecionadoMaterial) {
		this.codigoSelecionadoMaterial = codigoSelecionadoMaterial;
	}
	
}
