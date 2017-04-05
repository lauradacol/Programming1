class Disciplina{
    int creditos;
    int codigo;
    String nome;
    boolean concluida=false;
    
    public Disciplina(int creditosD, int codigoD, String nomeD){
		this.creditos = creditosD;
		this.codigo = codigoD;
		this.nome = nomeD;
		}
    
    public String toString(){
        String con=(this.concluida) ? "Disciplina Concluída." : "Em andamento";
        
        return "\nDisciplina: " + this.nome + "\nCódigo: " + this.codigo + "Créditos: " + this.creditos + "\n" + con + "\n";
    }
    
    public void encerrar(){
        this.concluida=true;
    }
    

}
