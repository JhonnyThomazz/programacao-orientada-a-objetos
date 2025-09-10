package programação_orientada_a_objetos.aula07.ObjetoPrincipal;

import programação_orientada_a_objetos.aula07.Enum.MateriasEM;

public class PrincipalMaterias {

	public static void main(String[] args) {
		for(MateriasEM materias: MateriasEM.values()) {
			System.out.println("Matérias da grade SESI: " + materias);
		}
	}

}
