package aula1_p;

import java.util.Scanner;

public class Teste {
	public static void main (String[] args) {
		Carro c1 = new Carro ();
		Scanner into = new Scanner ( System.in);
		
		System.out.println("Digite o modelo: ");
		c1.modelo=into.next();
		
		System.out.println("Digite uma marca: ");
		c1.marca = into.next();
		
		System.out.println("Digite a cor do carro: ");
		c1.cor = into.next();

		System.out.println("Digite o valor do carro: ");
		c1.valor = into.nextDouble();
		
		System.out.println ("Digite o ano do carro: ");
		c1.ano = into.nextInt();
		
		
		c1.calcIpva();
		
		System.out.println("O modelo: "+c1.modelo);
		System.out.println("A marca: "+c1.marca);
		System.out.println("O valor: R$ "+c1.valor);
		System.out.println("O valor do IPVA: R$"+c1.ipva);	
		//String - next, float - nextfloat, double-nextDouble, Integer-NextInt
	}
}
