package programação_orientada_a_objetos.aula11_Polimorfismo.exemplos;

public class Gato extends Animal{
	
	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O gato está Miando");
	}
}
