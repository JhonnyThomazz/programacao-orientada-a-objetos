package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Estudante {

	private String nome;
	private Universidade universidade;

	public Estudante(String nome, Universidade universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {
		this.nome = nome;
	}
}
