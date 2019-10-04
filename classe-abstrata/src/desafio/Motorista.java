package desafio;

public class Motorista extends Funcionario {

	Motorista(int xNumero, String xNome) {
		super(xNumero, xNome);
		System.out.println("construtor motorista");
	}
	
	void dirige() {
		System.out.println("Motorista dirige");
	}
	
	void trabalha() {
		System.out.println("Motorista trabalha.");
	}
	
	int getBonificacao() {
		return 60;
	}

}
