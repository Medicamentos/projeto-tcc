package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.viewmodel.MaterialViewModel;

@Controller
public class MaterialController extends ControllerBase {
	
	//ok
		@RequestMapping("material/abrirTelaConsultarMaterial")
		public String abrirTelaConsultarMaterial(Model model){
			
			MaterialViewModel materialViewModel = this.materialLogica.consultarMaterial();
			this.sessao.setAttribute("materialViewModel", materialViewModel);
			model.addAttribute("materialViewModel", materialViewModel);
			model.addAttribute("url", "material/consultarMaterial");
			return "home/index";
		}
	//ok
	@RequestMapping("material/abrirTelaCadastrarMaterial")
	public String abrirTelaCadastrarMaterial(Model model){
		
		MaterialViewModel materialViewModel = this.materialLogica.abrirTelaCadastrarMaterial();
		model.addAttribute("materialViewModel", materialViewModel);
		model.addAttribute("url", "material/cadastrarMaterial");
		return "home/index";
	}
	//ok
	@RequestMapping("material/abrirTelaEditarMaterial/{id}")
	public String abrirTelaEditarMaterial(Model model, @PathVariable("id") Integer id){
		
		MaterialViewModel materialViewModel = this.materialLogica.abrirTelaEditarMaterial(id);
		
		model.addAttribute("materialViewModel",materialViewModel);
		model.addAttribute("url", "material/editarMaterial");
		return "home/index";
	}
	//ok
	@RequestMapping("material/editarMaterial")
	public String editarMaterial(Model model, MaterialViewModel materialViewModel){
		
		this.materialLogica.editarMaterial(materialViewModel);
		return abrirTelaConsultarMaterial(model);
	}
	//fazendo
	@RequestMapping("material/cadastrarMaterial")
	public String cadastrarMaterial(Model model, MaterialViewModel materialViewModel){
		
		this.materialLogica.cadastrarMarerial(materialViewModel);
		return abrirTelaConsultarMaterial(model);
	}
	
	
	
	
}
