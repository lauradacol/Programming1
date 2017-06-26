class Genero{
	private int id;
	private String nome;
	private Familia familia;
		
	public Genero(int id, String nome, Familia familia){
		this.id = id;
		this.nome = nome;
		this.familia = familia;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public void setFamilia(Familia familiaNova){
		this.familia = familia;
	}
	
	public String getNome(){
		return this.nome;		
	}
	
	public int getId(){
		return this.id;
	}
	
	public Familia getFamilia(){
		return this.familia;
	}
	
	public String toString(){
		return "ID: " + this.id + "Nome: " + this.nome + "Família: " + this.familia;
	}
		
}
