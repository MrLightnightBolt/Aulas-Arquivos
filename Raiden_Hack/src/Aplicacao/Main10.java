package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos terá o vetor?");
		int contagem = sc.nextInt();
		double [] vect = new double [contagem];
		
		for (int c = 0; c < vect.length; c++) {
			System.out.print("Digite um número: ");
			vect [c] = sc.nextDouble();
		}
		
		System.out.println();
		double soma = 0.00;
		
		for (int c = 0; c < vect.length; c++) {
			soma += vect[c];
			
		}
		
		double media = soma/contagem;
		System.out.printf("Média do Vetor = %.3f%n" , media);
		System.out.println("Elementos abaixo da media: ");
		
		for (int c = 0; c < vect.length; c++) {
			if (vect [c] < media) {
				System.out.println(vect[c]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
