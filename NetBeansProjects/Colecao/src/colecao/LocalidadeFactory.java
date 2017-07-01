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
	
	public static LocalidadeFactory getInstance(){
		if(l==null){
			l= new LocalidadeFactory();			
		}
		return l;
	}	

	public void cadastrarLocalidade(String uf, String municipio, String localidade){
		//System.out.println("Nome da Família: ");
		
		Localidade l1 = new Localidade(uf,municipio,localidade);
                localidades.add(l1);
                
        }
	
	public ArrayList<Localidade> findAll(){
		return localidades;		
        }

        public Localidade findLoc(String uf, String municipio, String localidade){
            Localidade l1 = null;
            for(Localidade l : localidades){ 
                if(l.getLocalidade().equals(localidade)){
                    l1 = l;
                }
            }
            
            if(l1 == null){
                l1 = new Localidade(uf,municipio,localidade);
               localidades.add(l1);                
            }
            
            return l1;            
        }   
       
}
