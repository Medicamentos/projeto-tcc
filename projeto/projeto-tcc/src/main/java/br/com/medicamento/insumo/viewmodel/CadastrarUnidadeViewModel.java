package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;

public class CadastrarUnidadeViewModel {
	
	private List<TipoUnidadeViewModel> listaTipoUnidade;
	private List<BairroViewModel> listaBairro;
	
	public CadastrarUnidadeViewModel(){
		
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
	
	
	
}
