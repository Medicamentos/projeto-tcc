package br.com.projeto.tcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.tcc.bean.UsuarioBO;
import br.com.projeto.tcc.dao.UsuarioDAO;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioDAO userDAO;
	
	@RequestMapping("/login")
	public String abrirTelaLogin(){
		return "login";
	}

	@Transactional
	@RequestMapping("/salvar")
	public String teste(UsuarioBO user){
		userDAO.salvar(user);
		return "teste";
	}


}
