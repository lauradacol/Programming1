public class Empresa{
	
	//array do tipo da superclasse
	Empregado[] emps = new Empregado[10]; 
	int n = 0;
	
	//recebe um argumento do tipo da superclasse
	public void registrar(Empregado emp){
		emps[n] = emp;
		n++;		
		}	
	}
