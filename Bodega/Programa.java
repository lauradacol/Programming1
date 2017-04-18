import java.util.Scanner;
import java.util.Optional;

class Programa{
	public static void main(String[] args){
		
		/*Criando o objeto entrada*/
		Scanner entrada = new Scanner(System.in);
		
		/*Criando a Bodega do Joãozin*/		
		Empresa emp = new Empresa("Bodega do Joãozin", "Bodega do Joãozin Bebidas Ltda", "12.345.678/0001-23");
		
		/*Cadastrando e contratando os três funcionários para teste*/
		Funcionario f1 = new Funcionario("José", "Silva", "106.021.017-58", "4039540", "12345", "23/03/2017", "3000");
		Funcionario f2 = new Funcionario("Maria", "Rocha", "204.135.156-98", "7041590", "34567", "23/03/2017", "3000");
		Funcionario f3 = new Funcionario("Carla", "Medeiros", "304.535.456-99", "15436430", "504030", "23/03/2017", "3000");				
		
		emp.contrata(f1);
		emp.contrata(f2);
		emp.contrata(f3);
		
		Bebida b1 = new Bebida("Vodka", 30, 100, 120, 50);
		Bebida b2 = new Bebida("Cerveja", 8, 100, 20, 50);
		
		
		/*Menu Inicial*/
		int escolha1=0;
		do{
			
			System.out.println("\t\t\tBEM VINDO AO MENU INICIAL");
			System.out.println("Digite 1 para Menu de Funcionários");
			System.out.println("Digite 2 para Menu de Produtos");
			System.out.println("Digite 3 para sair");
			
			escolha1 = entrada.nextInt();
			
			if(escolha1==1){
				
				int escolha2=0;
				do{
					System.out.println("\t\t\tBEM VINDO AO MENU DE FUNCIONÁRIOS!");
					System.out.println("Digite 1 para contratar");
					System.out.println("Digite 2 para demitir");
					System.out.println("Digite 3 para visualizar todos os funcionários cadastrados");
					System.out.println("Digite 4 para visualizar dados de um funcionário");
					System.out.println("Digite 5 para retornar ao menu inicial");		
					
					escolha2 = entrada.nextInt();
					
					if(escolha2==1){
						emp.contrata(FuncFactory.cadastraFunc());
						}
					
					if(escolha2==2){
						System.out.println("Digite o id do funcionário a ser demitido: ");
						entrada.nextLine();
						String idFunc = entrada.nextLine();
						
						/*
						Optional<Funcionario> f5 = em.encontraFunc(idFunc).get()									
						emp.demiteFunc(f5);
						*/
						
						if(emp.demiteFunc(idFunc)){
							System.out.println("Funcionário demitido com sucesso");
						}
						else{
							System.out.println("Funcionário não localizado");
							}
					}
					
					if(escolha2==3){
						System.out.println(emp.bodegueiros);
						}
						
					if(escolha2==4){
						System.out.println("Digite o id do funcionário: ");
						entrada.nextLine();
						String idFunc = entrada.nextLine();
												
						Optional<Funcionario> f4 = emp.encontraFunc(idFunc);
						Optional<String> s = f4.map(x -> x.toString());
						String r = s.orElse("Funcionário não localizado");
						System.out.println(r);
					}
					
				}while(escolha2<5);
			}
				
			else if(escolha1==2){
			
				int escolha3 = 0;
				do{
					System.out.println("\t\t\tBEM VINDO AO MENU DE PRODUTOS");
					System.out.println("Digite 1 para cadastrar nova bebida");
					System.out.println("Digite 2 para vender");
					System.out.println("Digite 3 para comprar");
					System.out.println("Digite 4 para visualizar dados de todas as bebidas cadastradas");
					System.out.println("Digite 5 para visualizar dados de uma bebida");
					System.out.println("Digite 6 para sair");	

					if(escolha3==1){
						BebidaFactory.cadastraBebida(emp);
						System.out.println(emp.bebidas);
						}
					
					}while(escolha3>6);
				}
			
			else if(escolha1==3){
				break;
				}
			
			else{
				System.out.println("Escolha inválida, tente novamente");
				escolha1=0;
				}
			
			
			}while(escolha1<3);
		
		
		
		
		
		}
	}
