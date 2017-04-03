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
	
	public boolean sacar(double valorSaque){
		boolean verificador = true;
		if(valorSaque<0){
			System.out.println("Valor inválido");
			}	
					
		else if(this.saldo>=valorSaque){			
			this.saldo-=valorSaque;
			printOperacao();
			consultaSaldo();
			verificador = true;
		}
		
		else{
			System.out.println("Saldo insuficiente");
			verificador = false;
			}
			
		return verificador;		
		}
	
	public void deposito(double valorDeposito){
		this.saldo+=valorDeposito;
		consultaSaldo();
		}
	
	public void transferencia(Conta contaDestino, double valorTransferencia){
		boolean verificador = sacar(valorTransferencia);
		if (verificador == true){
			contaDestino.saldo+=valorTransferencia;
			printOperacao();
		}
		}
	}


