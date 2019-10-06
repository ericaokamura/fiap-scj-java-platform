package desafio_interface;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		CalculadoraBasica c = new CalculadoraEspecial();
		
		float soma = c.somar(12.32f, 12.40f);
		System.out.println(soma);
		
		float subtracao = c.subtrair(12.45f, 10.00f);
		System.out.println(subtracao);
		
		float divisao = c.dividir(34.50f, 5.0f);
		System.out.println(divisao);
		
		float multiplicacao = c.multiplicar(12.30f, 3.00f);
		System.out.println(multiplicacao);
		
	}

}
