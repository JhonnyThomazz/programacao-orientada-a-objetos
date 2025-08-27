package programação_orientada_a_objetos.aula01_02_03_04;

public class Classe_aviao {
	String numSerie;
	String empresa;
	String modelo;
	String capacidade;

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	//metodos Para Os Avioes:
	
	public String Decolando() {
		return "Decolando...";
	}
	public String TremDePouso() {
		return "Recolhendo o trem de pouso;";
	}
	public String SolicitarPouso() {
		return "Solicitando permissão para pousar...Permissão concedida!";
	}
	public String Pousando() {
		return "Pousando o avião...";
	}
}
