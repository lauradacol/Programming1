public class Animal{
	protected String nome;   
	protected int comprimento;   
	protected int patas;   
	protected String cor;   
	protected String ambiente;   
	protected double velocidade;
	
	public Animal(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade){
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	void setNome(String nomeNew){
		this.nome = nomeNew;						
	}
	
	void setComprimento(int comprimentoNew){
		this.comprimento = comprimentoNew;		
	}
	
	void setPatas(int patasNew){
		this.patas = patasNew;		
	}
	
	void setCor(String corNew){
		this.cor = corNew;
	}
	
	void setAmbiente(String ambienteNew){
		this.ambiente = ambienteNew;		
	}
	
	void setVelocidade(float velocidadeNew){
		this.velocidade = velocidadeNew;
	}
	
	@Override	
	public String toString(){
		return "\nNome: " + this.nome + "\nComprimento: " + this.comprimento + "\nPatas: " + this.patas + "\nCor: " + this.cor + "\nAmbiente" + this.ambiente + "\nVelocidade" + this.velocidade + "\n";	 
	}
	
	public void setDados(){
		System.out.println(this.toString());
	}
}












