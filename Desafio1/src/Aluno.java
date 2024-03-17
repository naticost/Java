
public class Aluno {
	private Float a1;
	private Float a2;
	private Float a3;
	private String nome;
	

	
	public String getnome() {
		return nome;
	}
	

	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public Float geta1() {
		return a1;
	}
	
	public void seta1(Float a1) {
		this.a1 = a1;
		
	}
	
	public Float geta2() {
		return a2;
	}
	
	public void seta2(Float a2) {
		this.a2 = a2;
		
	}	public Float geta3() {
		return a3;
	}
	
	public void seta3(Float a3) {
		this.a3 = a3;
		
	}
	public Float calcuMedia() {
		if (a1!=null && a2!=null & a3!=null) {
			// null =  ausência de valor ou a falta de referência a um objeto
			return (a1+a2+a3) / 3;
		}else {
			return null;
		}
	}
	
	
}
