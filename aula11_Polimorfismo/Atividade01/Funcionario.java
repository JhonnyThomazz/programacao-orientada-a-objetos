package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade01;

public class Funcionario {

	private int id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereco;

	public Funcionario(int id, String nome, String telefone, int matricula, String endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone() {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula() {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco() {
		this.endereco = endereco;
	}

	public double calcularSalario(double salarioBruto, double desconto) {
		return salarioBruto - desconto;
	}

}

