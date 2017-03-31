package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

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

	

	@After

	public void excluiEmpresa() throws Exception {

		empresaDAO.exclui("89424232000180");

	}


	@Test

	public void CT01UC01FBCadastra_com_sucesso() {

		assertEquals(1, empresaDAO.adiciona(empresa));

	}
	
	public Empresa consulta(String cnpj){
		
		return empresa;
	}
@Test
public void CT01UC02FBConsultar_empresa_com_sucesso(){
	assertTrue(empresa.equals(empresaDAO.consultaEmpresa("60430951000122")));
}
}