package br.com.medicamento.insumo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.bean.UsuarioSistema;
import br.com.medicamento.insumo.dao.UsuarioSistemaDAO;

@Controller
public class HomeController {

	@Autowired
	private HttpSession sessao;
	
	@Autowired
	private UsuarioSistemaDAO usuarioDAO;
	
	@RequestMapping("index")
	public String abrirHome(Model model){
		if(sessao.getAttribute("usuario") == null){
			this.guardarUsuario();
		}
		model.addAttribute("url", "home/home");
		return "home/index";
	}
	
	private void guardarUsuario(){
		String login = SecurityContextHolder.getContext().getAuthentication().getName();
		UsuarioSistema usuario = usuarioDAO.buscarPorLogin(login);
		sessao.setAttribute("usuario", usuario);
	}
	
}
