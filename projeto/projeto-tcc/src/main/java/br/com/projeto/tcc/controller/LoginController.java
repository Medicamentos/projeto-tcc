package br.com.projeto.tcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
		
	@RequestMapping("/login")
	public String abrirTelaLogin(){
		return "login";
	}


}
