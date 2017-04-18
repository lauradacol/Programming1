import java.util.Scanner;

class Funcionario{
	String nome;
	String sobrenome;
	String cpf;
	String rg;
	String idFunc;
	String dataAdmissao;
	String salario;
		
	public Funcionario(String n, String s, String c, String r, String id, String dt, String salario){
		this.nome = n;
		this.sobrenome = s;
		this.cpf = c;
		this.rg = r;
		this.idFunc = id;
		this.dataAdmissao = dt;	
		this.salario = salario;
	
		}
		
	public String toString(){
		return "\nNome: " + this.nome + "\nSobrenome: " + this.sobrenome + "\nCPF: " + this.cpf + "\nRG: " + this.rg + "\nID: " + this.idFunc + "\nData de Admissão: " + this.dataAdmissao + "\nSalário: " + this.salario+ "\n";
	}
	

	
}
