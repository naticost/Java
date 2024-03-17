
public class Pessoa {
	String nome;
	String rg;
	String telefone;
	int idade;
	float salario;
	
	void comprar() {
		System.out.println("A pessoa acabou de comprar");
		
		}
	void calc() {
		if (idade < 18) {
			System.out.println("não pode comprar");
			
		}else {
			System.out.println("Pode comprar");
			
		}
	}
	
}
	
