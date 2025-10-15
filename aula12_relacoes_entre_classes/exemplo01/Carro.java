package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Carro {

	private String modelo;
	private Motor motor;

	public Carro(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo() {
		this.modelo = modelo;
	}

}
