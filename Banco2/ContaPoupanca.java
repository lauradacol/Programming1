public class ContaPoupanca extends Conta{
	
	/**
	 * Método construtor para Conta Poupança
	 * @param numero Inteiro com o número da Conta Corrente a ser cadastrada.
	 * @param pessoa Pessoa (objeto) dona desta conta.
	 * @param saldo Double com o saldo inicial da conta
	 */
	public ContaPoupanca(int numero, Pessoa pessoa, double saldo){
		/*Importa os atributos da superclasse*/
		super(numero, pessoa, saldo);
	}

	/**
	 * Método Taxa Saque
	 * Método para incluir a taxa de serviço no saque. É um método abstrato
	 * na classe pai.
	 * @param valorSaque Double com o valor a ser sacado que se for maior
	 * que 800 descontara mais 5 do saldo do usuário (taxa de saque para
	 * Conta Poupança para saques maior que 800 reais).
	 */
	public void taxaSaque(double valorSaque){
		if(valorSaque>800){
			this.saldo-=5;
		}
	}	
	
	/**
	 * Método Atualiza
	 * Método que recebe um percentual e atualiza o saldo (rendimento
	 * da conta poupança);
	 * @param percentual Double com o percentual a ser acrecido. Se houve
	 * um aumento de 5%, deve-se passar 5 como parâmetro.
	 */
	public void atualiza(double percentual){
		this.saldo = this.saldo + (this.saldo*percentual/100);
		}
	
	/**
	 * Método toString.
	 * @return As informações da conta concatenadas como uma string.
	 * */		
	public String toString(){
	return "CONTA POUPANÇA\n" + super.toString + "\n";
	}
}

