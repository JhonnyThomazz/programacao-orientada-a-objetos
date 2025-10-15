package programação_orientada_a_objetos.aula11_Polimorfismo.Atividade02;

import java.util.Scanner;

public class Principal_Saude {

	public static void main(String[] args) {
		Medico medic = new Medico("Ralf Jones", "Ortopedista", 180, "123456/SP");
		Dentista dentist = new Dentista("Terry Bogard", "Endodontia", 200, "654321/SP");
		Fisioterapeuta physicalTherapist = new Fisioterapeuta("Clark Still", "Neurofuncional", 180, "132546-FN/SP");
		System.out.println("\n===Médico===");
		System.out.println("Nome: " + medic.getNome());
		System.out.println("Especialidade: " + medic.getEspecialidade());
		System.out.println("Valor da consulta: " + medic.getValorConsulta());
		System.out.println("CRM: " + medic.getCrm());
		medic.agendarConsulta();
		System.out.println("===================================");
		System.out.println("\n===Dentista===");
		System.out.println("Nome: " + dentist.getNome());
		System.out.println("Especialidade: " + dentist.getEspecialidade());
		System.out.println("Valor da consulta: " + dentist.getValorConsulta());
		System.out.println("CRO: " + dentist.getCro());
		dentist.agendarConsulta();
		System.out.println("===================================");
		System.out.println("\n===Fisioterapeuta===");
		System.out.println("Nome: " + physicalTherapist.getNome());
		System.out.println("Especialidade: " + physicalTherapist.getEspecialidade());
		System.out.println("Valor da consulta: " + physicalTherapist.getValorConsulta());
		System.out.println("CREFITO: " + physicalTherapist.getCrefito());
		physicalTherapist.agendarConsulta();

	}
}
