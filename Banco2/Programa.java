import java.util.Scanner;
import java.util.HashMap;

public class Programa{
	public static void main(String[] args){
		
		/**
		 * Criando o objeto entrada
		 */
		Scanner entrada = new Scanner(System.in);

		/** 
		 * Criando pessoas
		 */
		Pessoa p1 = new Pessoa("Maria","12345678910","Rua XXX");
		Pessoa p2 = new Pessoa("José","12345678910","Rua YYY");
				
		/** 
		 * Criando contas
		 */		
		ContaCorrente c1 = new ContaCorrente(12345, p1, 300.00);		
		ContaPoupanca c2 = new ContaPoupanca(54321, p2, 300.00);
						
		/**
		 * Declarando o HashMap
		 */		 
		HashMap<Integer, Conta> hmap = new HashMap<Integer, Conta>();
		
		hmap.put(12345, c1);
		hmap.put(54321, c2);

		/*Usuário informa a conta*/
		int escolha1=0;
		
		do{
			if(escolha1==0){
				System.out.println("CONTAS CADASTRADAS: ");
				System.out.println("Conta Corrente: " + c1.numero);
				System.out.println("Conta Poupança: " + c2.numero);
				
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
					System.out.println("6 para atualizar rendimento");
					System.out.println("7 para atualizar o limite");
					System.out.println("8 para sair");
					
					
					
					escolha = entrada.nextInt();
					
					if (escolha==1){
						conta.getSaldo();
						if(conta instanceof ContaCorrente){
							((ContaCorrente)conta).getLimite();							
							}
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
						System.out.println("Informe a conta destino: ");
						int NumeroContaDestino = entrada.nextInt();
						Conta contaDestino = hmap.get(NumeroContaDestino);
						
						System.out.println("Informe o valor da transferência");
						double valorTransferencia = entrada.nextInt();	
						
						conta.transferencia(contaDestino, valorTransferencia);
		
						}
										
					else if(escolha==5){
						System.out.println(conta);
						}

					else if(escolha==6){
						if(conta instanceof ContaPoupanca){
							System.out.println("Digite o percentual a ser atualizado: ");
							int percentual = entrada.nextInt();
							((ContaPoupanca)conta).atualiza(percentual);
							}
						else{
							System.out.println("Operação não disponível para Contas Correntes\n");
							}
						}
					
					else if(escolha==7){
						if(conta instanceof ContaCorrente){
							System.out.println("Digite o novo limite: ");
							double limiteNew = entrada.nextDouble();
							((ContaCorrente)conta).setLimite(limiteNew);
							}
						else{
							System.out.println("Operação não disponível para Contas Poupanças\n");
							}
						}
						
					else if(escolha==8){
						System.out.println("Deseja logar em outra conta? 1-Sim, 2-Não");
						int escolha2 = entrada.nextInt();
						
						if (escolha2==1){
							escolha1=0;
							}
						
						else{
							escolha1=1;
							}
						}
							
					} while(escolha!=8);
					
				}			
		}while(escolha1==0);
					
	}
	
}
