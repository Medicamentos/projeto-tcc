package br.com.medicamento.insumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.bean.UsuarioSistema;
import br.com.medicamento.insumo.dao.UsuarioSistamaDAO;


@Controller
public class LoginController {
		
	@Autowired
	private UsuarioSistamaDAO usuarioDAO;
	
	@RequestMapping("/login")
	public String abrirTelaLogin(){
		return "login";
	}
	
	@RequestMapping("/teste")
	public String salvar(UsuarioSistema usuario){	
		return "teste";
	}
	
}
