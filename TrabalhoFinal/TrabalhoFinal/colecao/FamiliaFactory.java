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
	
        /**
         * @return f. If f is null, create f.
         */
	public static FamiliaFactory getInstance(){
            if(f==null){
                    f= new FamiliaFactory();			
            }
            return f;
	}	

        /**
         * @param nome. The familia´s name.
         * @return f1. The newly created familia type object.
         */
	public Familia cadastrarFamilia(String nome){
            //System.out.println("Nome da Família: ");
		
            Familia f1 = new Familia(nome);
            familias.add(f1);
            
            return f1;
	}
	
        /**
         * @return familias the familia type object on familias array.
         */
	public ArrayList<Familia> findAll(){
            return familias;		
	}
        
        /**
         * @param nome. The familia´s name to be found.
         * @return f1. The familia f1 if it exists or null if don´t.
         */
        public Familia findFam(String nome){
            Familia f1 = null;
            for(Familia f : familias){ 
                if(f.getNome().equals(nome)){
                    f1 = f;
                }
            }
            
            if(f1 == null){
                f1 = cadastrarFamilia(nome);                
            }
            
            return f1;            
        }
        
        /**         * 
         * @param f. The familia to be deleted.
         * @return true if the familia has been deleted of false if don´t.
         */
        public boolean deleteFam(Familia f){
            if(f.generos.size() == 0){
                familias.remove(f);
                return true;
            }
            
            else{                                
                return false;
            }                    
        }
        
        /**         
         * @param f familia to be updated
         * @param nomeNovo to update
         */
        public void updateFam(Familia f, String nomeNovo){
            f.setNome(nomeNovo);        
        }
        

}
