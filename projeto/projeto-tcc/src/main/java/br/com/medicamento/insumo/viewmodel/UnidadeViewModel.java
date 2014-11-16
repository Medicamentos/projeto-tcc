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
	private boolean status;
	
	private Bairro bairro;
	private TipoUnidade tipoUnidade;
	
	private List<TipoUnidade> listaTipoUnidade;
	private List<Bairro> listaBairro;
	private List<UnidadeViewModel> listaUnidadesViewModel;

	private int codigoBairroSelecionado;
	private int codigoTipoUnidadeSelecionado;
	
	public UnidadeViewModel(){}

	public UnidadeViewModel(Unidade unidade){
		this.codigoUnidade = unidade.getCodigoUnidade();
		this.descricaoUnidade = unidade.getNomeUnidade();
		this.descricaoEndereco = unidade.getDescricaoEndereco();
		this.cep = unidade.getCep();
		this.numeroTelefone = unidade.getNumeroTelefone();
		this.bairro = unidade.getBairro();
		this.tipoUnidade = unidade.getTipoUnidade();
		this.status = unidade.getStatus();
	}
	
	//Tela de listarUnidades
	public UnidadeViewModel(List<Unidade> listaUnidadeAtivas){
		
		this.listaUnidadesViewModel = new ArrayList<UnidadeViewModel>();
		
		for (Unidade unidade : listaUnidadeAtivas) {
			
			UnidadeViewModel unidadeViewModel = new UnidadeViewModel();
			
			unidadeViewModel.setCodigoUnidade(unidade.getCodigoUnidade());
			unidadeViewModel.setDescricaoUnidade(unidade.getNomeUnidade());
			unidadeViewModel.setDescricaoEndereco(unidade.getDescricaoEndereco());
			unidadeViewModel.setCep(unidade.getCep());
			unidadeViewModel.setNumeroTelefone(unidade.getNumeroTelefone());
			unidadeViewModel.setBairro(unidade.getBairro());
			unidadeViewModel.setTipoUnidade(unidade.getTipoUnidade());
			unidadeViewModel.setStatus(unidade.getStatus());
		
			listaUnidadesViewModel.add(unidadeViewModel);
		}
	}
	
	//Tela cadastrarUnidade
	public UnidadeViewModel(List<TipoUnidade> listaTipoUnidade, List<Bairro> listaBairro){
		this.listaBairro = listaBairro;
		this.listaTipoUnidade = listaTipoUnidade;
	}
	
	
	//Tela editarUnidade
	public UnidadeViewModel(Unidade unidade,  List<Bairro> listaBairro, List<TipoUnidade> listaTipoUnidade){
	
		this.listaBairro = listaBairro;
		this.listaTipoUnidade = listaTipoUnidade;
		this.cep = unidade.getCep();
		this.codigoUnidade = unidade.getCodigoUnidade();
		this.descricaoEndereco = unidade.getDescricaoEndereco();
		this.descricaoUnidade = unidade.getNomeUnidade();
		this.numeroTelefone = unidade.getNumeroTelefone();
		this.status = unidade.getStatus();
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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public List<TipoUnidade> getListaTipoUnidade() {
		return listaTipoUnidade;
	}

	public void setListaTipoUnidade(List<TipoUnidade> listaTipoUnidade) {
		this.listaTipoUnidade = listaTipoUnidade;
	}

	public List<Bairro> getListaBairro() {
		return listaBairro;
	}

	public void setListaBairro(List<Bairro> listaBairro) {
		this.listaBairro = listaBairro;
	}

	public List<UnidadeViewModel> getListaUnidadesViewModel() {
		return listaUnidadesViewModel;
	}

	public void setListaUnidadesViewModel(
			List<UnidadeViewModel> listaUnidadesViewModel) {
		this.listaUnidadesViewModel = listaUnidadesViewModel;
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
	
}
