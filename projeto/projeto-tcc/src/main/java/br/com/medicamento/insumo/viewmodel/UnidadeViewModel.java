package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;

public class UnidadeViewModel {

	private Integer codigoUnidade;
	private String descricaoUnidade;
	private String descricaoEndereco;
	private Integer cep;
	private Long numeroTelefone;
	private int codigoBairroSelecionado;
	private int codigoTipoUnidadeSelecionado;
	private boolean status;
	
	private Bairro bairro;
	private TipoUnidade tipoUnidade;
	private List<TipoUnidadeViewModel> listaTipoUnidade;
	private List<BairroViewModel> listaBairro;
	private List<UnidadeViewModel> listaUnidades;

	public UnidadeViewModel(Unidade unidade){
		this.codigoUnidade = unidade.getCodigoUnidade();
		this.descricaoUnidade = unidade.getNomeUnidade();
		this.descricaoEndereco = unidade.getDescricaoEndereco();
		this.cep = unidade.getCep();
		this.numeroTelefone = unidade.getNumeroTelefone();
		this.bairro = unidade.getBairro();
		this.tipoUnidade = unidade.getTipoUnidade();
		this.status = unidade.isStatus();
	}
	
	//Construtor usado para a tela de listar Unidades
	public UnidadeViewModel(List<Unidade> listaUnidadeAtivas){
		
		this.listaUnidades = new ArrayList<UnidadeViewModel>();
		
		for (Unidade unidade : listaUnidadeAtivas) {
			
			UnidadeViewModel unidadeViewModel = new UnidadeViewModel();
			
			unidadeViewModel.setCodigoUnidade(unidade.getCodigoUnidade());
			unidadeViewModel.setDescricaoUnidade(unidade.getNomeUnidade());
			unidadeViewModel.setDescricaoEndereco(unidade.getDescricaoEndereco());
			unidadeViewModel.setCep(unidade.getCep());
			unidadeViewModel.setNumeroTelefone(unidade.getNumeroTelefone());
			unidadeViewModel.setBairro(unidade.getBairro());
			unidadeViewModel.setTipoUnidade(unidade.getTipoUnidade());
			unidadeViewModel.setStatus(unidade.isStatus());
		
			listaUnidades.add(unidadeViewModel);
		}
	}
	
	//Construtor usado para abrir a tela de cadastrar nova unidade
	public UnidadeViewModel(List<TipoUnidade> listaUnidade, List<Bairro> listaBairro){
		this.listaTipoUnidade = new ArrayList<TipoUnidadeViewModel>();
		for (TipoUnidade tipoUnidade : listaUnidade) {
			TipoUnidadeViewModel tipoUnidadeViewModel = new TipoUnidadeViewModel(tipoUnidade);
			this.listaTipoUnidade.add(tipoUnidadeViewModel);
		}
		
		this.listaBairro = new ArrayList<BairroViewModel>();
		for (Bairro bairro : listaBairro) {
			BairroViewModel bairroViewModel = new BairroViewModel(bairro);
			this.listaBairro.add(bairroViewModel);
		}
	}
	
	//contrutor para editar unidade
	public UnidadeViewModel(Unidade unidade,  List<Bairro> listaBairro, List<TipoUnidade> listaTipoUnidade){
			
		this.setCodigoUnidade(unidade.getCodigoUnidade());
		this.setDescricaoUnidade(unidade.getNomeUnidade());
		this.setDescricaoEndereco(unidade.getDescricaoEndereco());
		this.setCep(unidade.getCep());
		this.setNumeroTelefone(unidade.getNumeroTelefone());

		this.setStatus(unidade.isStatus());
		this.listaTipoUnidade = new ArrayList<TipoUnidadeViewModel>();
		for (TipoUnidade tipoUnidade : listaTipoUnidade) {
			TipoUnidadeViewModel tipoUnidadeViewModel = new TipoUnidadeViewModel(tipoUnidade);
			this.listaTipoUnidade.add(tipoUnidadeViewModel);
		}
		
		this.listaBairro = new ArrayList<BairroViewModel>();
		for (Bairro bairro : listaBairro) {
			BairroViewModel bairroViewModel = new BairroViewModel(bairro);
			this.listaBairro.add(bairroViewModel);
		}
	}
	
	public UnidadeViewModel(){
		
	}

	public Integer getCodigoUnidade() {
		return codigoUnidade;
	}

	public void setCodigoUnidade(Integer codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}

	public String getDescricaoUnidade() {
		return descricaoUnidade;
	}

	public void setDescricaoUnidade(String descricaoUnidade) {
		this.descricaoUnidade = descricaoUnidade;
	}

	public String getDescricaoEndereco() {
		return descricaoEndereco;
	}

	public void setDescricaoEndereco(String descricaoEndereco) {
		this.descricaoEndereco = descricaoEndereco;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Long getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(Long numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<TipoUnidadeViewModel> getListaTipoUnidade() {
		return listaTipoUnidade;
	}

	public void setListaTipoUnidade(List<TipoUnidadeViewModel> listaTipoUnidade) {
		this.listaTipoUnidade = listaTipoUnidade;
	}

	public List<BairroViewModel> getListaBairro() {
		return listaBairro;
	}

	public void setListaBairro(List<BairroViewModel> listaBairro) {
		this.listaBairro = listaBairro;
	}

	public int getCodigoBairroSelecionado() {
		return codigoBairroSelecionado;
	}

	public void setCodigoBairroSelecionado(int codigoBairroSelecionado) {
		this.codigoBairroSelecionado = codigoBairroSelecionado;
	}

	public int getCodigoTipoUnidadeSelecionado() {
		return codigoTipoUnidadeSelecionado;
	}

	public void setCodigoTipoUnidadeSelecionado(int codigoTipoUnidadeSelecionado) {
		this.codigoTipoUnidadeSelecionado = codigoTipoUnidadeSelecionado;
	}
	
	public List<UnidadeViewModel> getListaUnidades() {
		return listaUnidades;
	}

	public void setListaUnidades(List<UnidadeViewModel> listaUnidades) {
		this.listaUnidades = listaUnidades;
	}

	
}
