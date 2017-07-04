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
public class Individuo{

    private Especie especie;
    private String tombo;
    private Coletor coletor;
    private Localidade localidade;        
    private String data;
    private String recipiente;
    private String obs;

    public Individuo(Especie especie, String tombo, Coletor coletor, Localidade localidade, String data, String recipiente, String obs){
        this.especie = especie;
        this.tombo = tombo;
        this.coletor = coletor;
        this.localidade = localidade;
        this.data = data;
        this.recipiente = recipiente;
        this.obs = obs;              
    }

    /**
     * @return the especie
     */
    public Especie getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }    
    
    /**
     * @return the tombo
     */
    public String getTombo() {
        return tombo;
    }

    /**
     * @param tombo the tombo to set
     */
    public void setTombo(String tombo) {
        this.tombo = tombo;
    }    
    
    
    /**
     * @return the coletor
     */
    public Coletor getColetor() {
        return coletor;
    }

    /**
     * @param coletor the coletor to set
     */
    public void setColetor(Coletor coletor) {
        this.coletor = coletor;
    }

    /**
     * @return the localidade
     */
    public Localidade getLocalidade() {
        return localidade;
    }

    /**
     * @param localidade the localidade to set
     */
    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the recipiente
     */
    public String getRecipiente() {
        return recipiente;
    }

    /**
     * @param recipiente the recipiente to set
     */
    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }    
        
        
    public String toString(){
            return this.getEspecie().toString() + this.coletor.toString() + this.localidade.toString() + this.data + this.recipiente + this.obs;
    }
		
}

