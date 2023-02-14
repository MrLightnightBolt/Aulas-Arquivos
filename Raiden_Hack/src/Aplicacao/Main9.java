package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int contagem = sc.nextInt();
		int [] vect = new int [contagem];
		if (contagem <= 10) {
			
			for (int c = 0; c < vect.length; c++) {
				System.out.print("Digite um número: ");
				vect [c] = sc.nextInt();
			}
			
			System.out.println();
			System.out.println("Números negativos: ");
			for (int c = 0; c < vect.length; c++) {
				if (vect [c] < 0) {
					System.out.println(vect[c]);
				}
			}
			
		}
		else {
			System.out.println("TÁ BOM VÉI! AGORA DIGITA UM NÚMERO VÁLIDO OU QUEIMA!");
		}
		
		
		sc.close();
	}

}
