
public class Funcionario {

	private String nome;
	protected double salario;
	private int numeroFilhos;
	
	public static final double VALOR_AUXILIO_CHECHE = 400.0;
	public static final double VALOR_AUXILIO_ALIMENTACAO = 280.0;

	public Funcionario(String nome, double salario, int numeroFilhos) {
		this.nome = nome;
		this.salario = salario;
		validarNumeroFilhos(numeroFilhos);
		this.numeroFilhos = numeroFilhos;
	}
	
	private double descontoPrevidencia(){
		return this.salario * 0.1;
	}
	
	public double beneficios(){
		return auxilio_creche() + auxilio_alimentacao();
	}

	private double auxilio_alimentacao() {
		return VALOR_AUXILIO_ALIMENTACAO;
	}

	private double auxilio_creche() {
		if (this.numeroFilhos < 3)
			return VALOR_AUXILIO_CHECHE * numeroFilhos;
		return VALOR_AUXILIO_CHECHE * 3;
	}

	public double calculaSalario() {
		return this.salario - descontoPrevidencia() + beneficios();
	}
	
	private void validarNumeroFilhos(int numeroFilhos){
		if (numeroFilhos < 0)
			throw new RuntimeException("Numero de Filhos Invalido!");			
	}

	public String nome() {
		return this.nome;
	}

}
