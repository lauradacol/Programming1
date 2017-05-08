import java.util.Scanner;

public class ContaCorrente extends Conta{
	double limite;
	
	/**
	 * Criando o objeto entrada
	 */
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * @param numero número da Conta Corrente.
	 * @param pessoa titular da Conta Corrente.
	 * @param saldo saldo inicial da Conta Corrente.
	 */
	public ContaCorrente(int numero, Pessoa pessoa, double saldo){
		/*Importa os atributos da superclasse*/
		super(numero, pessoa, saldo);
		
		/*Estabeleci um limite padrão de início*/
		this.limite = 200;
	}
	
	/**
	 * Atualiza o limite
	 * @param limiteNew novo limite a ser atualizado
	 */
	void setLimite(double limiteNew){
		this.limite = limiteNew;
	}

	/**
	 * Imprime o limite disponível. 
	 */
	public void getLimite(){
		System.out.println("Limite: " + this.limite);
		}

	/**
	 * Inclui a taxa de serviço no saque. É um método abstrato na classe pai.
	 * @param valorSaque utilizado somente na subclasse ContaPoupanca
	 */
	public void taxaSaque(double valorSaque){
		if(saldo==0){
			System.out.println("Saldo insuficiente para aplicação de taxa de saque!\n");
			}				
		this.saldo-=1;
		}
	
	/**
	 * Recebe o valor do saque e verifica se há limite disponível.
	 * @param valorSaque o valor que o usuário deseja sacar.
	 * @return true se há limite para sacar e false se não há. 
	 */
	public boolean verificaLimite(double valorSaque){
		boolean verificadorLimite = true;
				
		if(this.limite+this.saldo < valorSaque){
			verificadorLimite = false;
			System.out.println("Limite insuficiente");
		}		
		return verificadorLimite;		
		}
	
	/**
	 * Verifica se o usuário deseja sacar do seu limite e, se sim, realiza
	 * o saque, sacando todo o valor do saldo e o restante do limite.
	 * @param valorSaque valor que o usuário deseja sacar.
	 */	
	public void sacarLimite(double valorSaque){
		System.out.println("Deseja utilizar o seu limite? (1-Sim, 2-Não)\nLimite disponível: R$" + this.limite);
		int escolha = entrada.nextInt();
		if(escolha==1){
			double restante = valorSaque - this.saldo;
			this.limite-=restante;
			this.saldo -= this.saldo;
			printOperacao();
			}	
		}
	
	/**
	 * Verifica se há saldo e se o valor é negativo. Se ambos forem true,
	 * realiza o saque, aplicando as taxas pertinentes. Se não e se há 
	 * limite disponível, chama a função sacarLimite.
	 * @param valorSaque valor que o usuário deseja sacar.
	 * @return true se o saque foi realizado e false se não.
	 * */
	public boolean sacar(double valorSaque){
		boolean verificadorSaldo = verificaSaldo(valorSaque);
		boolean verificadorNegativo = verificaNegativo(valorSaque);
		boolean verificadorSaque = verificadorSaldo && verificadorNegativo;
		
		if(verificadorSaque){
			this.saldo-=valorSaque;
			taxaSaque(valorSaque);
			printOperacao();
		}
		
		else if(verificadorSaldo == false){
			if(verificaLimite(valorSaque)){
				sacarLimite(valorSaque);
				verificadorSaque = true;			
				};						
			}
				
		return verificadorSaque;
	}	
	
	/**
	 * Calcula a taxa de transferência, que é 5. Como o método transferencia 
	 * utiliza a função sacar - que tem uma taxa de serviço implementada 
	 * de 1 real, desconta apenas 4 reais do saldo.
	 */
	public boolean taxaTransf(double valorSaque){
		boolean taxaTransferencia;
		if(valorSaque + 4 > this.saldo + this.limite){
			System.out.println("Saldo insuficiente para aplicação de taxa de transferência!\n");
			taxaTransferencia = false;
			}
		else{
			/*Implementa a taxa de transferência, que é 4 pois a função
			 * sacar ja retira 1 do saldo ao final*/			
			this.saldo-=4;
			taxaTransferencia = true;
			}
		
		return taxaTransferencia;
		
		}	
	
	/**
	 * @return informações da conta concatenadas como uma string.
	 * */		
	public String toString(){
		return "CONTA CORRENTE\n" + super.toString() + "Limite: " + this.limite + "\n";
		}
	
}
