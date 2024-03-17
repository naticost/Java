

public class Professor {
	private String nome1;
	private String materia;
	private Integer sala;
	private String turno;
	
	public String getNome() {
		return nome1;
//o método getNome() permite que você obtenha o valor do atributo "nome" de um objeto da classe Pessoa. 
//Ao chamar getNome(), você receberá o valor atual do atributo "nome".
	}
	public void setNome(String nome1) {
		this.nome1 =nome1;
	//"setter" usado para atribuir um valor a um atributo (campo) de uma classe
	
	}
	
	public String getMateria(){
		return materia;
	}
	public void setMateria(String materia) {
		this.materia=materia;
	}
	
	public Integer getSala(){
		return sala;
	}
	public void setSala(Integer sala) {
		this.sala=sala;
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno=turno;
	}
}
