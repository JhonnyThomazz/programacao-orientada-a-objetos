package programação_orientada_a_objetos.aula10_Herança.atividade01.subclasse;

import programação_orientada_a_objetos.aula10_Herança.atividade01.superclasse.Funcionario;

public class Atendente extends Funcionario {
	private double ajudadeCusto;

	public Atendente(String nome, String cpf, double salario, String cargo, String departamento, double ajudadeCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudadeCusto = ajudadeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudadeCusto;
	}

	public void setAjudaDeCusto(double ajudadeCusto) {
		this.ajudadeCusto = ajudadeCusto;
	}
}
