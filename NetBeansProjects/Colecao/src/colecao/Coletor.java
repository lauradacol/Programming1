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
    
    /** 
     * @param nome. The coletor´s nome.
     * @param telefone. The coletor`s telefone.
     * @param email. The coletor`s email.
     */ 
    public Coletor(String nome, String telefone, String email){
       this.nome = nome;
       this.telefone = telefone;
       this.email = email;
       individuos = new ArrayList<Individuo>();        
    }
    
    /** 
     * @return the nome. 
     */
    public String getNome() {
        return this.nome;
    }

    /** 
     * @param nome to set.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** 
     * @return the telefone. 
     */
    public String getTelefone() {
        return this.telefone;
    }
   
    /** 
     * @param telefone to set.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /** 
     * @return the email. 
     */
    public String getEmail() {
        return this.email;
    }

    /** 
     * @param email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /** 
     * @return a string representation of the object.
     */
    public String toString(){
	return this.nome + this.telefone + this.email;
    } 
    
}