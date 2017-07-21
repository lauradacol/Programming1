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
	
        /** 
         * @return c. If c is null, create c.
         */
	public static ColetorFactory getInstance(){
		if(c==null){
			c= new ColetorFactory();			
		}
		return c;
	}	

        /** 
         * @param nome. The coletor´s nome.
         * @param telefone. The coletor`s telefone. 
         * @param email. The coletor`s email.
         * @return c1. The newly created coletor type object.
         */
	public Coletor cadastrarColetor(String nome, String telefone, String email){
		//System.out.println("Nome da Família: ");
		
		Coletor c1 = new Coletor(nome, telefone, email);
                coletores.add(c1);
                
                return c1;
                
        }
	
        /** 
         * @return coletores. The coletor type objects on coletores array.
         */
	public ArrayList<Coletor> findAll(){
		return coletores;		
        }
    
        /** 
         * @param nome. The nome of the coletor to be found.
         * @param telefone. The telefone of the coletor to be found. 
         * @param email. The email of the coletor to be found.
         * @return c1. The coletor c1 if it existis or null if don´t.
         */
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

        /** 
         * @param c. The coletor c to be deleted.
         * @return true if c has been deleted or false if don´t.
         */
        public boolean deleteCol(Coletor c){
            if(c.individuos.size() == 0){
                coletores.remove(c);                
                return true;
            }
            
            else{                                
                return false;
            }                    
        }

        /** 
         * @param c Coletor c to be updated
         * @param nome to update
         * @param telefone to update
         * @param email to update
         */
        public void updateCol(Coletor c, String nome, String telefone, String email){
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
        }         
        
}
