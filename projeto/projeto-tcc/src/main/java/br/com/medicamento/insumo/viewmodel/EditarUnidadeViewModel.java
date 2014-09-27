package br.com.medicamento.insumo.viewmodel;

import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;

public class EditarUnidadeViewModel {


	
	private Unidade unidade;
	private List<Bairro> listaBairro;
	private List<TipoUnidade> listaTipoUnidade;
	
	public EditarUnidadeViewModel(Unidade unidade, List<Bairro> listaBairro, List<TipoUnidade> listaTipoUnidade) {
		this.unidade = unidade;
		this.listaBairro = listaBairro;
		this.listaTipoUnidade = listaTipoUnidade;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<Bairro> getListaBairro() {
		return listaBairro;
	}

	public void setListaBairro(List<Bairro> listaBairro) {
		this.listaBairro = listaBairro;
	}

	public List<TipoUnidade> getListaTipoUnidade() {
		return listaTipoUnidade;
	}

	public void setListaTipoUnidade(List<TipoUnidade> listaTipoUnidade) {
		this.listaTipoUnidade = listaTipoUnidade;
	}


}
