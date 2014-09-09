package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;

public class UnidadeLogica extends LogicaBase {
	
	public CadastrarUnidadeViewModel abrirCadastrarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		CadastrarUnidadeViewModel cadastrarUnidadeViewMdoel = new CadastrarUnidadeViewModel(listaTipoUnidade, listaBairro);
		return cadastrarUnidadeViewMdoel;
	}

}
