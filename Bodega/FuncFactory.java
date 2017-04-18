/* Para criar objetos de entrada*/
import java.util.Scanner;

class FuncFactory{

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

}
