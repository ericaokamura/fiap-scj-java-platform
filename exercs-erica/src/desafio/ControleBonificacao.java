package desafio;
public class ControleBonificacao {
	
	private static int totalBonificacao;

	void registra(Funcionario func) {
		totalBonificacao += func.getBonificacao();
	}
	
	int getTotalBonificacao() {
		return totalBonificacao;
	}
	
}
