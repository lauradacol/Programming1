public class Teste {

	public static void main(String[] args){
		
		EmpregadoDaFaculdade diego = new EmpregadoDaFaculdade("Diego", 3500.00);
		ProfessorDaFaculdade priscila = new ProfessorDaFaculdade("Priscila", 10000.00, 30);
		Reitor rifam = new Reitor("Rifam", 30000.00);
		
		Relatorio.add(rifam);
		Relatorio.add(priscila);
		Relatorio.add(diego);
		
	}
	
}
