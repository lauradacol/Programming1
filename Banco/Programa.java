import java.util.Scanner;
import java.util.HashMap;


class Programa{
	public static void main(String[] args){
		
		/*Criando o objeto entrada*/
		Scanner entrada = new Scanner(System.in);

		/* 
		 * Criando pessoas
		 */
		Pessoa p1 = new Pessoa();
		p1.nome = "Maria";
		p1.cpf = "12345678910";
		p1.endereco = "Rua XXX";
		
		Pessoa p2 = new Pessoa();
		p1.nome = "José";
		p1.cpf = "12345678910";
		p1.endereco = "Rua YYY";
				
		/* 
		 * Criando contas
		 */
		
		Conta c1 = new Conta();		
		c1.numero = 12345;
		c1.pessoa = p1;
		c1.saldo = 300.00;
			
		Conta c2 = new Conta();
		c2.numero = 54321;
		c2.pessoa = p2;
		c2.saldo = 300.00;
		
		/*Declarando o HashMap*/
		HashMap<Integer, Conta> hmap = new HashMap<Integer, Conta>();
		
		hmap.put(12345, c1);
		hmap.put(54321, c2);

		/*Usuário informa a conta*/
		
		int escolha1=0;
		
		do{
			if(escolha1==0){
				System.out.println("Contas cadastradas: ");
				System.out.println(c1.numero);
				System.out.println(c2.numero);
				
				System.out.println("Informe o número da sua conta:");
				int numero_conta = entrada.nextInt();
				Conta conta = hmap.get(numero_conta);
				
				/*Menu inicial*/
				int escolha = 0;		
				do{
					System.out.println("Bem vindo ao Menu Inicial! \n Digite:\n");
					System.out.println("1 para consultar seu saldo");
					System.out.println("2 para efetuar um saque");
					System.out.println("3 para efetuar um depósito");
					System.out.println("4 para efetuar uma transferência");
					System.out.println("5 para exibir dados da conta");
					System.out.println("6 para sair");
					
					escolha = entrada.nextInt();
					
					if (escolha==1){
						conta.consultaSaldo();
						}			
					
					else if(escolha==2){
						System.out.println("Digite o valor para saque: ");
						conta.sacar(entrada.nextInt());
					}			
					
					else if(escolha==3){
						System.out.println("Digite o valor para depósito: ");
						conta.deposito(entrada.nextInt());
					}
					
					else if(escolha==4){
						System.out.println("Informe o valor da transferência");
						double valorTransferencia = entrada.nextInt();				
						
						System.out.println("Informe a conta destino: ");
						int NumeroContaDestino = entrada.nextInt();
						Conta contaDestino = hmap.get(NumeroContaDestino);
						
						conta.transferencia(contaDestino, valorTransferencia);
		
						}
					
					
					else if(escolha==5){
						System.out.println("Número da conta: " + conta.numero);
						System.out.println("Titular da conta: " + conta.pessoa.nome);
						System.out.println("Saldo: " + conta.saldo);
						System.out.println("---------------------");
						}
								
					else if(escolha==6){
						System.out.println("Deseja logar em outra conta? 1-Sim, 2-Não");
						int escolha2 = entrada.nextInt();
						
						if (escolha2==1){
							escolha1=0;
							}
						
						else{
							escolha1=1;
							}
						}
							
					} while(escolha!=6);
					
				}			
		}while(escolha1==0);
					
	}
	
}
