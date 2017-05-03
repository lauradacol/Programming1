import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

	/*Criando o objeto entrada*/
	Scanner entrada = new Scanner(System.in);
	
	Editora Abril = new Editora("Abril", 12345);
	
	System.out.println("Cadastrar nova publicação");
	
	System.out.println("Nome da Publicação: ");
	String nomePub = entrada.nextLine();
	
	System.out.println("Preço da Publicação: ");
	double precoPub = entrada.nextDouble();
	
	Publicacao p1 = new Publicacao(nomePub, precoPub, Abril);
	
	System.out.println("\n\n\n");
	
	entrada.nextLine();
	
	System.out.println("Cadastrar nova publicação semanal");
	
	System.out.println("Nome da Publicação: ");
	String nomePubSem = entrada.nextLine();
	
	System.out.println("Preço da Publicação: ");
	double precoPubSem = entrada.nextDouble();
		
	Publicacao p2 = new PublicacaoSemanal(nomePubSem, precoPubSem, Abril);	
	
	System.out.println("\n\n\n");
	
	System.out.println(p1);
	System.out.println("\n\n\n");	
	System.out.println(p2);
	}

}

