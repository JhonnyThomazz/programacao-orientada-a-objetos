package programação_orientada_a_objetos.aula01_02_03_04;

public class Classe_cliente {
	int id;
	String nome;
	String telefone;
	String cpf;
	String rg;
	String estadoCivil;
	String sexo;
	double peso;
	double altura;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
//métodos cliente: 

	public String Cadastro() {
		return "Analisando dados...Fazendo cadastro... Conta cadastrada!";
	}

	public String Login() {
		return "Fazendo login...Bem vindo de volta! ";
	}

	public String logout() {
		return "Desconectando conta...conta desconectada. Volte logo!";
	}
}
