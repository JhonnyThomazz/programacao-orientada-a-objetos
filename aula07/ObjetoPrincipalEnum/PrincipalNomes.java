package programação_orientada_a_objetos.aula07.ObjetoPrincipalEnum;

import programação_orientada_a_objetos.aula07.Enum.NomesPessoas;

public class PrincipalNomes {

	public static void main(String[] args) {
		for(NomesPessoas nomes: NomesPessoas.values()) {
			System.out.println("Nome: " + nomes);
		}

	}

}
