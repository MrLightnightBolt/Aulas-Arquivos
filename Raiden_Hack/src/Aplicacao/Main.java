package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos valores terá cada vetor?");
		int contagem = sc.nextInt();		
		int[] vectA = new int [contagem];
		int[] vectB = new int [contagem];
		int[] vectResultante = new int [contagem];
		
		System.out.println();
		System.out.println("Digite os valores do Vetor A: ");
		for (int c = 0; c < vectA.length; c++) {
			vectA [c] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do Vetor B: ");
		for (int c = 0; c < vectB.length; c++) {
			vectB [c] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante: ");
		for (int c = 0; c < vectResultante.length; c++) {
			vectResultante [c] = vectA [c] + vectB [c];
			System.out.println(vectResultante[c]);
		}
		
		
		
		
		sc.close();
	}

}
