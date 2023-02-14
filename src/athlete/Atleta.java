package athlete;

public class Atleta {

	String 		nome;
	private int idade;
	
	Atleta (){
		nome = "Não informado";
		idade = 0;
	}
	
	Atleta (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	int getIdade() {
		return idade;
	}
	
	String getNome() {
		return nome;
	}
	
	void mostrarValores() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
		
	}
	
}