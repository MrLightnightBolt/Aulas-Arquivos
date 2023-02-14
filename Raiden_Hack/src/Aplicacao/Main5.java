package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Calculos.Auxiliar5;

public class Main5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Auxiliar5 aux = new Auxiliar5 ();
		
		System.out.println("Quantos números você irá digitar?");
		aux.setNumero(sc.nextInt());
		int[] vect = new int[aux.getNumero()];
		
		for (int cont = 0; cont < vect.length; cont++ ) {
			vect [cont] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		
		for (int cont = 0; cont < vect.length; cont++) {
			
			 if (vect [cont] < 0) {
				System.out.println(vect [cont]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
