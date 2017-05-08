public abstract class Conta{
	int numero;
	Pessoa pessoa;
	double saldo;	

	/**
	 * @param numero número da Conta.
	 * @param pessoa titular da Conta.
	 * @param saldo saldo inicial da Conta.
	 */
	public Conta(int numero, Pessoa pessoa, double saldo){
		this.numero = numero;
		this.pessoa = pessoa;
		this.saldo = saldo;		
	}
	
	/**
	 * Imprime mensagem "Operação Realizada com Sucesso!"
	 */
	public void printOperacao(){
		System.out.println("Operação realizada com sucesso!");
		}
	
	/**
	 * Imprime o saldo atual
	 * */
	public void getSaldo(){
		System.out.println("Saldo: " + this.saldo);
		}
	
	/**
	 * Verifica se se o valor de saque é válido (ou seja, maior que zero)
	 * @param valorSaque valor que o usuário deseja sacar.
	 * @return true se o valor é valido e false se não for.
	 */	
	public boolean verificaNegativo(double valorSaque){
		boolean verificadorPositivo = true;
		
		if(valorSaque < 0){
			verificadorPositivo = false;
			System.out.println("Valor inválido");
		}
		
		return verificadorPositivo;		
	}

	/**
	 * Verifica se há saldo suficiente na conta, de acordo com o valor 
	 * de saque recebido
	 * @param valorSaque valor que o usuário deseja sacar.
	 * @return true se o saldo é suficiente e false se não for.
	 */	
	public boolean verificaSaldo(double valorSaque){
		boolean verificadorSaldo = true;
				
		if(this.saldo < valorSaque){
			verificadorSaldo = false;
			System.out.println("Saldo insuficiente");
		}
		
		return verificadorSaldo;
	}
	
	/**
	* Calculará a taxa de saque de acordo com regras específicas das 
	* classes filhas.
	* @param valorSaque valor que o usuário deseja sacar.
	*/
	public abstract void taxaSaque(double valorSaque);
		
	/**
	 * Realizará o saque de acordo com regras específicas das classes
	 * filhas.
	 * @param valorSaque valor que o usuário deseja sacar.
	 * @return true se o saque ocorreu e false se não. 
	 */
	 public abstract boolean sacar(double valorSaque);
	
	/**
	 * Recebe um double e deposita no saldo
	 * @param valorDeposito valor a ser depositado na conta.
	 * */
	public void deposito(double valorDeposito){
		this.saldo+=valorDeposito;
		getSaldo();
		}
	
	/**
	 * Calculará a taxa de transferência de acordo com regras específicas
	 * das classes filhas.
	 * @param valorSaque valor que o usuário deseja sacar. 
	 * @return true se a há saldo suficiente para aplicar a taxa e false
	 * se não há.
	 */
	public abstract boolean taxaTransf(double valorSaque);
	
	/**
	 * Recebe uma conta e um double e se o método sacar retornar 
	 * verdadeiro (ou seja, se o saque desta conta ocorrer), realiza a 
	 * transferência, sacando o valor desejado da conta do usuário e 
	 * depositando na conta destino.
	 * @param contaDestino conta destino da transferência.
	 * @param valorTransferencia valor a ser sacado da conta do usuário 
	 * e transferido para a conta destino.
	 */
	public void transferencia(Conta contaDestino, double valorTransferencia){
		boolean verificadorTransf = false;
		if(taxaTransf(valorTransferencia)){
			verificadorTransf = sacar(valorTransferencia);			
			}
		
		if (verificadorTransf){
			contaDestino.deposito(valorTransferencia);
			printOperacao();
			taxaTransf(valorTransferencia);
			}
		}
	
	/**
	 * @return informações da conta concatenadas como uma string.
	 */	
	public String toString(){
		return "Número da Conta: " + this.numero + "\nTitular: " + this.pessoa.nome + "\nSaldo: " + this.saldo + "\n";
		}
			
				
	}
