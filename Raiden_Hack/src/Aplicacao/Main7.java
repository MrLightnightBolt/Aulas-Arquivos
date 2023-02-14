package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int quantidade = sc.nextInt();
		double[] vect = new double [quantidade];
		double soma = 0.00;
		
		for (int cont = 0; cont < vect.length; cont++) {
			System.out.print("Digite um número: ");
			vect [cont] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = "); 
		for (int cont = 0; cont < vect.length; cont++) {
			System.out.print(vect [cont] + " ");
		}
		
		System.out.println();
		for (int cont = 0; cont < vect.length; cont++) {
			soma += vect[cont];
		}
		
		System.out.printf("Soma = %.2f%n", soma);
		double media = soma / quantidade;
		System.out.printf("Media = %.2f%n", media);
		
		
		sc.close();
	}

}
