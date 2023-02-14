package ContribuintesAuxiliar;

public class PessoaJuridica extends ContribuinteTaxa {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica () {
		
	}
	
	public PessoaJuridica(String nome, double taxaAnual, Integer numeroDeFuncionarios) {
		super(nome, taxaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double taxa() {
		if (numeroDeFuncionarios > 10) {
			taxaAnual *= 0.14;
		}
		else {
			taxaAnual *= 0.16;
		}
		return taxaAnual;
	}
}
