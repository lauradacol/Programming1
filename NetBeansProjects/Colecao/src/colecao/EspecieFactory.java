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

public class EspecieFactory {
	
	static EspecieFactory e;
	ArrayList<Especie> especies;
	
	private EspecieFactory(){
		especies = new ArrayList<Especie>();
	}
	
	public static EspecieFactory getInstance(){
		if(e==null){
			e= new EspecieFactory();			
		}
		return e;
	}	

	public Especie cadastrarEspecie(Genero genero, String nome){
		//System.out.println("Nome da Família: ");
		
		Especie e1 = new Especie(genero, nome);
                especies.add(e1);
                genero.especies.add(e1);   
                
                return e1;
                
        }
	
	public ArrayList<Especie> findAll(){
		return especies;		
	}

        
        public Especie findEsp(String nomeFam, String nomeGen, String especie){
            Especie e1 = null;
            for(Especie e : especies){ 
                if(e.getNome().equals(especie)){
                    e1 = e;
                }
            }
            
            if(e1 == null){
                Genero genero = GeneroFactory.getInstance().findGen(nomeFam, nomeGen);           
                e1 = cadastrarEspecie(genero, especie);
                                
            }
            
            return e1;            
        }
        
        public boolean deleteEsp(Especie e){
            if(e.individuos.size() == 0){
                especies.remove(e);
                return true;
            }
            
            else{                                
                return false;
            }                    
        }
        
}
