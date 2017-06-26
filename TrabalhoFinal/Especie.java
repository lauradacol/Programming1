class Especie{
	private int id;
	private String nome;
	private Genero genero;
		
	public Especie(int id, String nome, Genero genero){
		this.ids = id;
		this.nome = nome;
		this.genero = genero;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public void setFamilia(Genero generoNovo){
		this.genero = generoNovo;
	}
	
	public String getNome(){
		return this.nome;		
	}
	
	public String getId(){
		return this.id;
	}
	
	public Genero getGenero(){
		return this.genero;
	}
	
	public String toString(){
		return "ID: " + this.id + "Nome: " + this.nome + "Gênero: " + this.genero;
	}
		
}
