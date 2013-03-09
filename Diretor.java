
public class Diretor extends Funcionario{

	public Diretor(String nome, double salario, int numeroFilhos) {
		super(nome, salario, numeroFilhos);
	}
	
	private double adicional(){
		return this.salario * 0.4;
	}
	
	private double descontoPrevidencia(){
		return (this.salario + adicional()) * 0.1;
	}
	
	public double calculaSalario(){
		return this.salario + adicional() + beneficios() - descontoPrevidencia();
	}

}
