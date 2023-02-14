package ExercicioExcecoes;

public class Conta {
	
	private Integer conta;
	private String titular;
	private double saldo;
	private double saqueLimite;
	private double saqueValor;
	
	public Conta() {
	}

	public Conta(Integer conta, String titular, double saldo, double saqueLimite, double saqueValor) {
		super();
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
		this.saqueValor = saqueValor;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaqueLimite() {
		return saqueLimite;
	}

	public void setSaqueLimite(double saqueLimite) {
		this.saqueLimite = saqueLimite;
	}

	public double getSaqueValor() {
		return saqueValor;
	}

	public void setSaqueValor(double saqueValor) {
		this.saqueValor = saqueValor;
	}
	
	public void saqueValidacao() {
		if (saqueValor > saldo) {
			throw new Error("Erro de saque: O saldo na conta é insuficiente!");
		}
		if (saqueValor > saqueLimite) {
			throw new Error("Erro de saque: O valor do saque excedeu o limite da conta!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
