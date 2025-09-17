package programação_orientada_a_objetos.aula08.Atividade02;

public class Consulta {

	private String data;
	private String nomePaciente;
	private String nomeDentista;

	public Consulta() {

	}

	public Consulta(String nomeDentista) {
		this.nomeDentista = nomeDentista;
		nomePaciente = "Jhonny Cage";
		data = "28/5";
	}

	public Consulta(String nomePaciente, String data) {
		this.data = data;
		this.nomePaciente = nomePaciente;
		nomeDentista = "Mick Thomson";
	}

	public Consulta(String nomePaciente, String nomeDentista, String data) {
		this.data = data;
		this.nomePaciente = nomePaciente;
		this.nomeDentista = nomeDentista;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomeDentista() {
		return nomeDentista;
	}

	public void setNomeDentista(String nomeDentista) {
		this.nomeDentista = nomeDentista;
	}
}
