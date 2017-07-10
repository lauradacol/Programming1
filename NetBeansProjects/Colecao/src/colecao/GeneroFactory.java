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

public class GeneroFactory {
	
	static GeneroFactory g;
	ArrayList<Genero> generos;
	
	private GeneroFactory(){
		generos = new ArrayList<Genero>();
	}
	
        /**
         * @return g. If g is null, create g.
         */
	public static GeneroFactory getInstance(){
		if(g==null){
			g= new GeneroFactory();			
		}
		return g;
	}	

        /** 
         * @param familia the genero´s familia.
         * @param nome the genero´s name.
         * @return The newly created genero type object.
         */
	public Genero cadastrarGenero(Familia familia, String nome){
		//System.out.println("Nome da Família: ");
		
		Genero g1 = new Genero(familia, nome);
                generos.add(g1);
                familia.generos.add(g1);  
                
                return g1;
                
        }

        /**
         * @return generos the genero type objects on generos array.
         */
	public ArrayList<Genero> findAll(){
		return generos;		
	}
        
        /**
         * @param nomeFam The familia´s name of the genero to be found
         * @param genero The genero´s name to be found
         * @return g1. The genero g1 if it exists or null if don´t.
         */
        public Genero findGen(String nomeFam, String genero){
            Genero g1 = null;
            for(Genero g : generos){ 
                if(g.getNome().equals(genero)){
                    g1 = g;
                }
            }
            
            if(g1 == null){
                Familia familia = FamiliaFactory.getInstance().findFam(nomeFam);                        
                g1 = cadastrarGenero(familia, genero);               
            }
            
            return g1;            
        }

        /** 
         * @param g The genero to be deleted.
         * @param f The familia of the genero to be deleted
         * @return true if the genero has been deleted of false if don´t
         */
        public boolean deleteGen(Genero g, Familia f){
            if(g.especies.size() == 0){
                generos.remove(g);
                f.generos.remove(g);
                return true;
            }
            
            else{                                
                return false;
            }                    
        }
        
        /** 
         * @param g genero to be updated
         * @param famNova to update
         * @param genNovo to update
         */
        public void updateGen(Genero g, String famNova, String genNovo){
            g.getFamilia().setNome(famNova);
            g.setNome(genNovo);
        }        

        
}