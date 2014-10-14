package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;

public class CadastrarUnidadeViewModel {

	private Integer codigoUnidade;
	private String nomeUnidade;
	private String descricaoEndereco;
	private Integer cep;
	private Long numeroTelefone1;
	private List<TipoUnidadeViewModel> listaTipoUnidade;
	private List<BairroViewModel> listaBairro;
	private int codigoBairroSelecionado;
	private int codigoTipoUnidadeSelecionado;


	


	public CadastrarUnidadeViewModel(){
		
	}
	
	
	public Integer getCodigoUnidade() {
		return codigoUnidade;
	}


	public void setCodigoUnidade(Integer codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}


	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
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

	public Long getNumeroTelefone1() {
		return numeroTelefone1;
	}

	public void setNumeroTelefone1(Long numeroTelefone1) {
		this.numeroTelefone1 = numeroTelefone1;
	}
	
	public CadastrarUnidadeViewModel(List<TipoUnidade> listaUnidade, List<Bairro> listaBairro){
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
	
}
