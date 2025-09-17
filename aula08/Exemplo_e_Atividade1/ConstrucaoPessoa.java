package programação_orientada_a_objetos.aula08.Exemplo_e_Atividade1;

public class ConstrucaoPessoa {
	public static void main(String[] args) {
		Pessoa Baterista = new Pessoa("Eloy Casagrande", 34);
		Pessoa Vocalista = new Pessoa("Corey Taylor");
		Pessoa banda = new Pessoa(29);
		Pessoa Null = new Pessoa();

		System.out.println("Nome: " + Baterista.getNome());
		System.out.println("idade: " + Baterista.getIdade() + " anos de idade");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Nome: " + Vocalista.getNome());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("A banda tem: " + banda.getIdade() + " anos");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Teste de informação vazia.\n");
		System.out.println("Nome: " + Null.getNome());
		System.out.println("idade: " + Null.getIdade());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
