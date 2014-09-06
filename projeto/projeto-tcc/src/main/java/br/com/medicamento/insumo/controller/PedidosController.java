package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PedidosController {
	
	@RequestMapping("pedidos/abrirPedidos")
	public String abrirPedidos(Model model){
		model.addAttribute("url", "pedidos/pedidos");
		return "home/index";
	}

}
