package programação_orientada_a_objetos.aula05.Classes.ClasseAtividade03;

import programação_orientada_a_objetos.aula05.Interfaces.InterfaceAtividade03.Computador;

public class ComputadorHome implements Computador{

	@Override
	public void ligar() {
		System.out.println("Ligando a máquina...Bem-vindo!");
	}
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando para aplicar as atualizações...");
	}
	@Override
	public void desligar() {
		System.out.println("Desligando...");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("Inicializando o Sistema Operacional");
	}
}
