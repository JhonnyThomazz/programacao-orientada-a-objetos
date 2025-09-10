package programação_orientada_a_objetos.aula07.ModificadorDeAcesso.Exemplo.ObjetoPessoaAutomovel;

import java.util.Scanner;

import programação_orientada_a_objetos.aula07.ModificadorDeAcesso.Exemplo.Automovel;
import programação_orientada_a_objetos.aula07.ModificadorDeAcesso.Exemplo.Pessoa;

public class ObjetoPessoaAutomovel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// cria_objetos_pessoa
		Pessoa pessoa = new Pessoa();

		String cor, nome;
		int velocidade;

		System.out.println("informe a cor do carro:");
		cor = scanner.next();

		System.out.println("Informe o nome do carro:");
		nome = scanner.next();

		System.out.println("Informe a velocidade máxima do carro:");
		velocidade = scanner.nextInt();

		pessoa.comprarCarro(cor, nome, velocidade);
		Automovel carro = pessoa.getAutomovel();

		System.out.println("O carro comprado foi um " + carro.getNome() + ", da cor " + carro.getCor() + ", que atinge "
				+ carro.getVelocidade() + "Km/h.");

		scanner.close();

	}

}
