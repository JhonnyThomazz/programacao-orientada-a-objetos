package programação_orientada_a_objetos.aula05.Classes.ClasseAtividade01;

import programação_orientada_a_objetos.aula05.Interfaces.InterfaceAtividade01.Veiculo;

public class Ferrari implements Veiculo{

	@Override
	public void ligar() {
		System.out.println("O carro está ligando...");
	}
	@Override
	public void desligar() {
		System.out.println("O carro está desligando...");
	}
	@Override
	public void manobrar() {
		System.out.println("O carro está manobrando...");
	}
	@Override
	public void engatar() {
		System.out.println("Estamos a 340 km/h...Engatando a 3°");
	}
	@Override
	public void acelerar() {
		System.out.println("Pisando fundo...");
	}
	@Override
	public void frear() {
		System.out.println("Freando...");
	}
	
}
