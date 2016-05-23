package repositorios;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.qualiti.banco.TbCliente;

public class RepositorioClienteTest {

//	@Test
//	public void testList() {
//		RepositorioCliente repositorio = new RepositorioCliente();
//		TbCliente cliente = new TbCliente();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testProcurar() {
//		RepositorioCliente repositorio = new RepositorioCliente();
//		TbCliente cliente = new TbCliente();
//		fail("Not yet implemented");
//	}

	@Test
	public void testInserir() {
		RepositorioCliente repositorio = new RepositorioCliente();
		TbCliente cliente = new TbCliente();
		cliente.setCpf("12312341234");
		repositorio.inserir(cliente);
		cliente.setNome("Emmanuel Rodrigues");
//		cliente.setTbEndereco(tbEndereco);
//		cliente.setTbContas(tbContas);
//		cliente.setTbGerentesClientes(tbGerentesClientes);
		
	}

//	@Test
//	public void testRemover() {
//		RepositorioCliente repositorio = new RepositorioCliente();
//		TbCliente cliente = new TbCliente();
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testModificar() {
//		RepositorioCliente repositorio = new RepositorioCliente();
//		TbCliente cliente = new TbCliente();
//		fail("Not yet implemented");
//	}

}
