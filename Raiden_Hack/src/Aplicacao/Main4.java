package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas você irá cadastrar?");
		int contagem = sc.nextInt();
		String[] nome = new String[contagem];
		int[] idade = new int[contagem];

		for (int c = 0; c < contagem; c++) {
			System.out.println("Dados da " + c++ + "° pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[c] = sc.nextLine();
			System.out.print("Idade: ");
			idade[c] = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
