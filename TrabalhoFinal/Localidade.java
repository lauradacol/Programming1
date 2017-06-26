class Localidade{
	private int id;
	private String municipio;
	private String uf;
	private String localidade;
		
	public Localidade(int id, String municipio, String uf, String localidade){
		this.id = id;
		this.municipio = municipio;
		this.uf = uf;
		this.localidade = localidade;
	}
	
	public void setMunicipio(String municipioNovo){
		this.municipio = municipioNovo;
	}

	public void setUF(String ufNova){
		this.uf = ufNova;
	}

	public void setLocalidade(String localidadeNova){
		this.localidade = localidadeNova;
	}
	
	public String getMunicipio(){
		return this.municipio;		
	}
	
	public String getUF(){
		return this.uf;
	}
	
	public String getLocalidade(){
		return this.localidade;
	}
	
	public String toString(){
		return "ID: " + this.id + "Município: " + this.municipio + "UF: " + this.uf + "Localidade: " + this.localidade;
	}
		
}
