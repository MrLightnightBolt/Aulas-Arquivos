package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos alunos serão cadastrados?");
		int contagem = sc.nextInt();
		String[] nome = new String[contagem];
		double[] nota1 = new double[contagem];
		double[] nota2 = new double[contagem];
		
		for (int c = 0; c < contagem; c++) {
			System.out.print("Digite o nome do " + (c+1) + "° aluno: ");
			sc.nextLine();
			nome[c] = sc.nextLine();
			System.out.print("Digite a 1° nota: ");
			nota1 [c] = sc.nextDouble();
			System.out.print("Digite a 2° nota: ");
			nota2 [c] = sc.nextDouble();
			System.out.println();
		}
		
		System.out.println("Alunos aprovados: ");
		for (int c = 0; c < contagem; c++) {
			if (nota1[c] + nota2[c] >= 12.0) {
				System.out.println(nome[c]);
			}
		}
		sc.close();
	}

}
