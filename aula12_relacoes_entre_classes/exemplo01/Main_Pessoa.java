package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Main_Pessoa {

	public static void main(String[] args) {
		Coracao coracao = new Coracao(190);
		Pessoa pessoa = new Pessoa("Ralf Jones", 190);
		
		System.out.println("Nome: " + pessoa.getNome() + "\nBatimentos por minuto(BPM): " + coracao.getBatimentos());

	}

}
