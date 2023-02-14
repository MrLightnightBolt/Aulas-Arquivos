package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int[] vect = new int [sc.nextInt()];
		
		for (int c = 0; c < vect.length; c++) {
			System.out.print("Digite um número: ");
			vect [c] = sc.nextInt();
		}
		
		int soma = 0;
		int contagem = 1;
		System.out.println();
		System.out.println("Números pares: ");
		for (int c = 0; c < vect.length; c++) {
			if (vect[c] % 2 == 0) {
				System.out.print(vect [c] + " ");
				soma += contagem;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Quantidade de pares = ");
		System.out.print(soma);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
