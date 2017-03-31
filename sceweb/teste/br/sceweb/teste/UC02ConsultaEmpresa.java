package br.sceweb.teste;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultaEmpresa {

	static EmpresaDAO empresaDAO;

	static Empresa empresa;

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		empresaDAO = new EmpresaDAO();

		empresa = new Empresa();

		empresa.setNomeDaEmpresa("Casas Bahia S/A");

		empresa.setCnpj("60430951000122");

		empresa.setNomeFantasia("Casas Bahia");

		empresa.setEndereco("rua taquari");

		empresa.setTelefone("111111");

	}

	public Empresa consulta(String cnpj) {

		return empresa;
	}

	@Test
	public void CT01UC02FBConsultar_empresa_com_sucesso() {
		assertTrue(empresa.equals(empresaDAO.consultaEmpresa("60430951000122")));
	}
}
