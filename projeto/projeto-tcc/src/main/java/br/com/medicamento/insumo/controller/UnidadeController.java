package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnidadeController {
	
	@RequestMapping("unidade/abrirCadastrarUnidade")
	public String abrirCadastrarUnidade(Model model){
		model.addAttribute("url" , "unidade/cadastrar");
		return "home/index";
	}
	
	@RequestMapping("unidade/abrirConsultarUnidade")
	public String abrirConsultarUnidade(Model model){
		model.addAttribute("url" , "unidade/consultaUnidade");
		return "home/index";
	}

}
