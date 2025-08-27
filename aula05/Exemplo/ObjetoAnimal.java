package programação_orientada_a_objetos.aula05.Exemplo;

import programação_orientada_a_objetos.aula05.Classes.ClasseExemplo.Lobo;

public class ObjetoAnimal {

	public static void main(String[] args) {
	Lobo objetoLobo = new Lobo();
	
	objetoLobo.caminhar();
	objetoLobo.correr();
	objetoLobo.dormir();
	objetoLobo.emitirSom();
	
	}	
}
