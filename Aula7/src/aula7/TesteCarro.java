package aula7;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		
		Marca m1 = new Marca("Honda");
		Marca m2 = new Marca("Toyota");
		Marca m3 = new Marca("Vw");
		Marca m4 = new Marca("Chevrolet");
		
		Carro car = new Carro();
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0;
		System.out.println("Digite o modelo do carro: ");
		car.setModelo(input.next());
		System.out.println("Digite o valor do carro: ");
		car.setValor(input.nextDouble());
		System.out.println("\n##LISTA DE MARCAS ## ");
		System.out.println("1 - MARCA: "+m1.getNome());
		System.out.println("2 - MARCA: "+m2.getNome());
		System.out.println("3 - MARCA: "+m3.getNome());
		System.out.println("4 - MARCA: "+m4.getNome());
		System.out.println("\nEscolha a marca do carro pelo c�digo: ");
		a = input.nextInt();
		
		if(a==1)
			car.setMarca(m1);
		else if(a==2)
			car.setMarca(m2);
		else if(a==3)
			car.setMarca(m3);
		else
			car.setMarca(m4);
		
		car.calcIpva();
		
		System.out.println("O modelo do carro: "+car.getModelo());
		System.out.println("O valor do carro: R$ "+car.getValor());	
		System.out.println("A marca do Carro:  "+car.getMarca().getNome());
		System.out.println("O valor do IPVA: R$ "+car.getIpva());
	}

}
