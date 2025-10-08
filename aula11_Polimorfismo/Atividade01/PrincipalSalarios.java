package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade01;


public class PrincipalSalarios {

	public static void main(String[] args) {
		Horista horista = new Horista(01,"Goku", "9999-9999",10,"Rua dos Alfeneiros");
		System.out.println("===TABELA DE SALÁRIOS===");
		System.out.println("\n===HORISTA===");
		System.out.println("Nome: " + horista.getNome());
		System.out.println("ID: " + horista.getId());
		System.out.println("Telefone: " + horista.getTelefone());
		System.out.println("Matrícula: " + horista.getMatricula());
		System.out.println("Endereço: " + horista.getEndereco());
		System.out.println("Salário Líquido: " + horista.calcularSalario(100, 1200));
		
		Jornada jornada = new Jornada(01,"Ralf Jones", "9999-9999",10,"Rua dos Alfeneiros");
		System.out.println("\n===JORNADA===");
		System.out.println("Nome: " + jornada.getNome());
		System.out.println("ID: " + jornada.getId());
		System.out.println("Telefone: " + jornada.getTelefone());
		System.out.println("Matrícula: " + jornada.getMatricula());
		System.out.println("Endereço: " + jornada.getEndereco());
		System.out.println("Salário Líquido: " + jornada.calcularSalario(500, 1050));
		
		ConsultorPj consultor = new ConsultorPj(01,"Ken Block", "9999-9999",10,"Rua dos Alfeneiros");
		System.out.println("\n===CONSULTOR===");
		System.out.println("Nome: " + consultor.getNome());
		System.out.println("ID: " + consultor.getId());
		System.out.println("Telefone: " + consultor.getTelefone());
		System.out.println("Matrícula: " + consultor.getMatricula());
		System.out.println("Endereço: " + consultor.getEndereco());
		System.out.println("Salário Líquido: " + consultor.calcularSalario(6000, 1800));
	}

}
