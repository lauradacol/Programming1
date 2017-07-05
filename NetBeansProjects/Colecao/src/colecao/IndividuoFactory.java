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

public class IndividuoFactory {
	
	static IndividuoFactory i;
	ArrayList<Individuo> individuos;
	
	private IndividuoFactory(){
		individuos = new ArrayList<Individuo>();
	}
	
	public static IndividuoFactory getInstance(){
		if(i==null){
			i = new IndividuoFactory();			
		}
		return i;
	}	

	public Individuo cadastrarIndividuo(Especie especie, Coletor coletor, Localidade localidade, String data, String recipiente, String obs){
		//System.out.println("Nome da Família: ");
		
		Individuo i1 = new Individuo(especie, coletor, localidade, data, recipiente, obs);
                individuos.add(i1);
                especie.individuos.add(i1);
                localidade.individuos.add(i1);
                coletor.individuos.add(i1);
                
                return i1;
                
        }
	
	public ArrayList<Individuo> findAll(){
		return individuos;		
	}
        
        public Individuo findInd(int tombo){
            Individuo i1 = null;
            
            for(Individuo i : individuos){
                //if(i.getTombo().equals(tombo)){
                if(i.getTombo() == tombo){ 
                    i1 = i;
                }
            
            }
            
            return i1;
        }
        
        public void deleteInd(Individuo i, Localidade l, Coletor c, Especie e){
            individuos.remove(i);
            l.individuos.remove(i);
            c.individuos.remove(i);
            e.individuos.remove(i);
                                        
        }
        
        
}

