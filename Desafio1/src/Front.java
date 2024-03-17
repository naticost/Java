import java.util.Scanner;

public class Front {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		
		System.out.println("Digite o seu nome: ");
	    String nome = input.next();
		
		Aluno aluno1 = new Aluno(nome);
		System.out.println(aluno1.getnome()+" foi salvo com sucesso");
		
		
		System.out.println("Digite o nome do seu Professor(a): ");
		String nomeprof = input.next();
		Professor professor1 = new Professor(nomeprof);
		
	
		
		
		System.out.println("Digite a 1° nota: ");
		Float a1 = input.nextFloat(); //Esta linha lê um valor float da entrada padrão (teclado) e o armazena na variável a1. Ela não está diretamente relacionada ao objeto aluno1, mas sim ao valor a1
		//O método next() da classe Scanner retorna uma sequência de caracteres (String). Para ler um valor float, você deve usar nextFloat().
		aluno1.seta1(a1); //aqui eu espeficio de quem é, usado para atribuir o valor da nota a1 do aluno representado pelo objeto aluno1 com o valor fornecido na variável a1
		
		
		
		System.out.println("Digite a 2° nota: ");
		Float a2 = input.nextFloat();
		aluno1.seta2(a2);
		
		System.out.println("Digite a 1° nota: ");
		Float a3 = input.nextFloat();
		aluno1.seta3(a3);
		
	
		System.out.println( "As notas "+ aluno1.geta1() + ", " + aluno1.geta2() + ", " + aluno1.geta3() + " "+ "foram salvas com sucesso");
		
		do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Imprimir nome do Aluno");
            System.out.println("2. Imprimir nota do Aluno");
            System.out.println("3. Calcular Média");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            
            switch (opcao) {
            case 1:
            	System.out.println("O nome do aluno é "+ aluno1.getnome());
            	break;
            	
            case 2:
            	System.out.println( "Essas são as respectivas notas do aluno "+ aluno1.geta1() + ", " + aluno1.geta2() + ", " + aluno1.geta3() + " ");
            	break;
            case 3:
            	float md = aluno1.calcuMedia();
            	System.out.println("A média do aluno foi "+ md);

            	break;
            case 4:
                System.out.println("Saindo do programa.");
                break;
             default:
            	 System.out.println("Opção Inválida");
         }
      }while (opcao !=4);

	
	
}
		
}
