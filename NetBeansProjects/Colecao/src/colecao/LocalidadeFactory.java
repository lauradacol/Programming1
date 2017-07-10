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

public class LocalidadeFactory {
	
	static LocalidadeFactory l;
	ArrayList<Localidade> localidades;
	
	private LocalidadeFactory(){
		localidades = new ArrayList<Localidade>();
	}
	
        /** 
         * @return l. If l is null, create l.
         */
	public static LocalidadeFactory getInstance(){
		if(l==null){
			l= new LocalidadeFactory();			
		}
		return l;
	}	

        /** 
         * @param uf. The uf´s name.
         * @param municipio. The municipio´s name.
         * @param localidade . The localidade´s name.
         * @return l1. The newly created localidade type object.
         */
	public Localidade cadastrarLocalidade(String uf, String municipio, String localidade){
		//System.out.println("Nome da Família: ");
		
		Localidade l1 = new Localidade(uf,municipio,localidade);
                localidades.add(l1);
                
                return l1;
                
        }
	
        /** 
         * @return localidades. The localidade type objects on localidades array. 
         */
	public ArrayList<Localidade> findAll(){
		return localidades;		
        }

        /** 
         * @param uf. The uf´s name of the localidade to be found.
         * @param municipio. The municipio´s name of the localidade to be found.
         * @param localidade. The localidade´s name of the localidade to be found.
         * @return l1. The localidade l1 if it exists or null if don´t.
         */
        public Localidade findLoc(String uf, String municipio, String localidade){
            Localidade l1 = null;
            for(Localidade l : localidades){ 
                if(l.getLocalidade().equals(localidade)){
                    l1 = l;
                }
            }
            
            if(l1 == null){
                l1 = cadastrarLocalidade(uf,municipio,localidade);                
            }
            
            return l1;            
        }

        /** 
         * @param l. The localidade to be deleted.
         * @return true if the localidade has been deleted or false if don´t.
         */
        public boolean deleteLoc(Localidade l){
            if(l.individuos.size() == 0){
                localidades.remove(l);
                return true;
            }
            
            else{                                
                return false;
            }                    
        }

        /**
         * @param l. Localidade type object to update
         * @param uf to update
         * @param municipio to update
         * @param localidade to update
         */
        public void updateLoc(Localidade l, String uf, String municipio, String localidade){
            l.setUf(uf);
            l.setMunicipio(municipio);
            l.setLocalidade(localidade);  
        }   
}
