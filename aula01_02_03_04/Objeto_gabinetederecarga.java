package programação_orientada_a_objetos.aula01_02_03_04;

public class Objeto_gabinetederecarga {

	public static void main(String[] args) {
		Gabinete_de_recarga gabinete1 = new Gabinete_de_recarga();

		gabinete1.setCapacidade("36 Notebooks");
		gabinete1.setMarca("TES");
		gabinete1.setCor("Cinza");
		gabinete1.setModelo("RV-40");
		
		System.out.println("---Detalhes do produto---\n");
		System.out.println("Marca: " + gabinete1.getMarca());
		System.out.println("Modelo: " + gabinete1.getModelo());
		System.out.println("Cor: " + gabinete1.getCor());
		System.out.println("Capacidade: " + gabinete1.getCapacidade());
	}

}
