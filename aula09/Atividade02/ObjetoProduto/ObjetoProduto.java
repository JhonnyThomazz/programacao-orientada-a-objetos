package programação_orientada_a_objetos.aula09.Atividade02.ObjetoProduto;

import programação_orientada_a_objetos.aula09.Atividade02.Produto.Produto;

public class ObjetoProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Xbox360 Slim", 1900.00);
		
		System.out.println("O produto é: " + produto1.getNome());
		System.out.println("Seu valor é: $" + produto1.getPreco());
		
		System.out.println("\n===RECIBO===");
		produto1.exibirInformacoes();
	}

}
