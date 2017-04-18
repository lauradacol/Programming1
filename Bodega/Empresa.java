/* Para usar o ArrayList */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/* Para criar objetos de entrada*/
import java.util.Scanner;

class Empresa{
	String nomeFantasia;
	String razaoSocial;
	String cnpj;
	ArrayList<Funcionario> bodegueiros;
//	static int n_bodegueiros;
	
	public Empresa(String nF, String rS, String cnpj){
		this.nomeFantasia = nF;
		this.razaoSocial = rS;
		this.cnpj = cnpj;
		bodegueiros = new ArrayList<Funcionario>();
//		this.bodegueiros = new Funcionario[10];
//		n_bodegueiros = 0;
		}

 	public void contrata(Funcionario f1){
		this.bodegueiros.add(f1);
		System.out.println("Funcionário contratado com sucesso!");
		
//		this.bodegueiros[n_bodegueiros] = f1;
//		Empresa.n_bodegueiros++;
	}
	
	public Funcionario cadastraFunc(){
		/*Criando o objeto entrada*/
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("CPF: ");
		String cpf = entrada.nextLine();
		
		System.out.println("RG: ");
		String rg = entrada.nextLine();
		
		System.out.println("ID do Funcionário: ");
		String idFunc = entrada.nextLine();
		
		System.out.println("Data de admissão: ");
		String dataAdmissao = entrada.nextLine();
		
		System.out.println("Salário: ");
		String salario = entrada.nextLine();
		
		Funcionario f1 = new Funcionario(nome, sobrenome, cpf, rg, idFunc, dataAdmissao, salario);
		
		return f1;
		
	}
		
	public boolean demiteFunc(String idFunc){
		boolean b = this.bodegueiros.stream().anyMatch(f1 -> f1.idFunc.equals(idFunc));
		this.bodegueiros.removeIf(f1 -> f1.idFunc.equals(idFunc));
		return b;
	}
	
	public Optional<Funcionario> encontraFunc(String idFunc){
		return this.bodegueiros.stream().filter(f1 -> f1.idFunc.equals(idFunc)).findFirst();
				
		}
	
	
	
	
}
