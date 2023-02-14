package athlete;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Atleta rodrigo = new Atleta();
		rodrigo.mostrarValores();
		
		Atleta rafael = new Atleta("Rafael", 34);
		rafael.mostrarValores();
		
		rafael.setIdade(8);
		rafael.mostrarValores();
		
		System.out.println("Leitura do nome: " + rafael.getNome());
		System.out.println("Leitura da idade: " + rafael.getIdade());

		Scanner leitor = new Scanner(System.in);
		
		String texto = leitor.nextLine();
		
		System.out.println("Texto " + texto);
		
		leitor.nextLine();
		
			
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
	
		Atleta jeferson = new Atleta();
		jeferson.setNome(nome);
		jeferson.setIdade(idade);
		jeferson.mostrarValores();

		leitor.close();
	}
}
