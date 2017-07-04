/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Coletor {
    private String nome;
    private String telefone;
    private String email;
    ArrayList<Individuo> individuos; 
    
    public Coletor(String nome, String telefone, String email){
       this.nome = nome;
       this.telefone = telefone;
       this.email = email;
       individuos = new ArrayList<Individuo>();        
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setUf(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }
   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setLocalidade(String email) {
        this.email = email;
    }
    
    public String toString(){
	return this.nome + this.telefone + this.email;
    } 
    
}