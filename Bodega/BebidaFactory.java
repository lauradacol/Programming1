import java.util.Scanner;

class BebidaFactory{
	public static void cadastraBebida(Empresa empresa){
		/*Criando o objeto entrada*/
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome da Bebida: ");
		String nomeBebida = entrada.nextLine();
		
		System.out.println("Teor Alcoólico (em %): ");
		double teorAlcoolico = entrada.nextDouble();
		
		System.out.println("Quantidade (em mL): ");
		double qtdeMl = entrada.nextDouble();
		
		System.out.println("Preço: R$");
		double preco = entrada.nextDouble();
		
		System.out.println("Quantidade em Estoque: ");
		int qtdeEstoque = entrada.nextInt();
		
		Bebida b1 = new Bebida(nomeBebida, teorAlcoolico, qtdeMl, preco, qtdeEstoque);
		
		empresa.bebidas.add(b1);
						
		}

}
