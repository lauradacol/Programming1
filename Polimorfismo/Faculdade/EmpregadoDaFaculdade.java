class EmpregadoDaFaculdade {

	private String nome;
	private double salario;
	
	public EmpregadoDaFaculdade(String nome, double salario){
		this.nome = nome;
		this.salario = salario;	
	}
	
	public String getNome(){
		return this.nome;		
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;		
	}
	
	public double getGastos(){
		return this.salario;		
	}
	
	public void setSalario(double salarioNovo){
		this.salario = salarioNovo;		
	}
	
	public String getInfo(){
		return "Nome: " + this.nome + "\nSalário " + this.salario;
	}	
	
}
