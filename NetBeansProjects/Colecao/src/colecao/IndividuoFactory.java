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

	public void cadastrarIndividuo(Especie especie, String tombo, Coletor coletor, Localidade localidade, String data, String recipiente, String obs){
		//System.out.println("Nome da Família: ");
		
		Individuo i1 = new Individuo(especie, tombo, coletor, localidade, data, recipiente, obs);
                individuos.add(i1);
                
        }
	
	public ArrayList<Individuo> findAll(){
		return individuos;		
	}
}

