class Programa{
	public static void main(String[] args){
		
		Pai p = new Filha(30,5);
		
		p.m1();
		p.m2();
		
		Filha f = (Filha)p;
		f.m1();
		f.m2();
		f.m3();
		
		}
		

}
