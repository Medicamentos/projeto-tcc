package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.viewmodel.MaterialViewModel;
import br.com.medicamento.insumo.bean.*;


public class MaterialLogica extends LogicaBase {


	public MaterialViewModel consultarMaterial() {

		List<Material> materiais = super.materialDAO.buscarTodos();
		this.sessao.setAttribute("materiais", materiais);
		MaterialViewModel materialViewModel = new MaterialViewModel(materiais);
		return materialViewModel;
	}
	
	@SuppressWarnings("unchecked")
	public MaterialViewModel abrirTelaEditarMaterial(Integer id){
		
		List<TipoConteudo> listaTipoConteudo = super.tipoConteudoDAO.buscarTodos();
		List<TipoControle> listaTipoControle = super.tipoControleDAO.buscarTodos();
		List<TipoMedicamento> listaTipoMedicamento = super.tipoMedicamentoDAO.buscarTodos();
		List<Material> listaMatrial = (List<Material>) sessao.getAttribute("materiais");
		
		Material material = new Material();
		material.setCodigoMaterial(listaMatrial.get(id).getCodigoMaterial());
		material.setDescricaoMaterial(listaMatrial.get(id).getDescricaoMaterial());
		material.setDescricaoPrincipioAtivo(listaMatrial.get(id).getDescricaoPrincipioAtivo());
		material.setQuantidadeEstoqueMinimo(listaMatrial.get(id).getQuantidadeEstoqueMinimo());
		material.setValorMiligramagem(listaMatrial.get(id).getValorMiligramagem());
		
		
		MaterialViewModel materialViewModel = new MaterialViewModel(material, listaTipoConteudo, listaTipoControle, listaTipoMedicamento);
		
		return materialViewModel;
	}

	public MaterialViewModel abrirTelaCadastrarMaterial() {
		List<TipoConteudo> listaTipoConteudo = super.tipoConteudoDAO.buscarTodos();
		List<TipoControle> listaTipoControle = super.tipoControleDAO.buscarTodos();
		List<TipoMedicamento> listaTipoMedicamento = super.tipoMedicamentoDAO.buscarTodos();
		
		MaterialViewModel materialViewModel = new MaterialViewModel(listaTipoMedicamento,listaTipoControle,listaTipoConteudo);

		return materialViewModel;
	}
	
	public void editarMaterial(MaterialViewModel materialViewModel){
		
		TipoConteudo tipoConteudo = new TipoConteudo();
		tipoConteudo.setCodigoTipoConteudo(materialViewModel.getCodigoSelecionadoTipoConteudo());
		
		TipoControle tipoControle = new TipoControle();
		tipoControle.setCodigoTipoControle(materialViewModel.getCodigoSelecionadoTipoControle());
		
		TipoMedicamento tipoMedicamento = new TipoMedicamento();
		tipoMedicamento.setCodigoTipoMedicamento(materialViewModel.getCodigoSelecionadoTipoMedicamento());
		
		Material material = new Material();
		
		material.setCodigoMaterial(materialViewModel.getCodigoMaterial());
		material.setDescricaoMaterial(materialViewModel.getDescricaoMaterial());
		material.setDescricaoPrincipioAtivo(materialViewModel.getDescricaoPrincipioAtivo());
		material.setQuantidadeEstoqueMinimo(materialViewModel.getQuantidadeEstoqueMinimo());
		material.setValorMiligramagem(materialViewModel.getValorMiligramagem());
		material.setTipoConteudo(tipoConteudo);
		material.setTipoControle(tipoControle);
		material.setTipoMedicamento(tipoMedicamento);
		
		this.materialDAO.atualizar(material);
		
	}

	public void cadastrarMarerial(MaterialViewModel materialViewModel) {
		
		TipoConteudo tipoConteudo = new TipoConteudo();
		tipoConteudo.setCodigoTipoConteudo(materialViewModel.getCodigoSelecionadoTipoConteudo());
		
		TipoControle tipoControle = new TipoControle();
		tipoControle.setCodigoTipoControle(materialViewModel.getCodigoSelecionadoTipoControle());
		
		TipoMedicamento tipoMedicamento = new TipoMedicamento();
		tipoMedicamento.setCodigoTipoMedicamento(materialViewModel.getCodigoSelecionadoTipoMedicamento());
		
		Material material = new Material();
		
		//material.setCodigoMaterial(materialViewModel.getCodigoMaterial());
		material.setDescricaoMaterial(materialViewModel.getDescricaoMaterial());
		material.setDescricaoPrincipioAtivo(materialViewModel.getDescricaoPrincipioAtivo());
		material.setQuantidadeEstoqueMinimo(materialViewModel.getQuantidadeEstoqueMinimo());
		material.setValorMiligramagem(materialViewModel.getValorMiligramagem());
		material.setTipoConteudo(tipoConteudo);
		material.setTipoControle(tipoControle);
		material.setTipoMedicamento(tipoMedicamento);
		
		this.materialDAO.salvar(material);
	}
}
