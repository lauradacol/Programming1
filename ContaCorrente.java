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

	
	
}
