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

import java.util.ArrayList;

public class Localidade {
    private String uf;
    private String municipio;
    private String localidade;
    ArrayList<Individuo> individuos;    
    
    /** 
     * @param uf. The uf´s name.
     * @param municipio. The municipio´s name.
     * @param localidade . The localidade´s name.
     */
    public Localidade(String uf, String municipio, String localidade){
       this.uf = uf;
       this.municipio = municipio;
       this.localidade = localidade;                
       individuos = new ArrayList<Individuo>(); 
    }
    
    /** 
     * @return the uf.
     */
    public String getUf() {
        return this.uf;
    }

    /** 
     * @param uf to set.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /** 
     * @return the municipio.
     */
    public String getMunicipio() {
        return this.municipio;
    }

    /** 
     * @param municipio to set.
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /** 
     * @return the localidade.
     */    
    public String getLocalidade() {
        return this.localidade;
    }

    /** 
     * @param localidade to set.
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    /** 
     * @return a string representation of the object.
     */
    public String toString(){
	return this.uf + this.municipio + this.localidade;
    } 
    
}
