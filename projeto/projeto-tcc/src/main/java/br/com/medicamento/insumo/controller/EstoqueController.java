package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstoqueController {
	
	@RequestMapping("estoque/cadastrarNotaFiscal")
	public String abrirCadastrarNotaFiscal(Model model){
		model.addAttribute("url", "estoque/cadastroNotaFiscal");
	return "home/index";	
	}

	@RequestMapping("estoque/abrirCadastrarItensNotaFiscal")
	public String abrirCadastrarItensNotaFiscal(Model model){
		model.addAttribute("url", "estoque/cadastroItensNotaFiscal");
	return "home/index";	
	}
	
	@RequestMapping("estoque/abrirConsultarEstoque")
	public String abrirConsultarEstoque(Model model){
		model.addAttribute("url", "estoque/ConsultaEstoque");
	return "home/index";	
	}
}
