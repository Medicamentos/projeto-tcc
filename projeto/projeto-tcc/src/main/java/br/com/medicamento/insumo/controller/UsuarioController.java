package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.bean.UsuarioSistema;

@Controller
public class UsuarioController {

	@RequestMapping("usuario/cadastrar")
	public String abrirCadastroUsuario(){
		return "usuario/cadastrar";
	}
	
	@RequestMapping("usuario/consultar")
	public String abrirConsulta(){
		return "usuario/consultar";
	}
	
	@RequestMapping("usuario/cadastrarUsuario")
	public String cadastrarUsuario(UsuarioSistema user){
		System.out.println(user.getNomeUsuarioSistema());
		System.out.println(user.getLoginUsuarioSistema());
		return null;
	}
	
}
