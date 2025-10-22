package programação_orientada_a_objetos.aula12_relacoes_entre_classes.atividade01;

public class MainDept_Emp {
	public static void main(String[] args) {
		Departamento departamento = new Departamento("Finanças");
		Empresa empresa = new Empresa("Samsung", departamento);

		System.out.println("Empresa: " + empresa.getNome());
		System.out.println("Departamento: " + departamento.getNome());

	}
}
