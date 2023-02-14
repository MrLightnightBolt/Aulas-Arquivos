package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas serão cadastradas?");
		int contagem = sc.nextInt();
		String [] nome = new String [contagem];
		int [] idade = new int [contagem];
		double [] altura = new double [contagem];
		int posicao = 1;
		double soma = 0.00;
		double porcentagem = 100 / contagem;
		int total = 0;
		
		System.out.println();
		for (int c = 0; c < contagem; c++) {
			System.out.println("Dados da " + posicao++ + "° pessoa:" );
			System.out.print("Nome: ");
			sc.nextLine();
			nome[c] = sc.nextLine();
			System.out.print("Idade: ");
			idade[c] = sc.nextInt();
			System.out.print("Altura: ");
			altura[c] = sc.nextDouble();
			System.out.println();
		}
		
		for (int c = 0; c < contagem; c++) {
			soma += altura[c];
		}
		
		double media = soma / contagem;
		System.out.printf("Altura média: %.2f%n", media);
		
		System.out.print("Pessoas com menos de 16 anos: ");
		for (int c = 0; c < contagem; c++) {
			if (idade[c] < 16) {
				total++;
			}
		}
		double media16anos = total * porcentagem;
		System.out.println(media16anos + "%");
		
		for (int c = 0; c < contagem; c++) {
			if (idade[c] < 16) {
				System.out.println(nome[c]);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
