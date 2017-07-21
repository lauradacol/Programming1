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

public class Genero{
	private Familia familia;
        private String nome;
        ArrayList<Especie> especies;
	
        /**
         * @param familia The genero´s familia.
         * @param nome The genero´s name.
         */         
	public Genero(Familia familia, String nome){
		this.familia = familia;
                this.nome = nome;
                especies = new ArrayList<Especie>();                
	}
	
        /**
         * @param nomeNovo the nomeNovo to set.
         */
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}

        /**
         * @param nomeNovo the nomeNovo to set.
         */
        public void setNome(Familia familiaNova){
            this.familia = familiaNova;
	}
        
        /** 
         * @return the nome. 
         */
	public String getNome(){
		return this.nome;		
	}

        /**
         * @return the familia.
         */
	public Familia getFamilia(){
		return this.familia;		
	}
        
        /**
         * @return a string representation of the object.
         */
	public String toString(){
		return this.familia.toString() + this.nome;
	}
		
}
