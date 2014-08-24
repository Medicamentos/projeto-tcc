package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends ControllerBase {
	
	@RequestMapping("index")
	public String abrirHome(Model model){
		if(sessao.getAttribute("usuario") == null){
			super.homeLogica.guardarUsuario();
		}
		model.addAttribute("url", "home/home");
		return "home/index";
	}
	
}
