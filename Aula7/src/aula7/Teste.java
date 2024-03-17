package aula7;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Bairro b1 = new Bairro("Centro");
		Bairro b2 = new Bairro("Cachoeirinha");
		Bairro b3 = new Bairro("Cidade Nova");
		
		Setor s1 = new Setor("TI");
		Setor s2 = new Setor("ADM");
		Setor s3 = new Setor("LOG");
		
		Funcionario fun = new Funcionario();
		Scanner input = new Scanner(System.in);
		int a=0, b=0;
		
		System.out.println("Digite o nome do funcionario: ");
		fun.setNome(input.next());
		System.out.println("Digite a matricula do funcionario: ");
		fun.setId(input.nextInt());
		System.out.println("Digite o sal�rio do funcionario: ");
		fun.setSalario(input.nextDouble());
		System.out.println("\n##LISTA DOS BAIRROS ####");
		System.out.println("1- Bairro: "+b1.getNome());
		System.out.println("2- Bairro: "+b2.getNome());
		System.out.println("3- Bairro: "+b3.getNome());
		
		System.out.println("\nEscolha o bairro pelo c�digo (1,2,3) ");
		a = input.nextInt();
		if(a==1)
			fun.setBairro(b1);
		else if(a==2)
			fun.setBairro(b2);
		else
			fun.setBairro(b3);
		
		System.out.println("\n##LISTA DOS SETORES ####");
		System.out.println("1- SETOR: "+s1.getNome());
		System.out.println("2- SETOR: "+s2.getNome());
		System.out.println("3- SETOR: "+s3.getNome());
		
		System.out.println("\nEscolha o setor pelo c�digo (1,2,3) ");
		b = input.nextInt();
		if(b==1)
			fun.setSetor(s1);
		else if(b==2)
			fun.setSetor(s2);
		else
			fun.setSetor(s3);
		
		System.out.println("\nO nome: "+fun.getNome());
		System.out.println("O Sal�rio: R$ "+fun.getSalario());
		System.out.println("O Bairro: "+fun.getBairro().getNome());
		System.out.println("O Setor: "+fun.getSetor().getNome());
		

	}

}
