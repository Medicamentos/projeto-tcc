package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.viewmodel.MaterialViewModel;

@Controller
public class MaterialController extends ControllerBase {
	
	@RequestMapping("material/abrirTelaCadastrarMaterial")
	public String abrirTelaCadastrarMaterial(Model model){
		model.addAttribute("url", "material/cadastroMaterial");
		return "home/index";
	}
	
	@RequestMapping("material/abrirTelaConsultarMaterial")
	public String abrirTelaConsultarMaterial(Model model){
		
		MaterialViewModel materialViewModel = this.materialLogica.consultarMaterial();
		this.sessao.setAttribute("materialViewModel", materialViewModel);
		model.addAttribute("materialViewModel", materialViewModel);
		model.addAttribute("url", "material/consultarMaterial");
		return "home/index";
	}
	
	@RequestMapping("material/abrirTelaEditarMaterial")
	public String abrirTelaEditarMaterial(Model model){
		model.addAttribute("url", "material/cadastroMaterial");
		return "home/index";
	}

}
