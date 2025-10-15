package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Pessoa {

	private String nome;
	private Coracao coracao;// Composição_

	public Pessoa(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Coracao(coracao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCorcacao() {
		return coracao.getBatimentos();
	}
}
