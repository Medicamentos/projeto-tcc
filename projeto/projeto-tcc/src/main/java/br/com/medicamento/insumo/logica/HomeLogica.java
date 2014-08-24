package br.com.medicamento.insumo.logica;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import br.com.medicamento.insumo.bean.UsuarioSistema;

@Component
public class HomeLogica extends LogicaBase {

	public void guardarUsuario() {
		String login = SecurityContextHolder.getContext().getAuthentication().getName();
		UsuarioSistema usuario = usuarioDAO.buscarPorLogin(login);
		sessao.setAttribute("usuario", usuario);
	}	

}
