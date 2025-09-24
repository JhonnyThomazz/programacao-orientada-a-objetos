package programação_orientada_a_objetos.aula09.Atividade01.objetoContaBancaria;

import java.util.Scanner;

import programação_orientada_a_objetos.aula09.Atividade01.contaBancaria.ContaBancaria;

public class Objeto_ContaBancariaSCANNER {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancaria conta02 = new ContaBancaria(10000.00);
		
		System.out.println("Seu saldo atual é de: " + conta02.getSaldo());
		System.out.println("Informe o valor para o saque: ");
		double sacar = scanner.nextDouble();
		conta02.sacar(sacar);
		System.out.println("\nSaque realizado com sucesso!");
		System.out.println("\nSeu saldo atual é de: " + conta02.getSaldo());
		
		System.out.println("Informe o valor para o depósito: ");
		double deposito = scanner.nextDouble();
		conta02.depositar(deposito);
		System.out.println("\nDepósito realizado com sucesso!");
		System.out.println("Seu saldo atual é de: " + conta02.getSaldo());
		scanner.close();
	}
}
