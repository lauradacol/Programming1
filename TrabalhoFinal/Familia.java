class Familia{
	private int id;
	private String nome;
		
	public Familia(int id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public String getNome(){
		return this.nome;		
	}
	
	public int getId(){
		return this.id;
	}
	
	public String toString(){
		return "ID: " + this.id + "Nome: " + this.nome;
	}
		
}
