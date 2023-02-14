package Calculos;

import java.util.Scanner;

public class Auxiliar6 {
	
	Scanner sc = new Scanner(System.in);
	
	private int numero;
	private String conta;
	private String opcao;
	private double deposito;
	private double depositoEntrada;
	private double depositoSaida;
	
	public Auxiliar6 () {
	}
	
	public Auxiliar6(int numero, String conta, double deposito, String opcao, double depositoEntrada, double depositoSaida) {
		super();
		this.numero = numero;
		this.conta = conta;
		this.deposito = deposito;
		this.opcao = opcao;
		this.depositoEntrada = depositoEntrada;
		this.depositoSaida = depositoSaida;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public double getDepositoEntrada() {
		return depositoEntrada;
	}

	public void setDepositoEntrada(double depositoEntrada) {
		this.depositoEntrada = depositoEntrada;
	}

	public double getDepositoSaida() {
		return depositoSaida;
	}

	public void setDepositoSaida(double depositoSaida) {
		this.depositoSaida = depositoSaida;
	}

	public String dados1 () {
		return  "Conta "
				+ numero
				+ ", Titular: "
				+ conta
				+ String.format(", Balanço: $ %.2f%n", deposito); 
	}
	
	public String dados2 () {
		return "Conta "
				+ numero
				+ ", Titular: "
				+ conta
				+ String.format(", Balanço: $ %.2f%n", deposito); 
	}
	
	public void dados3 () {
		
		if (opcao.equals("Sim")) {
			System.out.print("Digite o valor de depósito na conta: ");
			deposito = sc.nextDouble();
			System.out.println();
			System.out.println("Dados da conta: ");
			System.out.println(this.dados1());
		}
		else if (opcao.equals("Não")) {
			System.out.println();
			System.out.println("Dados da conta: ");
			System.out.println(this.dados2());
		}
		else {
			System.out.println("Por favor, escolha alguma das opções acima!");
		}
	}
	
	public void depositoEntrada () {
		
		System.out.print("Digite o valor de entrada na conta: ");
		this.depositoEntrada = sc.nextDouble();
		this.deposito = this.deposito + depositoEntrada;
		System.out.println("Atualização dos dados da conta: ");
		System.out.println(this.dados1());
		
		
		
	}
	
	public void depositoSaida () {
		System.out.print("Digite o valor de saída da conta: ");
		this.depositoSaida = sc.nextDouble();
		this.deposito = (this.deposito - depositoSaida) - 5.00;
		System.out.println("Atualização dos dados da conta: ");
		System.out.println(this.dados1());
		
		
		
		
		sc.close();
	}
	
}
