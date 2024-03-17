import java.util.Scanner;

public class FrontV1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		
		Aluno aluno1 = new Aluno(); 
		Professor professor1 = new Professor();

		
		do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Imprimir nota do Aluno");
            System.out.println("3. Calcular Média do Aluno");
            System.out.println("4. Cadastrar Professor");
            System.out.println("5. Imprimir o Dados do Professor");
            System.out.println("6. Saída");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            
    		
            switch (opcao) {
            case 1:
        		System.out.println("Digite o seu nome: ");
        	    String nome = input.next();
        	    
        	    
        		System.out.println("Digite a 1° nota: ");
        		Float a1 = input.nextFloat(); 
        		aluno1.seta1(a1);
        		
        		System.out.println("Digite a 2° nota: ");
        		Float a2 = input.nextFloat();
        		aluno1.seta2(a2);
        		
        		System.out.println("Digite a 1° nota: ");
        		Float a3 = input.nextFloat();
        		aluno1.seta3(a3);
        		
                System.out.println("Aluno cadastrado com sucesso!");

            	break;
            case 2:
            	System.out.println( "Essas são as respectivas notas do aluno "+ aluno1.geta1() + ", " + aluno1.geta2() + ", " + aluno1.geta3() + " ");
            	break;


            case 3:
            	float md = aluno1.calcuMedia();
            	System.out.println("A média do aluno foi "+ md);
            	break;
            	
            case 4:
                System.out.println("Você escolheu a categoria cadastrar Professor, preencha as informaçôes abaixo!");
                System.out.println("Digite seu nome: ");
                String nome1 = input.next();
                
                System.out.println("Qual a matéria que você administra? ");
                String materia = input.next();
                professor1.setMateria(materia);

                System.out.println("Qual a sua sala? ");
                Integer sala = input.nextInt();
                professor1.setSala(sala);
        
                System.out.println("Qual seu Turno? ");
                String turno = input.next();
                professor1.setTurno(turno);
                break;
                
            case 5:
                System.out.println("!");
                break;
                
            case 6:
                System.out.println("teste1");
                break;
                

         }
      }while (opcao !=6);

	
	
}
		
}
