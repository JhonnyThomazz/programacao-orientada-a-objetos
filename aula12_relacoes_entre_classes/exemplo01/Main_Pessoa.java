package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Main_Pessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ralf Jones", 80);
		
		System.out.println("Nome: " + pessoa.getNome() + "\nBatimentos por minuto(BPM): " + pessoa.getCorcacao());

	}

}
