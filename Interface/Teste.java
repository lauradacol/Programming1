class Teste{
	public static void main(String [] args){

	AreaCalculavel retangulo = new Retangulo(5,2);
	AreaCalculavel quadrado = new Quadrado(10);
	AreaCalculavel circulo = new Circulo(5);
	
	System.out.println(retangulo.calculaArea());
	System.out.println(quadrado.calculaArea());
	System.out.println(circulo.calculaArea());
	}
}
