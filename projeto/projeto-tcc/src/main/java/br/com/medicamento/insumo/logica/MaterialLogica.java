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
}
