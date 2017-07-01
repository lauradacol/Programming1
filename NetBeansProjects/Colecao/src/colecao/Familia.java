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
public class Familia{
	private String nome;
		
	public Familia(String nome){
		this.nome = nome;
	}
	
	public void setNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public String getNome(){
		return this.nome;		
	}
		
	public String toString(){
		return this.nome;
	}
		
}
