import java.util.Scanner;

class Programa{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		Conta c1 = new Conta();
		
		c1.numero = 12345;
		c1.dono = "Fulana";
		c1.saldo = 300.00;
	
						
		System.out.println("Digite o valor para saque: ");
		boolean saque = c1.sacar(entrada.nextInt());
		
		if (saque == true){
			System.out.println("Saque realizado com sucesso");
			System.out.println("Saldo final: " + c1.saldo);
		}
		else{
			System.out.println("Saldo insuficiente para saque ou valor inválido");
			}
		
		System.out.println("Digite o valor para depósito: ");
		double deposito = c1.deposito(entrada.nextInt());
		System.out.println("Saldo final: " + deposito);
		
		double saldo = c1.consulta_saldo();
		System.out.println("Saldo: " + saldo);		
			
	}
	
}
