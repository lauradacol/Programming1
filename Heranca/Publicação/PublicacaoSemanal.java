public class PublicacaoSemanal extends Publicacao{
	private double taxaEntrega;
//	private double valorAnuidade;
	
	void calcularAnuidade(){
//	double preco = super.getPrecoExemplar();
	super.setValorAnuidade((super.getPrecoExemplar()) * 52);
	}
	
	void calculaTaxaEntrega(){
		this.taxaEntrega = (super.getPrecoExemplar()) * 0.05;
	}

	public PublicacaoSemanal(String nome, double precoExemplar, Editora editora){
	super(nome, precoExemplar, editora);
	calcularAnuidade();
	calculaTaxaEntrega();
	}
		
	@Override
	public String toString(){
		return super.toString() + "\nValor da Anuidade: " + this.valorAnuidade + "\nTaxa de Entrega: " + this.taxaEntrega + "\n";
	}	
		
	void setTaxaEntrega(double TaxaEntregaNew){
	this.taxaEntrega = TaxaEntregaNew;
	}

	double getTaxaEntrega(){
	return this.taxaEntrega;
	}
	
}
