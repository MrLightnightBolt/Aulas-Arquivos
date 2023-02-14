package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos funcionários serão registrados?");
		int contagem = sc.nextInt();
		int[] id = new int[contagem];
		String[] nome = new String[contagem];
		double[] salario = new double[contagem];
		
		for (int c = 0; c < contagem; c++) {
			System.out.println("Funcionário #" + (c+1) + ":");
			System.out.print("ID: ");
			id[c] = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			nome[c] = sc.nextLine();
			System.out.print("Salário: ");
			salario[c] = sc.nextDouble();
			System.out.println();
		}
		
		System.out.print("Digite o ID do funcionário que terá seu salário aumentado: ");
		int funcionarioAumento = sc.nextInt();
		System.out.print("Digite a porcentagem do aumento: ");
		double aumento = sc.nextInt();
		double porcento = aumento / 100;
		
		for (int c = 0; c < contagem; c++) {
			if (funcionarioAumento == id[c]) {
				salario[c] = salario[c] + (salario[c] * porcento);
			}
		}
		System.out.println();
		
		System.out.println("Lista de funcionários: ");
		for (int c = 0; c < contagem; c++) {
			System.out.printf(id[c] + ", " + nome[c] + ", %.2f%n", salario[c]);
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
