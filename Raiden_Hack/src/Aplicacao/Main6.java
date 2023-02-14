package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Calculos.Auxiliar6;

public class Main6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Auxiliar6 aux = new Auxiliar6();
		
		System.out.print("Digite o número da conta: ");
		aux.setNumero(sc.nextInt());
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		aux.setConta(sc.nextLine());
		System.out.println("Deseja depositar um valor inicial (Sim/Não)");
		aux.setOpcao(sc.nextLine());
		aux.dados3();
		aux.depositoEntrada();
		aux.depositoSaida();
		
		
		
		
		
		
		
		
		sc.close();
	}

}
