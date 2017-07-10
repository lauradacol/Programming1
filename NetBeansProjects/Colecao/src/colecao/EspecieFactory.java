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
	
        /**
         * @return e. If e is null, create e.
         */        
	public static EspecieFactory getInstance(){
		if(e==null){
			e= new EspecieFactory();			
		}
		return e;
	}	

        /** 
         * @param genero. The especie´s genero.
         * @param nome. The especie´s nome.
         * @return e1. The newly created especie type object.
         */
	public Especie cadastrarEspecie(Genero genero, String nome){
		//System.out.println("Nome da Família: ");
		
		Especie e1 = new Especie(genero, nome);
                especies.add(e1);
                genero.especies.add(e1);   
                
                return e1;
                
        }
	
        /** 
         * @return especies. The especie type objects on especies array. 
         */
	public ArrayList<Especie> findAll(){
		return especies;		
	}

        /** 
         * @param nomeFam. The famalia´s name of the especie to be found.
         * @param nomeGen. The genero´name of the especie to be found
         * @param especie. The especie´s name to be found. 
         * @return e1. The especie e1 if it exists or null if don´t.
         */
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
        
        /** 
         * @param e. The especie to be deleted.
         * @param g. The genero of the especie  to be deleted.
         * @return true if the especie has been deleted of false if don´t.
         */
        public boolean deleteEsp(Especie e, Genero g){
            if(e.individuos.size() == 0){
                especies.remove(e);
                g.especies.remove(e);
                return true;
            }
            
            else{                                
                return false;
            }                    
        }
        
        /** 
         * @param e Especie e to be updated
         * @param famNova to update
         * @param genNovo to update
         * @param espNova to update
         */
        public void updateEsp(Especie e, String famNova, String genNovo, String espNova){
            e.getGenero().getFamilia().setNome(famNova);
            e.getGenero().setNome(genNovo);
            e.setNome(espNova);
        } 
        
}
