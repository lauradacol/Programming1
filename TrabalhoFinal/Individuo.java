import java.util.Date;

class Individuo{
	int tombo;
	Coordenadas coordenadas;
	Coletor coletor;
	Localidade localidade;
	Especie especie;
	Date data;
	String vidro;
	String obs;
	
	public void setCoordenadas(Coordenadas cooNovo){
		this.coordenadas = cooNovo;
	}
	
	public void setColetor(Coletor colNovo){
		this.coletor = colNovo;
	}
	
	public void setLocalidade(Localidade localNovo){
		this.localidade = localNovo;
	}
	
	public void setEspecie(Especie spNova){
		this.especie = spNova;
	}
	
	public void setData(Date dataNova){
		this.data = dataNova;
	}
	
	public void setVidro(String vidroNovo){
		this.vidro = vidroNovo;
	}
	
	public void setObs(String obsNova){
		this.obs = obsNova; 
	}

	public Coordenadas getCoordenadas(){
		return this.coordenadas;
	}
	
	public Coletor getColetor(){
		return this.coletor;
	}
	
	public Localidade getLocalidade(){
		return this.localidade;
	}
	
	public Especie getEspecie(){
		return this.especie;
	}
	
	public Date getData(){
		return this.data;
	}
	
	public String getVidro(){
		return this.vidro;
	}
	
	public String getObs(){
		return this.obs;
	}
	
	/*
	public String toString(){
		"Tombo: " + this.tombo + "Coordenadas\n" + this.coordenadas.toString() + "Coletor\n" + this.coletor.toString() + "Localidade\n" + this.localidade.toString() + "Espécie\n" + this.especie + "Data: " + this.data + "Vidro: " + this.vidro + "Observações: " + this.obs; 
	}*/
	
}
