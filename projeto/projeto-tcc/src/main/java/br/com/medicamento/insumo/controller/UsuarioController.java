package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

	@RequestMapping("usuario/cadastrar")
	public String abrirCadastroUsuario(){
		return "usuario/cadastrar";
	}
	
}
