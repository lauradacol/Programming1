class Disciplina{
    int creditos;
    int codigo;
    String nome;
    boolean concluida=false;
    
    public String toString(){
        String con=(this.concluida) ? "Disciplina Concluída." : "Em andamento";
        
        return "\nDisciplina: " + this.nome + "\nCódigo: " + this.codigo + "Créditos: " + this.creditos + "\n" + con + "\n";
    }
    
    public void encerrar(){
        this.concluida=true;
    }
    

}
