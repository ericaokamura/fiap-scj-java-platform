package desafio2;

public class ContaPoupanca extends ContaBancaria {

	private String titular;
	private double saldo;
	private long numero;
	
	ContaPoupanca (String titular, double saldo, long numero) {
		this.titular = titular;
		this.saldo = saldo;
		this.numero = numero;
	}
	
	String getTipo() {
		return "Poupan�a";
	}
	
}
