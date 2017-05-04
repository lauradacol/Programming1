public class ContaCorrente extends Conta{
	double limite;
	
	/**
	 * Método construtor para Conta Corrente
	 * @param numero Inteiro com o número da Conta Corrente a ser cadastrada.
	 * @param pessoa Pessoa (objeto) dona desta conta.
	 * @param saldo Double com o saldo inicial da conta
	 */
	public ContaCorrente(int numero, Pessoa pessoa, double saldo){
		/*Importa os atributos da superclasse*/
		super(numero, pessoa, saldo);
		
		/*Estabeleci um limite padrão de início*/
		this.limite = 200;
	}
	
	/**
	 * Método set Limite
	 * Método para atualizar o limite
	 * @param limiteNew Double com o novo limite a ser atualizado
	 */
	void setLimite(double limiteNew){
		this.limite = limiteNew;
	}

	/**
	 * Método Taxa Saque
	 * Método para incluir a taxa de serviço no saque. É um método abstrato
	 * na classe pai.
	 * @param valorSaque Este parametro só é utilizado somente na subclasse
	 * ContaPoupanca
	 */
	public void taxaSaque(double valorSaque){
		this.saldo-=1;
		}
	
	public void verificaLimite(double valorSaque){
		
		}
	
	/**
	 * Método Taxa Transferência
	 * Método para calcular a taxa de transferência, que é 5. 
	 * Como o método transferencia utiliza a função sacar - que tem uma 
	 * taxa de serviço implementada de 1 real, o método taxaTransf 
	 * desconta apenas 4 reais do saldo.
	 */
	public void taxaTransf(){
		this.saldo-=4;
		}

	/**
	 * Método toString.
	 * @return As informações da conta concatenadas como uma string.
	 * */		
	public String toString(){
		return "CONTA CORRENTE\n" + super.toString + "Limite: " + this.limite + "\n";
		}
	
}
