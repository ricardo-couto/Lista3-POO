import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class FolhaPagamentoTest {

	Funcionario funcionario = new Funcionario("Ricardo", 1000, 1);
	Gerente gerente = new Gerente("Ricardo", 2000, 3);
	Diretor diretor = new Diretor("Ricardo", 1000, 3);
	FolhaPagamento folha = new FolhaPagamento(funcionario, gerente, diretor);
	
	@Test
	public void testaSeRetornaAFolhaDePagamento() {
		Map<String, Double> esperado = new HashMap<String, Double>();
		esperado.put("Ricardo", 1580.0);
		esperado.put("Ricardo", 3820.0);
		esperado.put("Ricardo", 2740.0);
		assertEquals(esperado, folha.folhaPagamento());
	}
	
	@Test
	public void testaSeRetornaOValorTotalDaFolhaDePagamento() {
		assertEquals(8140, folha.calculaTotal(), 0);
	}

}
