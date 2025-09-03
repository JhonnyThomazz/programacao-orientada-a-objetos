package programação_orientada_a_objetos.aula05.Atividade04;

import java.util.Scanner;

import programação_orientada_a_objetos.aula05.Classes.ClasseAtividade04.Calculando;
import programação_orientada_a_objetos.aula05.Interfaces.InterfaceAtividade04.Calculos;

public class ObjetoCalculando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá! Insira dois números para continuar: ");

		System.out.print("Valor1: ");
		int num1 = scanner.nextInt();
		System.out.print("Valor 2: ");
		int num2 = scanner.nextInt();

		Calculos calculo01 = new Calculando(num1, num2);

		System.out.println("Resultados:");
		System.out.println("\nSoma = " + calculo01.somar());
		System.out.println("\nSubtração = " + calculo01.subtracao());
		System.out.println("\nMultiplicação = " + calculo01.multiplicacao());

		try {
			System.out.println("\nDivisão = " + calculo01.divisao());
		} 
			catch (Exception error) {
			System.out.println("\nNão há divisão por zero!");
		}

		System.out.println("\nExponencial = " + calculo01.exponencial());

		scanner.close();
	}

}
