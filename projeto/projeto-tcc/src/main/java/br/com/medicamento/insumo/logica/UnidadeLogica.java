package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.ConsultarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.EditarUnidadeViewModel;

public class UnidadeLogica extends LogicaBase {
	
	public CadastrarUnidadeViewModel abrirCadastrarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		CadastrarUnidadeViewModel cadastrarUnidadeViewMdoel = new CadastrarUnidadeViewModel(listaTipoUnidade, listaBairro);
		return cadastrarUnidadeViewMdoel;
	}

	public ConsultarUnidadeViewModel abrirConsultarUnidade() {
		List<Unidade> listaUnidade = super.unidadeDAO.buscarTodos();
		
		this.sessao.setAttribute("listaUnidade", listaUnidade);
		ConsultarUnidadeViewModel consultarUnidadeViewModel = new ConsultarUnidadeViewModel(listaUnidade);
	
		return consultarUnidadeViewModel;
	}
	
	public EditarUnidadeViewModel editarUnidadeViewModel(){
		
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		
		@SuppressWarnings("unchecked")
		List<Unidade> listaUnidade = (List<Unidade>) sessao.getAttribute("listaUnidade");
		Integer id = (Integer) sessao.getAttribute("id");
		
		Unidade unidade = new Unidade();
		unidade.setNomeUnidade(listaUnidade.get(id).getNomeUnidade());
		unidade.setDescricaoEndereco(listaUnidade.get(id).getDescricaoEndereco());
		unidade.setNumeroTelefone1(listaUnidade.get(id).getNumeroTelefone1());
		unidade.setCep(listaUnidade.get(id).getCep());
		unidade.setBairro(listaUnidade.get(id).getBairro());
		unidade.setTipoUnidade(listaUnidade.get(id).getTipoUnidade());
		
		EditarUnidadeViewModel editarUnidadeViewModel = new EditarUnidadeViewModel(unidade, listaBairro, listaTipoUnidade);
		
		return editarUnidadeViewModel;
	}
	
}
