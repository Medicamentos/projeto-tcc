package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.TipoUnidade;

public class CadastrarUnidadeViewModel {
	
	private List<TipoUnidadeViewModel> listaTipoUnidade;
	
	public CadastrarUnidadeViewModel(){
		
	}
	
	public CadastrarUnidadeViewModel(List<TipoUnidade> listaUnidade){
		this.listaTipoUnidade = new ArrayList<TipoUnidadeViewModel>();
		for (TipoUnidade tipoUnidade : listaUnidade) {
			TipoUnidadeViewModel tipoUnidadeViewModel = new TipoUnidadeViewModel(tipoUnidade);
			this.listaTipoUnidade.add(tipoUnidadeViewModel);
		}
	}

	public List<TipoUnidadeViewModel> getListaTipoUnidade() {
		return listaTipoUnidade;
	}

	public void setListaTipoUnidade(List<TipoUnidadeViewModel> listaTipoUnidade) {
		this.listaTipoUnidade = listaTipoUnidade;
	}
	
	
	
}
