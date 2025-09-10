package programação_orientada_a_objetos.aula07.ObjetoPrincipal.Exemplo;

import programação_orientada_a_objetos.aula07.Enum.Exemplo.MesEnum;

public class PrincipalMes {

	public static void main(String[] args) {
		for(MesEnum Mes: MesEnum.values()) {
			System.out.println("Seu mês é: " + Mes);
		}
	}

}
