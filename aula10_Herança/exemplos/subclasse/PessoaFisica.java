package programação_orientada_a_objetos.aula10_Herança.exemplos.subclasse;

import programação_orientada_a_objetos.aula10_Herança.exemplos.superclasse.Pessoa;

public class PessoaFisica extends Pessoa{

	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, String telefone, String cpf, String rg) {
		super(nome, telefone); //herdando_os_atributos_da_superclasse
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(){
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg() {
		this.rg = rg;
	}
}
