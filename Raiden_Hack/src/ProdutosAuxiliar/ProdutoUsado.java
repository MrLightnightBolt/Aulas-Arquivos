package ProdutosAuxiliar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	
	private LocalDate dataDeFabricacao;
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado () {
		super();
	}

	public ProdutoUsado(String nome, double preco, LocalDate dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public LocalDate getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	public String precoDaEtiqueta () {
		return getNome() + " $ " + String.format("%.2f", getPreco())
		+ " (Data da Fabricação: "
		+ dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		+ ")";
	}
}
