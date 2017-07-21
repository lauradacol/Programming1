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

public class Familia{
	private String nome;
        ArrayList<Genero> generos;
        
	/**
        *@param nome. Familia name
        */	
	public Familia(String nome){
		this.nome = nome;
                generos = new ArrayList<Genero>();
	}
	
        /**
         * @param nomeNovo the nomeNovo to set
         */        
        public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
        /**
         * @return the nome
         */
	public String getNome(){
		return this.nome;		
	}
	
        /**
         * @return a string representation of the object.
         */
	public String toString(){
		return this.nome;
	}
		
}
