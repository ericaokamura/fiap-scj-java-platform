package desafio;
public class Funcionario {
	
	private int numero;
	
	private String nome;
	
	Funcionario(){
		
	}
	
	Funcionario (int xNumero, String xNome) {
		System.out.println("construtor funcionario");
		numero = xNumero;
		nome = xNome;
	}
	
	void trabalha() {
		System.out.println("Funcionário trabalha.");
	}
	
	int getBonificacao() {
		return 10;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
