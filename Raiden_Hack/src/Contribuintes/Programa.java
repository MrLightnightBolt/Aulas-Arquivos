package Contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ContribuintesAuxiliar.ContribuinteTaxa;
import ContribuintesAuxiliar.PessoaFisica;
import ContribuintesAuxiliar.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<ContribuinteTaxa> listaCT = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		Integer contribuinte = sc.nextInt();
		
		for (Integer c = 1; c <= contribuinte; c++) {
			System.out.println("Dados do #" + c + " contribuinte: ");
			System.out.println("Pessoa física ou Pessoa jurídica (F/J)?");
			char tipo = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (tipo == 'F') {
				System.out.print("Gastos com saúde: ");
				double gastosComSaude = sc.nextDouble();
				
				listaCT.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			}
			else if (tipo == 'J') {
				System.out.print("Número de funcionários: ");
				Integer numeroDeFuncionarios = sc.nextInt();
				
				listaCT.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("Preços das Taxas: ");
		
		for (ContribuinteTaxa ct : listaCT) {
			System.out.println(ct.getNome() + ": $ " 
		    + String.format("%.2f", ct.taxa()));
		}
		
		System.out.println();
		System.out.print("Preço total das Taxas: $ ");
		double soma = 0.00;
		
		for (ContribuinteTaxa ct : listaCT) {
			soma += ct.getTaxaAnual();
		}
		
		System.out.printf("%.2f", soma);
		
		sc.close();
	}

}
