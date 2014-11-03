package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.UnidadeViewModel;


public class UnidadeLogica extends LogicaBase {
	
	//OK
	public UnidadeViewModel listarUnidades() {
		
		List<Unidade> listaUnidades = super.unidadeDAO.buscarTodos();
		this.sessao.setAttribute("listaUnidades", listaUnidades);
		UnidadeViewModel UnidadeViewModel = new UnidadeViewModel(listaUnidades);
		return UnidadeViewModel;
	}
	
	//OK
	public UnidadeViewModel cadastrarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		UnidadeViewModel unidadeViewMdoel = new UnidadeViewModel(listaTipoUnidade, listaBairro);
		return unidadeViewMdoel;	
	}
	
	//OK
	public void efetivarCadastroUnidade(UnidadeViewModel unidadeViewModel){

		Unidade unidade = new Unidade();
		
		Bairro bairro = new Bairro();
		bairro.setCodigoBairro(unidadeViewModel.getCodigoBairroSelecionado());
		
		TipoUnidade tipoUnidade = new TipoUnidade();
		tipoUnidade.setCodigoTipoUnidade(unidadeViewModel.getCodigoTipoUnidadeSelecionado());
		
		unidade.setNomeUnidade(unidadeViewModel.getDescricaoUnidade());
		unidade.setDescricaoEndereco(unidadeViewModel.getDescricaoEndereco());
		unidade.setBairro(bairro);
		unidade.setCep(unidadeViewModel.getCep());
		unidade.setTipoUnidade(tipoUnidade);
		unidade.setNumeroTelefone(unidadeViewModel.getNumeroTelefone());
		unidade.setStatus(true);
		
		super.unidadeDAO.salvar(unidade); 
		
	}

	
	//OK
	@SuppressWarnings("unchecked")
	public UnidadeViewModel editarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		
		List<Unidade> listaUnidades = (List<Unidade>) sessao.getAttribute("listaUnidades");
		Integer id = (Integer) sessao.getAttribute("id");	
		
		Unidade unidade = new Unidade();
		unidade.setNomeUnidade(listaUnidades.get(id).getNomeUnidade());
		unidade.setDescricaoEndereco(listaUnidades.get(id).getDescricaoEndereco());
		unidade.setNumeroTelefone(listaUnidades.get(id).getNumeroTelefone());
		unidade.setCep(listaUnidades.get(id).getCep());
		unidade.setBairro(listaUnidades.get(id).getBairro());
		unidade.setTipoUnidade(listaUnidades.get(id).getTipoUnidade());
		unidade.setStatus(listaUnidades.get(id).isStatus());
		
		UnidadeViewModel unidadeViewModel = new UnidadeViewModel(unidade, listaBairro, listaTipoUnidade);
		
		return unidadeViewModel;
	}
	
	//OK
	public void efetivarEdicaoUnidade(UnidadeViewModel unidadeViewModel){
		
		Unidade unidade = new Unidade();
		
		Bairro bairro = new Bairro();
		bairro.setCodigoBairro(unidadeViewModel.getCodigoBairroSelecionado());
		
		TipoUnidade tipoUnidade = new TipoUnidade();
		tipoUnidade.setCodigoTipoUnidade(unidadeViewModel.getCodigoTipoUnidadeSelecionado());
		
		unidade.setNomeUnidade(unidadeViewModel.getDescricaoUnidade());
		unidade.setDescricaoEndereco(unidadeViewModel.getDescricaoEndereco());
		unidade.setBairro(bairro);
		unidade.setCep(unidadeViewModel.getCep());
		unidade.setTipoUnidade(tipoUnidade);
		unidade.setNumeroTelefone(unidadeViewModel.getNumeroTelefone());
		unidade.setStatus(true);
	
		super.unidadeDAO.atualizar(unidade);
	}
	
	@SuppressWarnings("unchecked")
	public void apagarUnidade(Integer id){
		
		List<Unidade> listaUnidadeAtivas = (List<Unidade>) sessao.getAttribute("listaUnidadeAtivas");
																			
		
		Unidade unidadeSelecionada = new Unidade();
		
		unidadeSelecionada.setCodigoUnidade(listaUnidadeAtivas.get(id).getCodigoUnidade());
		unidadeSelecionada.setNomeUnidade(listaUnidadeAtivas.get(id).getNomeUnidade());
		unidadeSelecionada.setDescricaoEndereco(listaUnidadeAtivas.get(id).getDescricaoEndereco());
		unidadeSelecionada.setNumeroTelefone(listaUnidadeAtivas.get(id).getNumeroTelefone());
		unidadeSelecionada.setCep(listaUnidadeAtivas.get(id).getCep());
		unidadeSelecionada.setBairro(listaUnidadeAtivas.get(id).getBairro());
		unidadeSelecionada.setTipoUnidade(listaUnidadeAtivas.get(id).getTipoUnidade());
		unidadeSelecionada.setStatus(false);
		
		super.unidadeDAO.atualizar(unidadeSelecionada);
		
	}
	
	
	
}
