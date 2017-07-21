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
	
        /** 
         * @return i. If i is null, create i.
         */
	public static IndividuoFactory getInstance(){
		if(i==null){
			i = new IndividuoFactory();			
		}
		return i;
	}	

        /** 
         * @param especie
         * @param coletor
         * @param localidade
         * @param data 
         * @param recipiente. 
         * @param obs.
         * @return i1. The newly created individuo type object.
         */
	public Individuo cadastrarIndividuo(Especie especie, Coletor coletor, Localidade localidade, String data, String recipiente, String obs){
		//System.out.println("Nome da Família: ");
		
		Individuo i1 = new Individuo(especie, coletor, localidade, data, recipiente, obs);
                individuos.add(i1);
                especie.individuos.add(i1);
                localidade.individuos.add(i1);
                coletor.individuos.add(i1);
                
                return i1;
                
        }
	
        /** 
         * @return individuos. Individuos type objects of array individuos.
         */
	public ArrayList<Individuo> findAll(){
		return individuos;		
	}
        
        /** 
         * @param tombo
         * @return i1. Individuo i1 if it existis and null if don`t
         */
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
        
        /** 
         * @param i. Individuo to be deleted
         * @param l. Localidade of the individuo to be deleted
         * @param c. Coletor of the individuo to be deleted
         * @param e. Especie of the individuo to be deleted
         */
        public void deleteInd(Individuo i, Localidade l, Coletor c, Especie e){
            individuos.remove(i);
            l.individuos.remove(i);
            c.individuos.remove(i);
            e.individuos.remove(i);
                                        
        }
                
        /** 
         * @param i. Individuo to be updated
         * @param fam. New familia name
         * @param gen New genero name
         * @param esp New Especie name
         * @param uf New uf name
         * @param mun New municipio name
         * @param loc New localidade name
         * @param col New coletor name
         * @param tel New coletor telefone
         * @param email New coletor email
         * @param dt New data
         * @param rec New recipiente
         * @param obs New observacao
         */
        public void updateInd(Individuo i, String fam, String gen, String esp, String uf, String mun, String loc, String col, String tel, String email, String dt, String rec, String obs){
            i.getEspecie().getGenero().getFamilia().setNome(fam);
            i.getEspecie().getGenero().setNome(gen);
            i.getEspecie().setNome(esp);
            i.getLocalidade().setUf(uf);
            i.getLocalidade().setMunicipio(mun);
            i.getLocalidade().setLocalidade(loc);  
            i.getColetor().setNome(col);
            i.getColetor().setTelefone(tel);
            i.getColetor().setEmail(email);
            i.setData(dt);
            i.setRecipiente(rec);
            i.setObs(obs);
        } 
        
}

