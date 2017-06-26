class Coordenadas{
	int id;
	String x;
	String y;
	String unidade;
	String datum;
	
	public void setX(String xNovo){
		this.x = xNovo;
	}
	
	public void setY(String yNovo){
		this.y = yNovo;
	}

	public void setUnidade(String unidadeNova){
		this.unidade = unidadeNova;
	}
	
	public void setDatum(String datumNovo){
		this.datum = datumNovo;
	}	
	
	public String getX(){
		return this.x;
	}
	
	public String getY(){
		return this.y;
	}

	public String getUnidade(){
		return this.unidade;
	}
	
	public String getDatum(){
		return this.datum;
	}	

	public String toString(){
		return "ID: " + this.id + "Coordenada x: " + this.x + "Coordenada y: " + this.y + "Unidade: " + this.unidade + "Datum: " + this.datum; 
	}
}
