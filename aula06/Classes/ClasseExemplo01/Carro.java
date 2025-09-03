package programação_orientada_a_objetos.aula06.Classes.ClasseExemplo01;

import programação_orientada_a_objetos.aula06.ClassesAbstratas.Exemplo01.Veículos;

public class Carro extends Veículos {

	public Carro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}

	@Override
	public void acelerar() {
		System.out.println("Pisando fundo!");
	}

	@Override
	public void frear() {
		System.out.println("Freando!");

	}
	@Override
	public void virar() {
		System.out.println("Fazendo a curva!");
	}
	@Override
	public void ligar() {
		System.out.println("Ligando o carro...");
	}

}
