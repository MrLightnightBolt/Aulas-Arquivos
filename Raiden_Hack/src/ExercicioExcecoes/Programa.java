package ExercicioExcecoes;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os dados da conta:");
		System.out.print("Número da conta: ");
		Integer conta = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial na conta: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque da conta: ");
		double saqueLimite = sc.nextDouble();
		
		System.out.println();
		System.out.print("Digite o valor que deseja sacar na conta: ");
		double saqueValor = sc.nextDouble();
		
		Conta banco = new Conta(conta, titular, saldo, saqueLimite, saqueValor);
		
		try {
			banco.saqueValidacao();
			System.out.printf("Novo saldo na conta: $ %.2f", saldo - saqueValor);
		}
		catch (Error erro) {
			System.out.println(erro.getMessage());
		}
		
		
		
		
		
		sc.close();
	}

}
