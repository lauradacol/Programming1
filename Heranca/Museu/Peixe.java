public class Peixe extends Animal{
	private String nomePeixe;
	private String caracteristica;
	
	public Peixe(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade, String nomePeixe, String caracteristica){
		super(nome,comprimento,patas,cor,ambiente,velocidade);
		this.nomePeixe = nomePeixe;
		this.caracteristica = caracteristica;
	}
	
	public void setCaracteristica(String caracteristicaNew){
		this.caracteristica = caracteristicaNew;
	}
	
	@Override
	public String toString(){
		return super.toString() + "Nome do Peixe: " + this.nomePeixe + "\nCaracterística do Peixe: " + this.caracteristica + "\n";
	}
	
	public String getCaracteristica(){
		return this.caracteristica;
	}

	public void getDadosPeixe(){
		System.out.println(this.toString());
	}
}