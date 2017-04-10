class Medicamento{
	String nome;
	double precoVenda;
	Data dataValidade;
	Laboratorio laboratorio;
	boolean receitaObrigatoria;
	int qtdEstoque;
	
	public Medicamento(String nome, double precoVenda, Data dataValidade, Laboratorio laboratorio, boolean receitaObrigatoria, int qtdEstoque){
		this.nome = nome;
		this.precoVenda = precoVenda;
		this.dataValidade = dataValidade;
		this.laboratorio = laboratorio;
		this.receitaObrigatoria = receitaObrigatoria;
		this.qtdEstoque = qtdEstoque;
	}

    public String toString(){
        return "\nNome: " + this.nome + "\nPreço: " + this.precoVenda + "\nValidade: " + this.dataValidade.toString() + "\nLaboratório: " + this.laboratorio.nomeFantasia + "\nReceita: " + this.receitaObrigatoria + "\nQuantidade em estoque: " + this.qtdEstoque;
    }
  
	public void vender(int quantidade){
		if(this.qtdEstoque < quantidade){
			System.out.println("Estoque insuficiente\nQuantidade em estoque: " + this.qtdEstoque + "\n" );
			}

		else{
			if(this.receitaObrigatoria == true){
				System.out.println("ESTE MEDICAMENTO EXIJE RECEITA!!!");			
				}

			this.qtdEstoque -= quantidade;	
			}
				
		} 
	
	public void comprar(int quantidade){
		this.qtdEstoque += quantidade;
		}	
			
	public void reajustarPrecoVenda(double percentual){
		this.precoVenda = precoVenda + (precoVenda * (percentual/100));
		}
	
	public void mostra(){
		System.out.println(this.toString());
		}
	

	
}
