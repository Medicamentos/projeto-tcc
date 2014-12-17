package br.com.medicamento.insumo.logica;

import java.util.List;

import br.com.medicamento.insumo.bean.ItemMaterial;
import br.com.medicamento.insumo.bean.Laboratorio;
import br.com.medicamento.insumo.bean.Material;
import br.com.medicamento.insumo.viewmodel.ItemMaterialViewModel;

public class ItemMaterialLogica extends LogicaBase {

	public ItemMaterialViewModel abrirTelaCadastrarItemMaterial(Integer id) {
		List<Material> listaMaterial = super.materialDAO.buscarTodos();
		List<Laboratorio> listaLaboratorios = super.laboratorioDAO.buscarTodos();
		List<ItemMaterial> listaItemMaterial = super.itemMaterialDAO.buscarTodosPorNotaFiscal(id);
		
		ItemMaterialViewModel itemMaterialViewModel = new ItemMaterialViewModel(listaMaterial,listaLaboratorios,listaItemMaterial);
		return itemMaterialViewModel;
	}

}
