package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinhaDiretaController {
	
	@RequestMapping("linhaDireta/abrirEscreverMensagem")
	public String abrirEscreverMensagem(Model model){
		model.addAttribute("url", "linhadireta/escreverMensagem");
		return "home/index";
	}

	@RequestMapping("linhaDireta/abrirListarMensagem")
	public String abrirListarMensagem(Model model){
		model.addAttribute("url", "linhadireta/listarMensagem");
		return "home/index";
	}
}
