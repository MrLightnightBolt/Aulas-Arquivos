package Produtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ProdutosAuxiliar.Produto;
import ProdutosAuxiliar.ProdutoImportado;
import ProdutosAuxiliar.ProdutoUsado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Produto> produtoLista = new ArrayList<>();
		
		System.out.print("Digite o número de produtos que serão cadastrados: ");
		Integer numeroP = sc.nextInt();
		
		for (Integer i = 1; i <= numeroP; i++) {
			System.out.println("Dados do #" + i + " Produto");
			System.out.println("Comum, usado ou importado (C/U/I)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if (tipo == 'U') {
				System.out.print("Data de Fabricação (DD/MM/YYYY): ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				produtoLista.add(new ProdutoUsado(nome, preco, data));
				System.out.println();
			}
			else if (tipo == 'I') {
				System.out.print("Preço de Importação: ");
				double precoImportacao = sc.nextDouble();
				
				produtoLista.add(new ProdutoImportado(nome, preco, precoImportacao));
				System.out.println();
			}
			else {
				produtoLista.add(new Produto(nome, preco));
				System.out.println();
			}
		}
		
		System.out.println("Tabela de Produtos & Preços:");
		
		for (Produto produtoP : produtoLista) {
			System.out.println(produtoP.precoDaEtiqueta());
		}
		sc.close();
	}

}
