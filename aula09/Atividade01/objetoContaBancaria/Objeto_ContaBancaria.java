package programação_orientada_a_objetos.aula09.Atividade01.objetoContaBancaria;

import programação_orientada_a_objetos.aula09.Atividade01.contaBancaria.ContaBancaria;

public class Objeto_ContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta01 = new ContaBancaria(100000.00);
		
		//saldo_inicial
		System.out.println(conta01.getSaldo());
		
		//depositos_conta01
		conta01.depositar(500);
		conta01.depositar(1000);
		
		System.out.println(conta01.getSaldo());
		
		conta01.sacar(1500);
		
		System.out.println(conta01.getSaldo());
	}

}
