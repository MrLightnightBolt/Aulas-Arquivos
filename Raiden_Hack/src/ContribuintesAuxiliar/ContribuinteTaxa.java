package ContribuintesAuxiliar;

public abstract class ContribuinteTaxa {
	
	private String nome;
	protected double taxaAnual;
	
	public ContribuinteTaxa () {
	}

	public ContribuinteTaxa(String nome, double taxaAnual) {
		super();
		this.nome = nome;
		this.taxaAnual = taxaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTaxaAnual() {
		return taxaAnual;
	}

	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}
	
	public abstract double taxa();
}
