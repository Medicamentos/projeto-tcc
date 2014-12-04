package br.com.medicamento.insumo.viewmodel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.medicamento.insumo.bean.ItemMaterial;
import br.com.medicamento.insumo.bean.Laboratorio;
import br.com.medicamento.insumo.bean.Material;
import br.com.medicamento.insumo.bean.NotaFiscal;

public class NotaFiscalViewModel {
	
	//Atributos da NotaFiscal
	private Integer codigoNotaFiscal;
	private Integer numeroNotaFiscal;
	private String dataEmissao;
	private Long valor;
	private List<NotaFiscalViewModel> listaNotaFiscal;
	
	//Atributos da ItemMaterial
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
	private List<ItemMaterial> listaItensMaterial;
	
	private int codigoSelecionadoLaboratorio;
	private int codigoSelecionadoMaterial;

	public NotaFiscalViewModel() {
		
	}

	public NotaFiscalViewModel(List<NotaFiscal> listaNotaFiscal) {
		
		this.listaNotaFiscal = new ArrayList<NotaFiscalViewModel>();
		
		for (NotaFiscal notaFiscal : listaNotaFiscal) {
			NotaFiscalViewModel nota = new NotaFiscalViewModel();
			nota.setCodigoNotaFiscal(notaFiscal.getCodigoNotaFiscal());
			nota.setNumeroNotaFiscal(notaFiscal.getNumeroNotaFiscal());
			nota.setDataEmissao(formataData(notaFiscal.getDataEmissao()));
			nota.setValor(notaFiscal.getValor());
			this.listaNotaFiscal.add(nota);
		}
	}

	public NotaFiscalViewModel(NotaFiscal notaFiscal) {
		this.setCodigoNotaFiscal(notaFiscal.getCodigoNotaFiscal());
		this.setNumeroNotaFiscal(notaFiscal.getNumeroNotaFiscal());
		this.setDataEmissao(formataData(notaFiscal.getDataEmissao()));
		this.setValor(notaFiscal.getValor());
	}

	//Construtor para tela itensNotaFiscal
	public NotaFiscalViewModel(NotaFiscal notaFiscal,
			List<Material> listaMaterial, List<Laboratorio> listaLaboratorios,
			List<ItemMaterial> listaItemMaterial) {

		this.setListaItensMaterial(listaItemMaterial);
		this.setListaLaboratorio(listaLaboratorios);
		this.setListaMaterial(listaMaterial);
		this.setCodigoNotaFiscal(notaFiscal.getCodigoNotaFiscal());
		this.setNumeroNotaFiscal(notaFiscal.getNumeroNotaFiscal());
		this.setDataEmissao(formataData(notaFiscal.getDataEmissao()));
		this.setValor(notaFiscal.getValor());
		
	}
	
	public String formataData(Date data){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.format(data);	
	}

	public Integer getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}

	public void setCodigoNotaFiscal(Integer codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}

	public Integer getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(Integer numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public List<NotaFiscalViewModel> getListaNotaFiscal() {
		return listaNotaFiscal;
	}

	public void setListaNotaFiscal(List<NotaFiscalViewModel> listaNotaFiscal) {
		this.listaNotaFiscal = listaNotaFiscal;
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

}
