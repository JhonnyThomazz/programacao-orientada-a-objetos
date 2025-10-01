package programação_orientada_a_objetos.aula09.Atividade02.Produto;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco() {
		this.preco = preco;
	}
	
	public void exibirInformacoes() {
		System.out.println(this.nome);
		System.out.println(this.preco);
	}
}
