package desafio2;

public class ContaCorrente extends ContaBancaria {
	
	private String titular;
	private double saldo;
	private long numero;
	
	ContaCorrente (String titular, double saldo, long numero) {
		this.titular = titular;
		this.saldo = saldo;
		this.numero = numero;
	}

	void saque(double valor) {
		this.saldo = this.saldo - (valor + 0.1);
	}
	
	String getTipo() {
		return "Corrente";
	}
}
