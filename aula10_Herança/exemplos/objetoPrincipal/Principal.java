package programação_orientada_a_objetos.aula10_Herança.exemplos.objetoPrincipal;

import programação_orientada_a_objetos.aula10_Herança.exemplos.subclasse.PessoaFisica;
import programação_orientada_a_objetos.aula10_Herança.exemplos.subclasse.PessoaJuridica;
import programação_orientada_a_objetos.aula10_Herança.exemplos.superclasse.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// Pessoa_
		Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		// Pessoa_física
		PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 9999-9999", "000.000.000-00",
				"00-0000-00000-0");
		System.out.println("==================================");
		System.out.println("\nPessoa Física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());

		// Pessoa_jurídica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-9999", "00.000.000/0000-00");
		System.out.println("==================================");
		System.out.println("\nPessoa Jurídica: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());

	}

}
