package programação_orientada_a_objetos.aula05.Classes.ClasseAtividade02;

import programação_orientada_a_objetos.aula05.Interfaces.InterfaceAtividade02.Cadeira;

public class CadeiraAzul implements Cadeira{

	@Override
	public void arrastar() {
		System.out.println("Arrastando a cadeira...");
	}
	
	@Override
	public void levantar() {
		System.out.println("Levantando a cadeira...");
	}
	
	@Override
	public void sentar() {
		System.out.println("Tomando assento...");
	}
}
