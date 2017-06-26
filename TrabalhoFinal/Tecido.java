class Tecido{
	int id;
	String tipo;
	String local;
	
	public Tecido(int id, String tipo, String local){
		this.id = id;
		this.tipo = tipo;
		this.local = local;		
	}
	
	public void setTipo(String tipoNovo){
		this.tipo = tipoNovo;
	}

	public void setLocal(String localNovo){
		this.local = localNovo;
	}

	public String getTipo(){
		return this.tipo;
	}

	public String getLocal(){
		return this.local;
	}

	public String toString(){
		return "ID: " + this.id + "Tipo: " + this.tipo + "Local: " + this.local;
	}
}
