package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.viewmodel.ItemMaterialViewModel;
import br.com.medicamento.insumo.viewmodel.NotaFiscalViewModel;

@Controller
public class ItemMaterialController extends ControllerBase {
	
	@RequestMapping("itemMaterial/abrirTelaCadastrarItemMaterial/{id}")
	public String abrirTelaCadastrarItemMaterial(Model model, @PathVariable("id") Integer id){
		
		NotaFiscalViewModel notaFiscalViewModel = super.notaFiscalLogica.abrirTelaAdicionarItensNotaFiscal(id);
		
		ItemMaterialViewModel itemMaterialViewModel = super.itemMaterialLogica.abrirTelaCadastrarItemMaterial(id);
		
		model.addAttribute("notaFiscalViewModel", notaFiscalViewModel);
		model.addAttribute("itemMaterialViewModel", itemMaterialViewModel);
		model.addAttribute("url", "itemMaterial/cadastrarItemMaterial");	
		return "home/index";
	}
	

}
