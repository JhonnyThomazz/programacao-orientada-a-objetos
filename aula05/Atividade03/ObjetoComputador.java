package programação_orientada_a_objetos.aula05.Atividade03;

import programação_orientada_a_objetos.aula05.Classes.ClasseAtividade03.ComputadorGamer;
import programação_orientada_a_objetos.aula05.Classes.ClasseAtividade03.ComputadorHome;
import programação_orientada_a_objetos.aula05.Interfaces.InterfaceAtividade03.Computador;

public class ObjetoComputador {

	public static void main(String[] args) {
		Computador gamerRyzen7 = new ComputadorGamer();
		Computador homeInteli7 = new ComputadorHome();
		Computador gamerRyzen9 = new ComputadorGamer();
		System.out.println("----Computador com Ryzen 7 5700G----");
		System.out.println("Estado atual: ");
		gamerRyzen7.ligar();
		System.out.println("\n----Computador com Ryzen 7 5900XT----");
		System.out.println("Estado atual: ");
		gamerRyzen9.carregandoSistema();
		System.out.println("\n----Computador com Intel i7 5°Gen.----");
		System.out.println("Estado atual: ");
		homeInteli7.reiniciar();
	}

}
