package programação_orientada_a_objetos.aula06.Classes;

import programação_orientada_a_objetos.aula06.ClassesAbstratas.Animal;

public class Gato extends Animal {
	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom(){
		System.out.println(getNome() + "está latindo");
	}
}

