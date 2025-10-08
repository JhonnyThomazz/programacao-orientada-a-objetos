package programação_orientada_a_objetos.aula11_Polimorfismo.exemplos.ClassePrincipal;

import programação_orientada_a_objetos.aula11_Polimorfismo.exemplos.Cachorro;
import programação_orientada_a_objetos.aula11_Polimorfismo.exemplos.Gato;
import programação_orientada_a_objetos.aula11_Polimorfismo.exemplos.Leao;
import programação_orientada_a_objetos.aula11_Polimorfismo.exemplos.Lobo;
import programação_orientada_a_objetos.aula11_Polimorfismo.exemplos.Tigre;

public class Principal {
	
	public static void main(String[] args) {
		Lobo lobo = new Lobo("Thor", "M", "Qualquer");
		lobo.emitirSom();
	
		Leao leao = new Leao("Thor", "M", "Qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("Thor", "M", "Qualquer");
		tigre.emitirSom();
				
		Cachorro cachorro = new Cachorro("Thor", "M", "Qualquer");
		cachorro.emitirSom();
		
		Gato gato = new Gato("Thor", "M", "Qualquer");
		gato.emitirSom();
	}
}
