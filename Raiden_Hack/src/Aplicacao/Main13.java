package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de linhas que terá o vetor: ");
		int linha = sc.nextInt();
		System.out.print("Digite a quantidade de colunas que terá o vetor: ");
		int coluna = sc.nextInt();
		int[][] matriz = new int [linha][coluna];
		int l = 0;
		int c = 0;
		System.out.println();
		System.out.println("Digite os números que irão compor a matriz: ");
		
		for (l = 0; l < linha; l++) {
			for (c = 0; c < coluna; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite o número que deseja buscar na matriz: ");
		int numero = sc.nextInt();
		
		for (l = 0; l < linha; l++) {
			for (c = 0; c < coluna; c++) {
				if (matriz[l][c] == numero) {
					System.out.println("Posição: " + l + ", " + c);
					System.out.println();
					if (c > 0) {
						System.out.print("Esquerda: ");
						System.out.print(matriz[l][c-1]);
						System.out.println();
					}
					if (c < matriz[l].length-1) {
						System.out.print("Direita: ");
						System.out.print(matriz[l][c+1]);
						System.out.println();
					}
					if (l > 0) {
						System.out.print("Cima: ");
						System.out.print(matriz[l-1][c]);
						System.out.println();
					}
					if (l < matriz.length-1) {
						System.out.print("Baixo: ");
						System.out.print(matriz[l+1][c]);
						System.out.println();
					}
				}
			}
		}
		
		sc.close();
	}

}
