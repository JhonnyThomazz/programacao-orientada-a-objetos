package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade02;

public class Fisioterapeuta extends ProfissionalSaude {

	private String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}

	public String getCrefito() {
		return crefito;
	}

	public void setCrefito() {
		this.crefito = crefito;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Agendando consulta...");
		System.out.println("Consulta agendada para o dia 23/09!");
	}
}
