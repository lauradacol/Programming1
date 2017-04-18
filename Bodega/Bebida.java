class Bebida{
	String nomeBebida;
	double teorAlcoolico;
	double qtdeMl;
	double preco;
	int qtdeEstoque;
	
	public Bebida(String nomeBebida, double teorAlcoolico, double qtdeMl, double preco, int qtdeEstoque){
		this.nomeBebida = nomeBebida;
		this.teorAlcoolico = teorAlcoolico;
		this.qtdeMl = qtdeMl;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
		}

	public boolean confereEstoque(int qtde){
		if(this.qtdeEstoque>=qtde){
			return true;
			}
		else{
			return false;
			}
		}
	
	public void vende(int qtde){
		if (confereEstoque(qtde)){
			this.qtdeEstoque-= qtde;
			}
		else{
			System.out.println("Estoque insuficiente!");
			System.out.println("Quantidade disponível em estoque: " + this.qtdeEstoque);
			}
		}
	
	public void compra(int qtde){
		this.qtdeEstoque+=qtde;
		}

	public String toString(){
		return "\nNome da bebida: " + this.nomeBebida + "\nTeor Alcoolico (em %): " + this.teorAlcoolico + "\nQuantidade (em mL)" + this.qtdeMl + "\nPreço: R$" + this.preco + "\nQuantidade em Estoque: " + this.qtdeEstoque + "\n";
		}
}
