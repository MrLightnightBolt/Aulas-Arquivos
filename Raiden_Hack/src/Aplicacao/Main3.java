package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos terá o vetor?");
		int contagem = sc.nextInt();
		int[] vetor = new int [contagem];
		double soma = 0.00;
		int quantidadePar = 0;
		
		for (int c = 0; c < vetor.length; c++) {
			System.out.print("Digite um número: ");
			vetor [c] = sc.nextInt();
		}
		
		System.out.println();
		
		for (int c = 0; c < vetor.length; c++) {
			if (vetor [c] % 2 == 0) {
				soma += vetor[c];
				quantidadePar++; 
			}
		}
		
		double media = soma / quantidadePar;
		
		
		if (media > 0) {
			System.out.printf("Média dos pares: %.2f%n", media);
		}
		else {
			System.out.println("Nenhum número par!");
		}
		
		
		
		
		sc.close();
	}

}
