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
public class Especie{
	private Genero genero;
        private String nome;
		
	public Especie(Genero genero, String nome){
		this.genero = genero;
                this.nome = nome;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
        public void setGenero(Genero generoNovo){
            this.genero = generoNovo;
	}
        
	public String getNome(){
		return this.nome;		
	}

	public Genero getGenero(){
		return this.genero;		
	}      
        
	public String toString(){
		return this.genero.toString() + this.nome;
	}
		
}
