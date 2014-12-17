package br.com.medicamento.insumo.viewmodel;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.medicamento.insumo.bean.ItemMaterial;
import br.com.medicamento.insumo.bean.Laboratorio;
import br.com.medicamento.insumo.bean.Material;
import br.com.medicamento.insumo.bean.NotaFiscal;


public class ItemMaterialViewModel {
	
	private Long codigoItemMaterial;
	private Long numeroLote;
	private String dataEntrada;
	private String dataValidade;
	private Long quantidadeItemMaterial;  
	private NotaFiscal notaFiscal; 
	private Material material;
	private Laboratorio laboratorio;  
	
	private List<Laboratorio> listaLaboratorio;
	private List<Material> listaMaterial;
	private List<ItemMaterial> listaItensMaterial;
	
	private int codigoSelecionadoLaboratorio;
	private int codigoSelecionadoMaterial;
	
	public ItemMaterialViewModel(){
		
	}

	//construtor para a tema cadastrasItemMaterial
	public ItemMaterialViewModel(List<Material> listaMaterial,
			List<Laboratorio> listaLaboratorio,
			List<ItemMaterial> listaItemMaterial) {
		
		this.setListaItensMaterial(listaItemMaterial);
		this.setListaLaboratorio(listaLaboratorio);
		this.setListaMaterial(listaMaterial);
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

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
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

	public List<ItemMaterial> getListaItensMaterial() {
		return listaItensMaterial;
	}

	public void setListaItensMaterial(List<ItemMaterial> listaItensMaterial) {
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

	static String formatarValor(Long valor){
		
		NumberFormat formataValor= NumberFormat.getInstance();
		return formataValor.format(valor);
		
	}
	
	public String formataData(Date data){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.format(data);	
	}
	
	public String formataValor(Long valor){
		NumberFormat formataValor = NumberFormat.getCurrencyInstance();
		return formataValor.format(valor);
	}
}
