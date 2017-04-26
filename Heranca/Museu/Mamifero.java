public class Mamifero extends Animal{
	private String nomeMam;
	private String caracteristica;
	private String alimento;
	
	public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade, String nomeMam, 
			String caracteristica, String alimento){
		super(nome,comprimento,patas,cor,ambiente,velocidade);
		this.nomeMam = nomeMam;
		this.caracteristica = caracteristica;
		this.alimento = alimento;
	}
	
	public void setAlimento(String alimentoNew){
		this.alimento = alimentoNew;
	}
	
	@Override
	public String toString(){
		return super.toString() + "Nome do Mamífero: " + this.nomeMam + "\nCaracterística do Mamífero: " + this.caracteristica + "\nAlimento: " + 
	this.alimento + "\n";
	}
	
	public String getAlimento(){
		return this.alimento;
	}

	public void setDadosMamifero(){
		System.out.println(this.toString());
	}
}