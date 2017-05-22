class Retangulo implements AreaCalculavel{
	double largura;
	double altura;
	
	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
		}
	
	public double calculaArea(){
		return this.largura * this.altura;		
		}
			
	}
