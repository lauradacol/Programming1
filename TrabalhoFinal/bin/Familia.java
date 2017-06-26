public class Familia{
	private String nome;
		
	public Familia(String nome){
		this.nome = nome;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public String getNome(){
		return this.nome;		
	}
		
	public String toString(){
		return "Nome: " + this.nome;
	}
		
}
