package Executavel;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import ExecutavelAuxiliar.Cliente;
import ExecutavelAuxiliar.Ordem;
import ExecutavelAuxiliar.OrdemItem;
import ExecutavelAuxiliar.OrdemStatus;
import ExecutavelAuxiliar.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (DD/MM/YYYY): ");
		Date dataNascimento = data.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.print("Digite o estado atual da ordem: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		
		Ordem ordem = new Ordem(new Date(), status, cliente);
		
		System.out.print("Quantos itens terão a sua ordem?");
		Integer numero = sc.nextInt();
		
		for (Integer i = 0; i < numero; i++) {
			System.out.println("Digite os dados do #" + (i+1) + " item:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade do produto: ");
			Integer quantidadeProduto = sc.nextInt();
			System.out.println();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			OrdemItem ordemItem = new OrdemItem(quantidadeProduto, precoProduto, produto);
			ordem.adicionarItem(ordemItem);
			
		}
		
		System.out.println("Sumário da ordem: ");
		System.out.println(ordem);
		
		
		
		
		sc.close();
	}

}
