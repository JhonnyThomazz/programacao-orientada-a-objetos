package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Main {

	public static void main(String[] args) {
		
		Universidade universidade = new Universidade("USP");
		
		Estudante estudante = new Estudante("João", universidade);
		
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());

	}

}
