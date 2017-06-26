import java.util.ArrayList;

public class FamiliaFactory {
	
	static FamiliaFactory f;
	ArrayList<Familia> familias;
	
	private FamiliaFactory(){
		familias = new ArrayList<Familia>();
	}
	
	public static FamiliaFactory getInstance(){
		if(f==null){
			f= new FamiliaFactory();			
		}
		return f;
	}	

	public void cadastrarFamilia(String nome){
		System.out.println("Nome da Família: ");
		
		Familia f = new Familia(nome);
		familias.add(f);
	}
	
	public ArrayList<Familia> findAll(){
		return familias;		
	}
}
