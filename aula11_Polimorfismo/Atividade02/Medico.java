package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade02;

public class Medico extends ProfissionalSaude {
	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm() {
		this.crm = crm;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Agendando consulta...");
		System.out.println("Check-up geral agendado para o dia: ");
	}
}
