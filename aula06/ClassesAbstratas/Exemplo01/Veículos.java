package programação_orientada_a_objetos.aula06.ClassesAbstratas.Exemplo01;

public abstract class Veículos {

	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	
	public Veículos(String placa, String modelo, String cor, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	public abstract void acelerar();
	
	public abstract void frear();
	
	public abstract void virar();
	
	public abstract void ligar();
}
