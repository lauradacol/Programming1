public abstract class Conta{
	int numero;
	Pessoa pessoa;
	double saldo;	

	/**
	 * Método construtor da Conta
	 * @param numero Inteiro com o número da Conta Corrente a ser cadastrada.
	 * @param pessoa Pessoa (objeto) dona desta conta.
	 * @param saldo Double com o saldo inicial da conta
	 * */
	public Conta(int numero, Pessoa pessoa, double saldo){
		this.numero = numero;
		this.pessoa = pessoa;
		this.saldo = saldo;		
	}
	
	/**
	 * Método Print Operação
	 * Método que imprimir mensagem recorrente
	 */
	public void printOperacao(){
		System.out.println("Operação realizada com sucesso!");
		}
	
	/**
	 * Método Consulta Saldo
	 * Método que imprime o saldo atual
	 * */
	public void consultaSaldo(){
		System.out.println("Saldo: " + this.saldo);
		}
	
	/**
	 * Método Verifica Saldo
	 * Método que verifica se há saldo suficiente na conta, de acordo
	 * com o valor de saque recebido ou se o valor de saque é válido
	 * (ou seja, maior que zero)
	 * @param valorSaque Double com o valor que o usuário deseja sacar.
	 * @return varificadorSaldo. Boolean que é igual a true se o saldo 
	 * é suficiente e se o valor é válido, falso se o valor é inválido 
	 * ou saldo insuficiente.
	 */	
	public boolean verificaSaldo(double valorSaque){
		boolean verificadorSaldo = true;
		
		if(this.saldo < valorSaque){
			verificadorSaldo = false;
			System.out.println("Saldo insuficiente");
		}
		
		if(valorSaque < 0){
			verificadorSaldo = false;
			System.out.println("Valor inválido");
		}
		
		return verificadorSaldo;		
	}
	
	/**
	* Método Taxa de Serviço. 
	* É abstrato para que as classes filhas herdem a responsabilidade 
	* de tornar este método concreto. Recebe o valorSaque pois, embora
	* este parâmetro não seja usado na subclasse ContaCorrente, é
	* necessário na subclasse ContaPoupanca
	* @param valorSaque double com o valor que o usuário deseja sacar.
	*/
	public abstract void taxaSaque(double valorSaque);
	
	/**
	 * Método Sacar
	 * Realiza o saque se a função verificaSaldo retornar True. 
	 * Executa os métodos taxaSaque e printOperação.
	 * @param valorSaque double com o valor que o usuário deseja sacar.
	 * @return verificadorSaque. Boolean que retorna true se o
	 * saque for possível (Se verificadorSaque = true) ou false se não 
	 * (se verificadorSaque = false)
	 */
	public boolean sacar(double valorSaque){
		boolean verificadorSaque = verificaSaldo(valorSaque);
		
		if(verificadorSaque){
			this.saldo-=valorSaque;
			taxaSaque(valorSaque);
			printOperacao();
		}
		
		return verificadorSaque;
	}
	
	/**
	 * Método Depósito
	 * Recebe um double e deposita no saldo
	 * @param valorDeposito Double com o valor a ser depositado na conta.
	 * */
	public void deposito(double valorDeposito){
		this.saldo+=valorDeposito;
		consultaSaldo();
		}
	
	/**
	 * Método Transferência
	 * Recebe uma conta e um double. Se o método sacar retornar 
	 * verdadeiro (ou seja, se o saque desta conta ocorrer) o método
	 * realiza a transferência, sacando o valor desejado da conta do 
	 * usuário e depositando na conta destino.
	 * @param contaDestino Conta com a conta destino da transferência.
	 * @param valorTransferencia Double com o valor a ser sacado da conta
	 * do usuário e transferido para a conta destino.
	 */
	public void transferencia(Conta contaDestino, double valorTransferencia){
		boolean verificadorTransf = sacar(valorTransferencia);
		if (verificadorTransf){
			contaDestino.deposito(valorTransferencia);
			printOperacao();
			
			/*Implementa a taxa de transferência, que é 4 pois a função
			 * sacar ja retira 1 do saldo ao final*/
			this.saldo -=4;
			}
		}
	
	/**
	 * Método toString.
	 * @return As informações da conta concatenadas como uma string.
	 * */	
	public String toString(){
		return "Número da Conta: " + this.conta + "\nTitular: " + this.pessoa.nome + "Saldo: " + this.saldo + "\n";
		}
			
				
	}
