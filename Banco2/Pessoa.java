public class Pessoa{
	String nome;
	String cpf;
	String endereco;
	
	/**
	 * @param nome nome da pessoa
	 * @param cpf cpf da pessoa
	 * @param endereco endereco da pessoa
	 */
	public Pessoa(String nome, String cpf, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		}
	
	/**
	 * toString.
	 * @return Informações da conta concatenadas como uma string.
	 */	
	public String toString(){
		return "Nome do Titular: " + this.nome + "\nCPF: " + this.cpf + "\nEndereço: " + this.endereco + "\n";
		}
	
}
