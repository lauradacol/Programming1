import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

class Programa{
	public static void main(String[] args){
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner entrada = new Scanner(System.in);
		
		int escolha = 0;
		
		do{		
			System.out.println("1 para cadastrar nova pessoa");
			System.out.println("2 para imprimir todas as pessoas");
			System.out.println("3 para imprimir uma pessoa");
			System.out.println("4 para sair");
			
			escolha = entrada.nextInt();
			
			if(escolha==1){
				System.out.println("Idade: ");
				int idade = entrada.nextInt();
				
				System.out.println("Peso: ");
				float peso = entrada.nextFloat();
				entrada.nextLine();
				
				System.out.println("Nome: ");
				String nome = entrada.nextLine();
				
				Pessoa p1 = new Pessoa(idade, peso, nome);			
							
				pessoas.add(p1);
						
				}
				
			else if(escolha==2){
				System.out.println(pessoas);
				}
			
			else if(escolha==3){
				entrada.nextLine();
				System.out.println("Digite o nome da pessoa: ");
				String nome = entrada.nextLine();
				
				Pessoa nomeCerto = null;
				for(Pessoa p:pessoas){
					if(nome.equals(p.getNome())){
						nomeCerto = p;
						System.out.println(p);
						break;
						}
					else{
						System.out.println("Pessoa não localizada");
						}
					}
				}
		
						
			}while(escolha<3);
	
	}
}
