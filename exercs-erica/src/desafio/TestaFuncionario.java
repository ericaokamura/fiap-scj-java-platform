package desafio;

public class TestaFuncionario {
	
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Erica");
		f1.setNumero(1234);
		
		Funcionario[] arrayFunc = new Funcionario[3];
		arrayFunc[0] = f1;
		arrayFunc[1] = new Funcionario(555, "Dani");
 		arrayFunc[2] = new Motorista(666, "Ioshiko");
 		
 		System.out.println(arrayFunc[0].getNome());
 		arrayFunc[1].trabalha();
 		arrayFunc[2].trabalha();
 		
 		ControleBonificacao cb = new ControleBonificacao();
 		cb.registra(f1);
 		cb.registra(arrayFunc[2]);
 		
 		System.out.println(cb.getTotalBonificacao());
	}

}
