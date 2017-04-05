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
		float delta = (b*b) - (4*a*c);
		
		if(delta<0){
			System.out.println("Delta negativo!");
			}
		else{		
			float delta2 = (int)Math.sqrt(delta);
			System.out.println("x1 = " + ((-b + delta2)/2*a));
			System.out.println("x1 = " + ((-b - delta2)/2*a));            
		}
    }
}
