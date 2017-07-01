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
	
	public static GeneroFactory getInstance(){
		if(g==null){
			g= new GeneroFactory();			
		}
		return g;
	}	

	public void cadastrarGenero(Familia familia, String nome){
		//System.out.println("Nome da Família: ");
		
		Genero g1 = new Genero(familia, nome);
                generos.add(g1);
                
        }
	
	public ArrayList<Genero> findAll(){
		return generos;		
	}
        
        public Genero findGen(String nomeFam, String genero){
            Genero g1 = null;
            for(Genero g : generos){ 
                if(g.getNome().equals(genero)){
                    g1 = g;
                }
            }
            
            if(g1 == null){
                Familia familia = FamiliaFactory.getInstance().findFam(nomeFam);                        
                g1 = new Genero(familia, genero);
                generos.add(g1);                
            }
            
            return g1;            
        }        
}