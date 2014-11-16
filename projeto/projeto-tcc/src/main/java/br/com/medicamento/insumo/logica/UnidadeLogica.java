package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.UnidadeViewModel;


public class UnidadeLogica extends LogicaBase {
	
	//ok
	public UnidadeViewModel listarUnidades() {
		
		List<Unidade> listaUnidades = super.unidadeDAO.buscarTodos();
		this.sessao.setAttribute("listaUnidades", listaUnidades);
		UnidadeViewModel UnidadeViewModel = new UnidadeViewModel(listaUnidades);
		return UnidadeViewModel;
	}
	
	//ok
	public UnidadeViewModel cadastrarUnidade(){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		UnidadeViewModel unidadeViewMdoel = new UnidadeViewModel(listaTipoUnidade, listaBairro);
		return unidadeViewMdoel;	
	}
	
	
	//testando
	public void efetivarCadastroUnidade(UnidadeViewModel unidadeViewModel){

		Bairro bairro = new Bairro();
		bairro.setCodigoBairro(unidadeViewModel.getCodigoBairroSelecionado());
		
		TipoUnidade tipoUnidade = new TipoUnidade();
		tipoUnidade.setCodigoTipoUnidade(unidadeViewModel.getCodigoTipoUnidadeSelecionado());
		
		Unidade unidade = new Unidade();
		unidade.setNomeUnidade(unidadeViewModel.getDescricaoUnidade());
		unidade.setDescricaoEndereco(unidadeViewModel.getDescricaoEndereco());		
		unidade.setCep(unidadeViewModel.getCep());		
		unidade.setNumeroTelefone(unidadeViewModel.getNumeroTelefone());
		unidade.setStatus(unidadeViewModel.getStatus());
		unidade.setTipoUnidade(tipoUnidade);
		unidade.setBairro(bairro);
		
		super.unidadeDAO.salvar(unidade); 
		
	}

	
	@SuppressWarnings("unchecked")
	public UnidadeViewModel editarUnidade(Integer id){
		List<TipoUnidade> listaTipoUnidade = super.tipoUnidadeDAO.buscarTodos();
		List<Bairro> listaBairro = super.bairroDAO.buscarTodos();
		
		List<Unidade> listaUnidades = (List<Unidade>) sessao.getAttribute("listaUnidades");
		
		Unidade unidade = new Unidade();
		unidade.setCodigoUnidade(listaUnidades.get(id).getCodigoUnidade());
		unidade.setNomeUnidade(listaUnidades.get(id).getNomeUnidade());
		unidade.setDescricaoEndereco(listaUnidades.get(id).getDescricaoEndereco());
		unidade.setNumeroTelefone(listaUnidades.get(id).getNumeroTelefone());
		unidade.setCep(listaUnidades.get(id).getCep());
		unidade.setBairro(listaUnidades.get(id).getBairro());
		unidade.setTipoUnidade(listaUnidades.get(id).getTipoUnidade());
		unidade.setStatus(listaUnidades.get(id).getStatus());
		
		UnidadeViewModel unidadeViewModel = new UnidadeViewModel(unidade, listaBairro, listaTipoUnidade);
		
		return unidadeViewModel;
	}

	
	public void efetivarEdicaoUnidade(UnidadeViewModel unidadeViewModel){
	
	TipoUnidade tipoUnidade = new TipoUnidade();
	tipoUnidade.setCodigoTipoUnidade(unidadeViewModel.getCodigoTipoUnidadeSelecionado()); 
	
	Bairro bairro = new Bairro();
	bairro.setCodigoBairro(unidadeViewModel.getCodigoBairroSelecionado());
	
	Unidade unidade = new Unidade();
	unidade.setBairro(bairro);
	unidade.setTipoUnidade(tipoUnidade);
	unidade.setCodigoUnidade(unidadeViewModel.getCodigoUnidade());
	unidade.setNomeUnidade(unidadeViewModel.getDescricaoUnidade());
	unidade.setDescricaoEndereco(unidadeViewModel.getDescricaoEndereco());
	unidade.setNumeroTelefone(unidadeViewModel.getNumeroTelefone());
	unidade.setStatus(unidadeViewModel.getStatus());
	unidade.setCep(unidadeViewModel.getCep());
	
	this.unidadeDAO.atualizar(unidade);
	
	}
	
	
	
	
	
	
	
	
}
