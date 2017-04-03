class Conta{
	int numero;
	String dono;
	double saldo;	

	public void printOperacao(){
		System.out.println("Operação realizada com sucesso!");
		}
		
	public void consultaSaldo(){
		System.out.println("Saldo: " + this.saldo);
		}
	
	public void sacar(double valorSaque){
		if(valorSaque<0){
			System.out.println("Saldo insuficiente");
			}	
					
		else if(this.saldo>=valorSaque){			
			this.saldo-=valorSaque;
			printOperacao();
			consultaSaldo();
		}
		
		else{
			System.out.println("Saldo insuficiente para saque");
			}
		}
	
	public void deposito(double valorDeposito){
		this.saldo+=valorDeposito;
		consultaSaldo();
		}
	
	public void transferencia(Conta contaDestino, double valorTransferencia){
		sacar(valorTransferencia);
		contaDestino.saldo+=valorTransferencia;
		printOperacao();
		}
	}


