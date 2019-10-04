package desafio2;

public abstract class ContaBancaria {
	
	private String titular;
	
	private double saldo;
	
	private long numero;
	
	double getSaldo(){
		return this.saldo;
	}
	
	void saque(double valor){
		this.saldo -= valor;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	String getTipo() {
		return "Conta";
	}

}
