package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home/index")
	public String abrirHome(){
		
		return "home/index";
	}
	
}
