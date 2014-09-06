package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RelatoriosController {
	
	@RequestMapping("relatorios/abrirRelatorioMaterial")
	public String abrirRelatorioMaterial(Model model){
		model.addAttribute("url", "relatorios/relatorioMaterial");
		return "home/index";
	}
	
	@RequestMapping("relatorios/abrirRelatorioPedidos")
	public String abrirRelatorioPedidos(Model model){
		model.addAttribute("url", "relatorios/relatorioPedidos");
		return "home/index";
	}
	
	@RequestMapping("relatorios/abrirRelatorioUnidades")
	public String abrirRelatorioUnidades(Model model){
		model.addAttribute("url", "relatorios/relatorioUnidade");
		return "home/index";
	}


}