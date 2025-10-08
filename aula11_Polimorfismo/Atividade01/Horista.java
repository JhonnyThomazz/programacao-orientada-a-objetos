package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade01;

public class Horista extends Funcionario {
	
	public Horista(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double salarioHora, double desconto) {
		double horasTrabalhadas = 40;
		
		return (salarioHora*horasTrabalhadas) - desconto;
	}
}
