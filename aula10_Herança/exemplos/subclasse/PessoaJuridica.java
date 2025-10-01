package programação_orientada_a_objetos.aula10_Herança.exemplos.subclasse;

import programação_orientada_a_objetos.aula10_Herança.exemplos.superclasse.Pessoa;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome, telefone); // herdando_os_atributos_da_superclasse
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj() {
		this.cnpj = cnpj;
	}
}
