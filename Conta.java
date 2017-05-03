public abstract class Conta{
	int numero;
	Pessoa pessoa;
	double saldo;	

	/*Método construtor da Conta*/
	public Conta(int numero, Pessoa pessoa, double saldo){
		this.numero = numero;
		this.pessoa = pessoa;
		this.saldo = saldo;		
	}
	
	/*Função que para imprimir a mensagem que é recorrente*/
	public void printOperacao(){
		System.out.println("Operação realizada com sucesso!");
		}
	
	/*Função que imprime o saldo atual*/
	public void consultaSaldo(){
		System.out.println("Saldo: " + this.saldo);
		}
	
	/*Função que recebe um valor para sacar, verifica se ele é válido (maior que zero), 
	 * ou se há saldo suficiente
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
	
	/*Realiza o saque se a função verificaSaldo retornar True*/
	public boolean sacar(double valorSaque){
		boolean verificadorSaque = verificaSaldo(valorSaque);
		
		if(verificadorSaque){
			this.saldo-=valorSaque;
			printOperacao();
			consultaSaldo();
		}
		
		return verificadorSaque;
	}
	
	/*Recebe um double e deposita no saldo*/
	public void deposito(double valorDeposito){
		this.saldo+=valorDeposito;
		consultaSaldo();
		}
	
	/*Recebe uma conta e um double*/
	public void transferencia(Conta contaDestino, double valorTransferencia){
		boolean verificadorTransf = sacar(valorTransferencia);
		if (verificadorTransf){
			contaDestino.saldo+=valorTransferencia;
			printOperacao();
			}
		}
	}
