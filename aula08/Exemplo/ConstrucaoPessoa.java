package programação_orientada_a_objetos.aula08.Exemplo;

public class ConstrucaoPessoa {
	public static void main(String[] args) {
	Pessoa Baterista = new Pessoa("Eloy Casagrande", 34);
	
	System.out.println("Da banda SLIPKNOT, o baterista é brasileiro, e ele se chama: \n");
	System.out.println(Baterista.getNome());
	System.out.println(Baterista.getIdade()+ " anos de idade");
	}
}
