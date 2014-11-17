package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.viewmodel.MaterialViewModel;
import br.com.medicamento.insumo.bean.*;


public class MaterialLogica extends LogicaBase {


	public MaterialViewModel consultarMaterial() {

		List<Material> materiais = super.materialDAO.buscarTodos();
		
		MaterialViewModel materialViewModel = new MaterialViewModel(materiais);
		return materialViewModel;
	}
	
	public MaterialViewModel editarMaterial(Integer id){
		return null;
	}

	public MaterialViewModel abrirTelaCadastrarMaterial() {
		List<TipoConteudo> listaTipoConteudo = super.tipoConteudoDAO.buscarTodos();
		List<TipoControle> listaTipoControle = super.tipoControleDAO.buscarTodos();
		List<TipoMedicamento> listaTipoMedicamento = super.tipoMedicamentoDAO.buscarTodos();
		
		MaterialViewModel materialViewModel = new MaterialViewModel(listaTipoMedicamento,listaTipoControle,listaTipoConteudo);

		return materialViewModel;
	}
}
