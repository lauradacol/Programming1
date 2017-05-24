class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
	private int horasDeAula;
	
	public ProfessorDaFaculdade(String nome, double salario, int horasDeAula){
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}
	
	public double getGastos(){
		return super.getGastos() + 10*this.horasDeAula;		
	}
			
	public String getInfo(){
		return super.getInfo() + "\nBônus: " + 10*this.horasDeAula;
	}

}
