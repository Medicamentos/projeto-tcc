package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.viewmodel.MaterialViewModel;
import br.com.medicamento.insumo.bean.*;


public class MaterialLogica extends LogicaBase {


	public MaterialViewModel consultarMaterial() {

		List<Material> materiais = super.materialDAO.buscarTodos();
		//List<TipoConteudo> tiposConteudos = super.tipoConteudoDAO.buscarTodos();
		//List<TipoControle> tiposControles = super.tipoControleDAO.buscarTodos();
		//List<TipoMedicamento> tiposMedicamentos = super.tipoMedicamentoDAO.buscarTodos();
		
		MaterialViewModel materialViewModel = new MaterialViewModel(materiais);
		return materialViewModel;
	}
}
