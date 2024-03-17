package aula1_p;

public class Carro {
	String nome;
	String modelo;
	String marca;
	String cor;
	Double valor;
	Double ipva;
	Integer ano;
	
	void calcIpva() {
        marca = marca.toLowerCase(); // Convertendo para minúsculas para padronização

		if(marca.equals("byd")) {
			ipva = 0.0;
		}else if(marca.equals("chevrolet")) {
			ipva = valor*2/100;
			
		}else if (marca.equals("vw")) {
			ipva = valor*3/100;
			
		}else if (marca.equals("honda")) {
			ipva = valor*5/100;
			
		}else {
			ipva = valor*0.06;
				
		}
	}

}
