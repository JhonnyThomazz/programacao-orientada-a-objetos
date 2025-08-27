package programação_orientada_a_objetos.aula01_02_03_04;

public class Objeto_aviao {

	public static void main(String[] args) {
		Classe_aviao aviao01 = new Classe_aviao();
		Classe_aviao aviao02 = new Classe_aviao();
		Classe_aviao aviao03 = new Classe_aviao();
		Classe_aviao aviao04 = new Classe_aviao();
		
		aviao01.setEmpresa("LATAM");
		aviao01.setModelo("AIRBUS A319");
		aviao01.setCapacidade("124 Passageiros | Peso máximo de decolagem - 75.500Kg");
		aviao01.setNumSerie("124-53321-0078774");
		
		aviao02.setEmpresa("Gol");
		aviao02.setModelo("BOEING 737");
		aviao02.setCapacidade("210 Passageiros | Peso máximo de decolagem - 79.000kg");
		aviao02.setNumSerie("125-532210-9964552");
		
		aviao03.setEmpresa("Azul");
		aviao03.setModelo("AIRBUS A320neo");
		aviao03.setCapacidade("194 Passageiros | Peso máximo de decolagem - 79.000kg");
		aviao03.setNumSerie("153-326468-316740");
		
		aviao04.setEmpresa("American Airlines");
		aviao04.setModelo("AIRBUS A319");
		aviao04.setCapacidade("124 Passageiros | Peso máximo de decolagem - 75.500kg");
		aviao04.setNumSerie("132-533422-3845277");
		
		System.out.println("----Aviões Registrados----");
		System.out.println("Empresa: " + aviao01.getEmpresa());
		System.out.println("Modelo - " + aviao01.getModelo());
		System.out.println("Capacidade - " + aviao01.getCapacidade());
		System.out.println("Número de Série - " + aviao01.getNumSerie());
		System.out.println("Estado atual - " + aviao01.Decolando());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nEmpresa: " + aviao02.getEmpresa());
		System.out.println("Modelo - " + aviao02.getModelo());
		System.out.println("Capacidade - " + aviao02.getCapacidade());
		System.out.println("Número de Série - " + aviao02.getNumSerie());
		System.out.println("Estado atual - " + aviao01.SolicitarPouso());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nEmpresa: " + aviao03.getEmpresa());
		System.out.println("Modelo - " + aviao03.getModelo());
		System.out.println("Capacidade - " + aviao03.getCapacidade());
		System.out.println("Número de Série - " + aviao03.getNumSerie());
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nEmpresa: " + aviao04.getEmpresa());
		System.out.println("Modelo - " + aviao04.getModelo());
		System.out.println("Capacidade - " + aviao04.getCapacidade());
		System.out.println("Número de Série - " + aviao04.getNumSerie());
		System.out.println("Estado atual - " + aviao04.TremDePouso());
	}

}
