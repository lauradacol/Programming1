class Circulo implements AreaCalculavel{
	double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double calculaArea(){
		return (Math.PI)*(Math.pow(raio, 2));	
		}
			
	}
