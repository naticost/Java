
public class Principal {
	//publique fala sobre o acesso, static fala sobre estado da variavel, void sobre retorno da função, main nome da função, string é atribuido de entradas, args é o nome do array de strings
	public static void main (String[] args) {
		Usuario objeto_usuario = new Usuario();
		objeto_usuario.nome = "Natiele Costa de Souza";
		objeto_usuario.idade = 21;
		objeto_usuario.aprovado = true ;
		//SYSTEM É PACOTE TIPO BOOTSTRAP,
		System.out.println(objeto_usuario.nome);
		System.out.println("NOME: " + objeto_usuario.nome);
		System.out.println("IDADE: " + objeto_usuario.idade);
		System.out.println("APROVADO: " + objeto_usuario.aprovado);


	}
}
