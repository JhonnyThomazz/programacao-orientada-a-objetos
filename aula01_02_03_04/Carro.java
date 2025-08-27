package programação_orientada_a_objetos.aula01_02_03_04;

public class Carro {
	String Modelo;
	String Cor;
	String Marca;
	String Placa;
	String Chassi;
	String Motor;

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}

	public String getChassi() {
		return Chassi;
	}

	public void setChassi(String Chassi) {
		this.Chassi = Chassi;
	}

	public String getMotor() {
		return Motor;
	}

	public void setMotor(String Motor) {
		this.Motor = Motor;
	}
	public String Acelerar() {
		return "Acelerando...";
	}
	public String Estacionando() {
		return "Estacionando...";
	}
	public String Frear() {
		return "Freiando...";
	}
}
