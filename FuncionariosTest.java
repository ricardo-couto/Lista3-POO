import static org.junit.Assert.*;

import org.junit.Test;


public class FuncionariosTest {

	@Test
	public void testaseUmFuncionarioCalculaSeuSalario() {
		assertEquals(1580, new Funcionario("Ricardo", 1000, 1).calculaSalario(), 0);
		assertEquals(1980, new Funcionario("Ricardo", 1000, 2).calculaSalario(), 0);
		assertEquals(2380, new Funcionario("Ricardo", 1000, 3).calculaSalario(), 0);
		assertEquals(2380, new Funcionario("Ricardo", 1000, 4).calculaSalario(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoAceitaNumeroDeFilhosMenorQueZero(){
		new Funcionario("Ricardo", 1000, -1);
		new Gerente("Ricardo", 1000, -1);
		new Diretor("Ricardo", 1000, -1);
	}
	
	@Test
	public void testaseUmGerenteCalculaSeuSalario() {
		assertEquals(1850, new Gerente("Ricardo", 1000, 1).calculaSalario(), 0);
		assertEquals(3820, new Gerente("Ricardo", 2000, 3).calculaSalario(), 0);
		assertEquals(3820, new Gerente("Ricardo", 2000, 4).calculaSalario(), 0);
	}
	
	@Test
	public void testaseUmDiretorCalculaSeuSalario() {
		assertEquals(1940, new Diretor("Ricardo", 1000, 1).calculaSalario(), 0);
		assertEquals(2740, new Diretor("Ricardo", 1000, 3).calculaSalario(), 0);
		assertEquals(2740, new Diretor("Ricardo", 1000, 4).calculaSalario(), 0);
	}

}
