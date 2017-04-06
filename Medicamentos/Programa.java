import java.util.Scanner;
import java.util.HashMap;

class Programa{
	public static void main(String[] args){
		
		/*Criando o objeto entrada*/
		Scanner entrada = new Scanner(System.in);

		/*
		 * Criando um medicamento 
		 */
		Medicamento m1 = new Medicamento("Rivotril", 89.90, "30/06/2017", "Roche", true, 50);
		Medicamento m2 = new Medicamento("Paracetamol", 15.90, "15/12/2017", "CIMED", false,100);		

		/*Declarando o HashMap*/
		HashMap<String, Medicamento> hmap = new HashMap<String, Medicamento>();
		
		hmap.put(m1.nome, m1);
		hmap.put(m2.nome, m2);
			
		System.out.println("\n\n\t\tFARMÁCIAS DAS DROGA");
		
		int op;
		
		do{
			System.out.println("\n\n\t\t\t\tMENU");
			System.out.println("\t1 - Comprar medicamento");
			System.out.println("\t2 - Vender medicamento");
			System.out.println("\t3 - Reajustar o preço");
			System.out.println("\t4 - Mostrar dados de medicamento");
			System.out.println("\t5 - Sair");
			
			op = entrada.nextInt();
			
			switch(op){
				case 1:	
					entrada.nextLine();
					
					System.out.println("\tDigite o nome do medicamento: ");
					String nomeMedicamento = entrada.nextLine();
															
					System.out.println("\tDigite a quantidade: ");					
					int quantidade = entrada.nextInt();	
					
					Medicamento med = hmap.get(nomeMedicamento);				
					med.comprar(quantidade);
					break;
					
				case 2:
					entrada.nextLine();
					
					System.out.println("\tDigite o nome do medicamento: ");
					String nomeMedicamento2 = entrada.nextLine();
															
					System.out.println("\tDigite a quantidade: ");					
					int quantidade2 = entrada.nextInt();	
					
					Medicamento med2 = hmap.get(nomeMedicamento2);				
					med2.vender(quantidade2);
					break;

				case 3:
					entrada.nextLine();				
					System.out.println("\tDigite o nome do medicamento: ");
					String nomeMedicamento3 = entrada.nextLine();
					
					System.out.println("\tDigite o percentual do reajuste (para descontos, inserir um percentual negativo): ");
					double percentual = entrada.nextDouble();
										
					Medicamento med3 = hmap.get(nomeMedicamento3);
					med3.reajustarPrecoVenda(percentual);
					break;
					
					
				case 4:
					entrada.nextLine();					
					System.out.println("\tDigite o nome do medicamento: ");
					String nomeMedicamento4 = entrada.nextLine();
					
					Medicamento med4 = hmap.get(nomeMedicamento4);
					med4.mostra();
					break;
							
				case 5:
					break;
				default:
					System.out.println("Opção inexistente!\n");	
			}
		}while(op!=6);
			
	}
	
}
