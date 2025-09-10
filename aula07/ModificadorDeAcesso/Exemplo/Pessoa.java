package programação_orientada_a_objetos.aula07.ModificadorDeAcesso.Exemplo;

public class Pessoa {
	private String nome;
	private int idade;
	private String profissao;
	//associando_com _a_classe_Automovel:
	private Automovel automovel;

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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	//pegando_dados_do_automovel
	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	//setando_as_caracteristicas_do_automovel
	public void comprarCarro(String cor, String nome, int velocidade) {
		automovel = new Automovel();
		automovel.setCor(cor);
		automovel.setNome(nome);
		automovel.setVelocidade(velocidade);
	}
}
