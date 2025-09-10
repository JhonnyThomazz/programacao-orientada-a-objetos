package programação_orientada_a_objetos.aula07.ObjetoPrincipalEnum;

import programação_orientada_a_objetos.aula07.Enum.ProdutosMercado;

public class PrincipalMercado {
	public static void main(String[] args) {
		for(ProdutosMercado produtos: ProdutosMercado.values()) {
			System.out.println("Produtos da lista: " + produtos);
		}
	}
}
