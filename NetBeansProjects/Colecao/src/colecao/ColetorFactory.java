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

public class ColetorFactory {
	
	static ColetorFactory c;
	ArrayList<Coletor> coletores;
	
	private ColetorFactory(){
		coletores = new ArrayList<Coletor>();
	}
	
	public static ColetorFactory getInstance(){
		if(c==null){
			c= new ColetorFactory();			
		}
		return c;
	}	

	public Coletor cadastrarColetor(String nome, String telefone, String email){
		//System.out.println("Nome da Família: ");
		
		Coletor c1 = new Coletor(nome, telefone, email);
                coletores.add(c1);
                
                return c1;
                
        }
	
	public ArrayList<Coletor> findAll(){
		return coletores;		
        }
    
        public Coletor findCol(String nome, String telefone, String email){
            Coletor c1 = null;
            for(Coletor c : coletores){ 
                if(c.getEmail().equals(email)){
                    c1 = c;
                }
            }
            
            if(c1 == null){
                c1 = cadastrarColetor(nome,telefone,email);               
            }
            
            return c1;            
        }

        public boolean deleteCol(Coletor c){
            if(c.individuos.size() == 0){
                coletores.remove(c);                
                return true;
            }
            
            else{                                
                return false;
            }                    
        }        
        
}
