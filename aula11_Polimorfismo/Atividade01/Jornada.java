package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade01;

public class Jornada extends Funcionario{
	
	public Jornada(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override
	public double calcularSalario(double salarioSemana, double desconto) {
		double diasSemanas = 7;
		
		return (salarioSemana*diasSemanas) - desconto;
	}
}
