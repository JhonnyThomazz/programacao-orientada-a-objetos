package programação_orientada_a_objetos.aula05.Atividade02;

import programação_orientada_a_objetos.aula05.Classes.ClasseAtividade02.CadeiraAzul;

public class ObjetoCadeira {

	public static void main(String[] args) {
		CadeiraAzul cadeira = new CadeiraAzul();
		
		cadeira.levantar();
		cadeira.arrastar();
		cadeira.sentar();
	}
}
