public class ContaPoupanca extends Conta{
	
	/**
	 * @param numero número da Conta Poupança.
	 * @param pessoa titular da Conta Poupança.
	 * @param saldo saldo inicial da Conta Poupança.
	 */
	public ContaPoupanca(int numero, Pessoa pessoa, double saldo){
		/*Importa os atributos da superclasse*/
		super(numero, pessoa, saldo);
	}

	/**
	 * Inclui a taxa de serviço no saque. É um método abstrato na classe 
	 * pai.
	 * @param valorSaque valor a ser sacado que se for maior que 800 
	 * descontará mais 5 do saldo do usuário (taxa de saque para Conta 
	 * Poupança para saques maior que 800 reais).
	 */
	public void taxaSaque(double valorSaque){
		if(saldo==0){
			System.out.println("Saldo insuficiente para aplicação de taxa de saque!\n");
			}		
		if(valorSaque>800){
			this.saldo-=5;
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
		
		return verificadorSaque;
	}		
	
	/**
	 * Recebe um percentual e atualiza o saldo (rendimento da conta poupança);
	 * @param percentual a ser acrecido. Se houve um aumento de 5%, 
	 * deve-se passar 5 como parâmetro.
	 */
	public void atualiza(double percentual){
		this.saldo = this.saldo + (this.saldo*percentual/100);
		}

	public boolean taxaTransf(double valorSaque){
		return true;		
		}	
	
	/**
	 * Método toString.
	 * @return informações da conta concatenadas como uma string.
	 * */		
	public String toString(){
	return "CONTA POUPANÇA\n" + super.toString() + "\n";
	}
}

