package aula7;

public class Carro {

	private String modelo;
	private Double valor;
	private Double ipva;
	private Marca marca;
	
	public void calcIpva() {
		if(marca.getNome().equals("Honda")) {
			ipva = valor*5/100;
		}else if(marca.getNome().equals("Toyota")) {
			ipva = valor*6/100;
		}else {
			ipva = valor*4/100;
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getIpva() {
		return ipva;
	}
	public void setIpva(Double ipva) {
		this.ipva = ipva;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	

}
