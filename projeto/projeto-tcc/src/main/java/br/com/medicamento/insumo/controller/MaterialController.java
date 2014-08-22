package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaterialController {
	
	@RequestMapping("material/abrirCadastroMaterial")
	public String abrirCadastroMaterial(Model model){
		model.addAttribute("url", "material/cadastroMaterial");
		return "home/index";
	}

}
