package desafio_interface;

import javax.swing.JOptionPane;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		CalculadoraBasica c = new CalculadoraEspecial();
		
		String[] ops = {"soma", "subtração", "divisão", "multiplicação"};
		
		Object operacao = JOptionPane.showInputDialog(null,"Selecione uma operação:", "Operações", JOptionPane.QUESTION_MESSAGE, null, ops, ops[0]);
		
		float f1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Primeiro número: "));
		
		float f2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Segundo número: "));
				
		switch(operacao.toString()){
		case "soma" : 
			float soma = c.somar(f1, f2);
			System.out.println(soma);
			break;
		case "subtração": 			
			float subtracao = c.subtrair(f1, f2);
			System.out.println(subtracao);	
			break;
		case "divisão":
			float divisao = c.dividir(f1, f2);
			System.out.println(divisao);
			break;
		case "multiplicação":	
			float multiplicacao = c.multiplicar(f1, f2);
			System.out.println(multiplicacao);
			break;
		}
		
	}

}
