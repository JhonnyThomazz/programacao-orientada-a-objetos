package programação_orientada_a_objetos.aula10_Herança.atividade01;

import programação_orientada_a_objetos.aula10_Herança.atividade01.subclasse.Atendente;
import programação_orientada_a_objetos.aula10_Herança.atividade01.subclasse.Gerente;
import programação_orientada_a_objetos.aula10_Herança.atividade01.superclasse.Funcionario;

public class ObjetoPrincipal_FuncionarioAtendenteGerente {

	public static void main(String[] args) {
		//Funcionario_
		Funcionario funcionario = new Funcionario("Johnny Cage", "000.000.000-00", 7000, "Supervisor", "Finanças");
		System.out.println("===Funcionário#001===");
		System.out.println("\nNome: " + funcionario.getNome());
		System.out.println("Cpf: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		
		//Atendente_
		Atendente atendente = new Atendente("Terry Bogard", "000.000.000-00", 3500, "Atendente", "Vendas", 2000);
		System.out.println("\n===Funcionário#002===");
		System.out.println("\nNome: " + atendente.getNome());
		System.out.println("Cpf: " + atendente.getCpf());
		System.out.println("Salário: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Ajuda de custo: " + atendente.getAjudaDeCusto());
		//Gerente_
		Gerente gerente = new Gerente("Ralf Jones", "000.000.000-00", 10000, "Gerente", "T.I", "Plano de saúde para até 5 pessoas", 5000);
		System.out.println("\n===Funcionário#002===");
		System.out.println("\nNome: " + gerente.getNome());
		System.out.println("Cpf: " + gerente.getCpf());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Benefícios: " + gerente.getBeneficios());
		System.out.println("Premiação: " + gerente.getPremiacao());
	}

}
