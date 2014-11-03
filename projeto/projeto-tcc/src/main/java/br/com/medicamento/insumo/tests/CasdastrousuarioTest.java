package br.com.medicamento.insumo.tests;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.bean.NivelAcesso;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.bean.UsuarioSistema;
import br.com.medicamento.insumo.dao.UsuarioSistemaDAO;

public class CasdastrousuarioTest {

	public static void main(String[] args) {
		
		
	UsuarioSistema usuarioSistema = new UsuarioSistema();
		
		Cargo cargo = new Cargo();
		cargo.setCodigoCargo(2);
		cargo.setDescricaoCargo("");
		
		NivelAcesso nivelAcesso = new NivelAcesso();
		nivelAcesso.setCodigoNivelAcesso(1);
		nivelAcesso.setDescricaoNivelAcesso("");
		
		Unidade unidade = new Unidade();
		unidade.setCodigoUnidade(30);
		unidade.setDescricaoEndereco("");
		
		usuarioSistema.setCargo(cargo);
		usuarioSistema.setNivelAcesso(nivelAcesso);
		usuarioSistema.setUnidade(unidade);
		usuarioSistema.setLoginUsuarioSistema("joao");
		usuarioSistema.setNomeUsuarioSistema("Joao Freitas");
		usuarioSistema.setSenhaUsuarioSistema("123");
		usuarioSistema.setStatusAtivacao(true);
		
		UsuarioSistemaDAO usuarioDAO = new UsuarioSistemaDAO();
		usuarioDAO.salvar(usuarioSistema);
		System.out.println("usuario "+usuarioSistema.getNomeUsuarioSistema()+" cadastrado com sucesso");

	}

}
