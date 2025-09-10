package programação_orientada_a_objetos.aula07.ObjetoPrincipal;

import programação_orientada_a_objetos.aula07.Enum.MarcasRoupas;

public class PrincipalRoupas {

	public static void main(String[] args) {
		for (MarcasRoupas roupas: MarcasRoupas.values()) {
			System.out.println("Sua roupa é: " + roupas);
		}

	}

}
