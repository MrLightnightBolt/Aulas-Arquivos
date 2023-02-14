package ContribuintesAuxiliar;

public class PessoaFisica extends ContribuinteTaxa {

	private double gastosComSaude;
	
	public PessoaFisica () {
	}
	
	public PessoaFisica(String nome, double taxaAnual, double gastosComSaude) {
		super(nome, taxaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double taxa() {
		if (taxaAnual < 20000.00) {
			taxaAnual = (taxaAnual * 0.15) - (gastosComSaude * 0.50);
			
		}
		else {
			taxaAnual = (taxaAnual * 0.25) - (gastosComSaude * 0.50);
		}
		return taxaAnual;
	}
}
