package programação_orientada_a_objetos.aula08.Exemplo_e_Atividade1;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa() {
		nome = "Não informado";
		idade = 0;
	}
		

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa (int idade) {
		this.idade = idade;
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa (int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}
	
	//Código_Comentado:
	
	/*public Pessoa() {
		
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
