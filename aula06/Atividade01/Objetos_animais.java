package programação_orientada_a_objetos.aula06.Atividade01;

import programação_orientada_a_objetos.aula06.Classes.Cachorro;
import programação_orientada_a_objetos.aula06.Classes.Gato;
import programação_orientada_a_objetos.aula06.Classes.Lion;
import programação_orientada_a_objetos.aula06.Classes.Tiger;
import programação_orientada_a_objetos.aula06.Classes.Wolf;

public class Objetos_animais {

	public static void main(String[] args) {
		Wolf lobo = new Wolf("lobo", "macho", "Canis Lupus");
		Lion leao = new Lion("leoa", "fêmea", "Phanter Lion");
		Tiger tigre = new Tiger("tigre", "macho", "Phanter tiger");
		Cachorro cachorro = new Cachorro("doguinho", "Macho", "Canis lupus familiaris");
		Gato gato = new Gato("Gatito", "fêmea", "Felis catus");
		
		System.out.println("----ANIMAIS----");
		System.out.println(leao.getNome());
		System.out.println(leao.getRaca());
		System.out.println(leao.getSexo());
		leao.emitirSom();
		System.out.println("--------------------");
		
		System.out.println(tigre.getNome());
		System.out.println(tigre.getRaca());
		System.out.println(tigre.getSexo());
		tigre.emitirSom();
		System.out.println("--------------------");
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getRaca());
		System.out.println(cachorro.getSexo());
		cachorro.emitirSom();
		System.out.println("--------------------");
		
		System.out.println(gato.getNome());
		System.out.println(gato.getRaca());
		System.out.println(gato.getSexo());
		gato.emitirSom();
		System.out.println("--------------------");
		
		System.out.println(lobo.getNome());
		System.out.println(lobo.getRaca());
		System.out.println(lobo.getSexo());
		lobo.emitirSom();
		

	}

}
