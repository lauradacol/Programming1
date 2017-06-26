/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

/**
 *
 * @author laura
 */
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
		//System.out.println("Nome da Família: ");
		
		Familia f1 = new Familia(nome);
		familias.add(f1);
	}
	
	public ArrayList<Familia> findAll(){
		return familias;		
	}
}
