class Coletor{
	String email;
	String nome;
	String telefone;
	
	public Coletor(String email, String nome, String telefone){
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void setEmail(String emailNovo){
		this.email = emailNovo;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public void setTelefone(String telefoneNovo){
		this.telefone = telefoneNovo;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public String toString(){
		return "E-mail: " + this.email + "Nome: " + this.nome + "Telefone: " + this.telefone;
	}

}
