package br.com.medicamento.insumo.logica;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.medicamento.insumo.dao.BairroDAO;
import br.com.medicamento.insumo.dao.CargoDAO;
import br.com.medicamento.insumo.dao.MaterialDAO;
import br.com.medicamento.insumo.dao.NivelAcessoDAO;
import br.com.medicamento.insumo.dao.NotaFiscalDAO;
import br.com.medicamento.insumo.dao.TipoConteudoDAO;
import br.com.medicamento.insumo.dao.TipoControleDAO;
import br.com.medicamento.insumo.dao.TipoMedicamentoDAO;
import br.com.medicamento.insumo.dao.TipoUnidadeDAO;
import br.com.medicamento.insumo.dao.UnidadeDAO;
import br.com.medicamento.insumo.dao.UsuarioSistemaDAO;

public abstract class LogicaBase {

	@Autowired
	protected HttpSession sessao;
	
	//Classes DAO
	@Autowired
	protected UsuarioSistemaDAO usuarioDAO;
	
	@Autowired
	protected NivelAcessoDAO nivelAcessoDAO;
	
	@Autowired
	protected CargoDAO cargoDAO;
	
	@Autowired 
	protected TipoUnidadeDAO tipoUnidadeDAO;
	
	@Autowired
	protected BairroDAO bairroDAO;
	
	@Autowired
	protected UnidadeDAO unidadeDAO;
	
	@Autowired
	protected MaterialDAO materialDAO;
	
	@Autowired
	protected TipoConteudoDAO tipoConteudoDAO;
	
	@Autowired
	protected TipoControleDAO tipoControleDAO;
	
	@Autowired
	protected TipoMedicamentoDAO tipoMedicamentoDAO;
	
	@Autowired
	protected NotaFiscalDAO notaFiscalDAO;
	
	
}
