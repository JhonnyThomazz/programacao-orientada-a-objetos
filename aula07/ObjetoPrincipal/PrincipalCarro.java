package programação_orientada_a_objetos.aula07.ObjetoPrincipal;

import programação_orientada_a_objetos.aula07.Enum.MarcasCarros;

public class PrincipalCarro {

	public static void main(String[] args) {
		for(MarcasCarros carro: MarcasCarros.values()) {
			System.out.println("Seu carro é: " + carro);
		}
	}

}
