package programação_orientada_a_objetos.aula06.Exemplo;

import programação_orientada_a_objetos.aula06.Classes.ClasseExemplo01.Carro;
import programação_orientada_a_objetos.aula06.Classes.ClasseExemplo01.Onibus;

public class ObjetoPrincipal {

	public static void main(String[] args) {
		
		Carro Chevette = new Carro("ABC-0D00", "Chevette Turbo 1.6", "Preto", 1983);
		Chevette.ligar();
		Chevette.acelerar();
		Chevette.virar();
		Chevette.frear();
		
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");
		
		Onibus Cometa = new Onibus("EFG-1H11", "XB01", "Prata", 2010);
		Cometa.ligar();
		Cometa.acelerar();
		Cometa.virar();
		Cometa.frear();
	}

}
