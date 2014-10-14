package br.com.medicamento.insumo.logica;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.ConsultarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.EditarUnidadeViewModel;

/**
 * @author FABRICIO LUIZ FLECK
 * @since  08/2014
 * @
 * */
public class UnidadeLogica extends LogicaBase {
	
	/**
	 * @return cadastrarUnidadeViewMdoel
	 */
	public CadastrarUnidadeViewModel abrirCadastrarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		CadastrarUnidadeViewModel cadastrarUnidadeViewMdoel = new CadastrarUnidadeViewModel(listaTipoUnidade, listaBairro);
		return cadastrarUnidadeViewMdoel;	
	}

	public ConsultarUnidadeViewModel abrirConsultarUnidade() {	
		List<Unidade> listaUnidade = super.unidadeDAO.buscarTodos();	
		List<Unidade> listaUnidadeAtivas =  new ArrayList<Unidade>();

		for (Unidade unidade : listaUnidade) {

			if(unidade.isStatus()){
				Unidade unidadeAtiva = new Unidade();
				unidadeAtiva.setCodigoUnidade(unidade.getCodigoUnidade());
				unidadeAtiva.setBairro(unidade.getBairro());
				unidadeAtiva.setCep(unidade.getCep());
				unidadeAtiva.setDescricaoEndereco(unidade.getDescricaoEndereco());
				unidadeAtiva.setNomeUnidade(unidade.getNomeUnidade());
				unidadeAtiva.setNumeroTelefone1(unidade.getNumeroTelefone1());
				unidadeAtiva.setTipoUnidade(unidade.getTipoUnidade());
				listaUnidadeAtivas.add(unidadeAtiva);
			}
		}

		this.sessao.setAttribute("listaUnidade", listaUnidade);
		ConsultarUnidadeViewModel consultarUnidadeViewModel = new ConsultarUnidadeViewModel(listaUnidadeAtivas);
		return consultarUnidadeViewModel;
}
	
	@SuppressWarnings("unchecked")
	public EditarUnidadeViewModel editarUnidadeViewModel(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		
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
	
	@SuppressWarnings("unchecked")
	public void apagarUnidade(Integer id){
		
		List<Unidade> listaUnidade = (List<Unidade>) sessao.getAttribute("listaUnidade");
		
		Unidade unidadeSelecionada = new Unidade();
		
		unidadeSelecionada.setCodigoUnidade(listaUnidade.get(id).getCodigoUnidade());
		unidadeSelecionada.setNomeUnidade(listaUnidade.get(id).getNomeUnidade());
		unidadeSelecionada.setDescricaoEndereco(listaUnidade.get(id).getDescricaoEndereco());
		unidadeSelecionada.setNumeroTelefone1(listaUnidade.get(id).getNumeroTelefone1());
		unidadeSelecionada.setCep(listaUnidade.get(id).getCep());
		unidadeSelecionada.setBairro(listaUnidade.get(id).getBairro());
		unidadeSelecionada.setTipoUnidade(listaUnidade.get(id).getTipoUnidade());
		unidadeSelecionada.setStatus(false);
		
		super.unidadeDAO.atualizar(unidadeSelecionada);
		
	}
	
	public void salvarUnidade(Unidade unidade){
		
		super.unidadeDAO.salvar(unidade); 
	}
	
}
