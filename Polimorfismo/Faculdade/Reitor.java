public class Reitor extends EmpregadoDaFaculdade{
	
	public Reitor(String nome, double salario){
		super(nome, salario);		
	}
	
	public String getInfo(){
		return "PODEROSO CHEFAUM\n" + super.getInfo();
	}	

}
