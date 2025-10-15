package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade02;

public class Dentista extends ProfissionalSaude {

	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}

	public String getCro() {
		return cro;
	}

	public void setCro() {
		this.cro = cro;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Agendando consulta...");
		System.out.println("Consulta com o dentista agendado para o dia 17/07!");
	}
}
