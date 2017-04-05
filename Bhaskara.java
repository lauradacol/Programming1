class Bhaskara{
	int a;
	int b;
	int c;
	
	public Bhaskara(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		}

    public void imprimeRaizes(int a, int b, int c){
		float delta = (int)Math.sqrt((b*b) - (4*a*c));
		System.out.println("x1 = " + ((-b + delta)/2*a));
		System.out.println("x1 = " + ((-b - delta)/2*a));            
    }
}
