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

public class Especie{
	private Genero genero;
        private String nome;
        ArrayList<Individuo> individuos;

        /** 
         * @param genero. The especie´s genero.
         * @param nome The especie´s nome/
         */        
	public Especie(Genero genero, String nome){
		this.genero = genero;
                this.nome = nome;
                individuos = new ArrayList<Individuo>();   
	}

        /** 
         * @param nomeNovo to set.
         */
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}

        /** 
         * @param generoNovo to set.
         */        
        public void setGenero(Genero generoNovo){
            this.genero = generoNovo;
	}
        
        /** 
         * @return the nome.
         */
	public String getNome(){
		return this.nome;		
	}

         /** 
         * @return the genero.
         */       
	public Genero getGenero(){
		return this.genero;		
	}      

        /**
         * @return a string representation of the object.
         */        
	public String toString(){
		return this.genero.toString() + this.nome;
	}
		
}
