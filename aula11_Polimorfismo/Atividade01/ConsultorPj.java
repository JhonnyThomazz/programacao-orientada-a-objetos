package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade01;

public class ConsultorPj extends Funcionario{
	
	public ConsultorPj(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override
	public double calcularSalario(double salarioContrato, double desconto) {
		return salarioContrato - desconto;
	}
}
