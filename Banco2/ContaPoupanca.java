public class ContaPoupanca extends Conta{
	
	/*Método construtor para Conta Corrente*/
	public ContaPoupanca(int numero, Pessoa pessoa, double saldo){
		/*"Pega" os atributos da superclasse*/
		super(numero, pessoa, saldo);
	}

	/*Taxa de serviço de saque da Conta Poupança*/
	public void taxaSaque(double valorSaque){
		if(valorSaque>800){
			this.saldo-=5;
		}
	}	
	
	/*Método atualiza que recebe um percentual e atualiza o saldo*/
	public void atualiza(double percentual){
		this.saldo = this.saldo + (this.saldo*percentual/100);
		}
}

