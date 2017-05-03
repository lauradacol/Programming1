public class ContaCorrente extends Conta{
	double limite;
	
	/*Método construtor para Conta Corrente*/
	public ContaCorrente(int numero, Pessoa pessoa, double saldo){
		/*"Pega" os atributos da superclasse*/
		super(numero, pessoa, saldo);
		
		/*Estabeleci um limite padrão de início*/
		this.limite = 200;
	}
	
	/*Método para atualizar o limite*/
	void setLimite(double limiteNew){
		this.limite = limiteNew;
	}

	/*Taxa de serviço de saque da Conta Corrente*/
	public void taxaSaque(double valorSaque){
		this.saldo-=1;
		}
	
	/*Taxa de serviço de transferência da Conta Corrente*/
	public void taxaTransf(){
		this.saldo-=4;
		}
	
	
	/**
	 * Transferir da Conta Corrente
	 * @param contaDestino Conta que receberá a transferência.
	 * @param valorTransferencia Valor a ser transferido para contaDestino.
	 * 
	 */
	 
	 /*
	public void transferencia(Conta contaDestino, double valorTransferencia){
		boolean verificadorTransf = sacar(valorTransferencia);
		if (verificadorTransf){
			
			for(int i=0; i<4; i++){
				taxaServico(valorTransferencia);
			}}}*/
	
	
}
