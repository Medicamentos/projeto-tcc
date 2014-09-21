package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.ConsultarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.UnidadeViewModel;

public class UnidadeLogica extends LogicaBase {
	
	public CadastrarUnidadeViewModel abrirCadastrarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		CadastrarUnidadeViewModel cadastrarUnidadeViewMdoel = new CadastrarUnidadeViewModel(listaTipoUnidade, listaBairro);
		return cadastrarUnidadeViewMdoel;
	}

	public ConsultarUnidadeViewModel abrirConsultarUnidade() {
		List<Unidade> listaUnidade = super.unidadeDAO.buscarTodos();
		ConsultarUnidadeViewModel consultarUnidadeViewModel = new ConsultarUnidadeViewModel(listaUnidade);
	
		return consultarUnidadeViewModel;
	}

}
