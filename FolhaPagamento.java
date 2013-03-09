import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FolhaPagamento {
	
	private List<Funcionario> funcionarios;
	
	public FolhaPagamento(Funcionario...funcionarios){
		this.funcionarios = Arrays.asList(funcionarios);
	}
	
	public Map<String, Double> folhaPagamento(){
		Map<String, Double> folha = new HashMap<String, Double>();
		for (Funcionario f : funcionarios)
			folha.put(f.nome(), f.calculaSalario());
		return folha;
	}

	public double calculaTotal() {
		double total = 0.0;
		for (Funcionario f : funcionarios)
			total += f.calculaSalario();
		return total;
	}

}
