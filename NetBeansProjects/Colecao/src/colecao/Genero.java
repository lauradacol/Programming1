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
		
	public Genero(Familia familia, String nome){
		this.familia = familia;
                this.nome = nome;
                especies = new ArrayList<Especie>();                
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
        public void setNome(Familia familiaNova){
            this.familia = familiaNova;
	}
        
	public String getNome(){
		return this.nome;		
	}

	public String getFamilia(){
		return this.familia.toString();		
	}
        
	public String toString(){
		return this.familia.toString() + this.nome;
	}
		
}
