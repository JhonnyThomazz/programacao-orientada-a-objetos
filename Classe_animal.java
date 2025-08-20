package programação_orientada_a_objetos;

public class Classe_animal {
	String nome;
	String especie;
	String cor;
	double peso;
	double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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

//métodos gerais para a classe animal:
	public String emitirSom() {
		return "emitindo som...";
	}

	public String comer() {
		return "comendo...";
	}

	public String seMover() {
		return "Se movendo...";
	}
}
