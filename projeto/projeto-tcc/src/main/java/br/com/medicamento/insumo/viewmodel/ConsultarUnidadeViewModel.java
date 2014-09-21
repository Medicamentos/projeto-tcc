package br.com.medicamento.insumo.viewmodel;

import java.util.List;

import br.com.medicamento.insumo.bean.Unidade;

public class ConsultarUnidadeViewModel {
	
	List<Unidade> unidades;
	
	public ConsultarUnidadeViewModel() {
	
	}

	//passo por parametro a lista de unidades vinda do bando de dados
	public ConsultarUnidadeViewModel(List<Unidade> listaUnidades) {
		this.unidades = listaUnidades;
	}

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}
	
	

}
