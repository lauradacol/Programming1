class Programa{
	public static void main(String[] args){
		
		Pai p = new Filha(30,5);
		
		p.m1();
		p.m2();
		
		Filha f = (Filha) p;
		p.m1();
		p.m2();
		p.m3();
		
		}
		

}
