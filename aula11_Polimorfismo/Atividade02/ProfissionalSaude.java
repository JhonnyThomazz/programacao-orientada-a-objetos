package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade02;

public class ProfissionalSaude {
	
	private String nome;
	private String especialidade;
	private int valorConsulta;
	
	
	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
	this.nome = nome;
	this.especialidade = especialidade;
	this.valorConsulta = valorConsulta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade() {
		this.especialidade = especialidade;
	}
	public int getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta() {
		this.valorConsulta = valorConsulta;
	}
	
	
	
	public void agendarConsulta() {
		System.out.println("Agedando consulta...");
		System.out.println("Consulta agendada com sucesso dia 10/10!");
	}
	
}
