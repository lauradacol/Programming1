class Quadrado implements AreaCalculavel{
	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
		}
			
	public double calculaArea(){
		return this.lado * this.lado;		
		}
			
	}
