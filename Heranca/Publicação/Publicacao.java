class Publicacao{
	private String nome;
	private double precoExemplar;
	protected double valorAnuidade;
	private Editora editora;
	
	void calcularAnuidade(){
		this.valorAnuidade = this.precoExemplar * 12;
		}

	public Publicacao(String nome, double precoExemplar, Editora editora){
		this.nome = nome;
		this.precoExemplar = precoExemplar;
		this.editora = editora;
		calcularAnuidade();
		}
	
	@Override	
	public String toString(){
		return "\nNome: " + this.nome + "\nPreço do Exemplar: " + this.precoExemplar +  "\nValor da Anuidade: " + this.valorAnuidade + "\nEditora: " + this.editora.getNome() +"\n";	 
	}
		
	void setNome(String nomeNew){
		this.nome = nomeNew;
		}
	
	String getNome(){
		return this.nome;
		}
	
	void setPrecoExemplar(double precoExemplarNew){
		this.precoExemplar = precoExemplarNew;
		}
	
	double getPrecoExemplar(){
		return this.precoExemplar;
		}
		
	void setValorAnuidade(double valorAnuidadeNew){
		this.valorAnuidade = valorAnuidadeNew;
		}
	
	double getValorAnuidade(){
		return this.valorAnuidade;
		}	
	
	}
