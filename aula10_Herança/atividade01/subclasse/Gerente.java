package programação_orientada_a_objetos.aula10_Herança.atividade01.subclasse;

import programação_orientada_a_objetos.aula10_Herança.atividade01.superclasse.Funcionario;

public class Gerente extends Funcionario {
	private String beneficios;
	private double premiacao;

	public Gerente(String nome, String cpf, double salario, String cargo, String departamento, String beneficios,
			double premiacao) {
		super(nome, cpf, salario, cargo, departamento);
		this.premiacao = premiacao;
		this.beneficios = beneficios;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public double getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}
}
