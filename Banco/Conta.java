class Conta{
	int numero;
	String dono;
	double saldo;	
		
	public double consulta_saldo(){
		return this.saldo;		
		}
	
	public boolean sacar(double valorSaque){
			
		if(valorSaque<0){
			return false;
			}	
					
		else if(this.saldo>=valorSaque){			
			this.saldo-=valorSaque;
			return true;						
		}
		else{
			return false;
			}	
		}
	
	public double deposito(double valorDeposito){
		this.saldo+=valorDeposito;
		return this.saldo;	
		
		}
	
	
	}


