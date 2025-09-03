package programação_orientada_a_objetos.aula06.Classes;

import programação_orientada_a_objetos.aula06.ClassesAbstratas.Animal;

public class Lion extends Animal{

	public Lion(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom(){
		System.out.println(getNome() + "está rugindo");
	}
}
