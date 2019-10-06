package desafio;

public class Diretor extends Funcionario implements Autenticavel {

	private String senha;
	
	@Override
	public int getBonificacao() {
		return 60;
	}
	
	@Override
	public boolean autentica(String senha) {
		if(this.senha != senha) {
			return false;
		}
		return true;
	}
}
