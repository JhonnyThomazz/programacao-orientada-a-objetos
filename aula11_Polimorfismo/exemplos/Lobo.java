package programação_orientada_a_objetos.aula11_Polimorfismo.exemplos;

public class Lobo extends Animal{
	
	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O lobo está uivando");
	}
}
