package ProdutosAuxiliar;

public class ProdutoImportado extends Produto {
	
	private double precoDeImportacao;
	
	public ProdutoImportado () {
		super();
	}

	public ProdutoImportado(String nome, double preco, double precoDeImportacao) {
		super(nome, preco);
		this.precoDeImportacao = precoDeImportacao;
	}

	public double getPrecoDeImportacao() {
		return precoDeImportacao;
	}

	public void setPrecoDeImportacao(double precoDeImportacao) {
		this.precoDeImportacao = precoDeImportacao;
	}
	
	@Override
	public String precoDaEtiqueta () {
		return getNome() + " $ " + String.format("%.2f", getPreco())
		+ " (Preço de Importação: $ "
		+ String.format("%.2f", precoDeImportacao)
		+ ")";
	}
	
	public double precoTotal () {
		return getPreco() + precoDeImportacao;
	}	
}
