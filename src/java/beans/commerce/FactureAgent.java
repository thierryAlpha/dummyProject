/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.commerce;

/**
 *
 * @author L512
 */
public class FactureAgent {
  
    private String factureAgentId;

    /**
     * Get the value of factureAgentId
     *
     * @return the value of factureAgentId
     */
    public String getFactureAgentId() {
        return factureAgentId;
    }

    /**
     * Set the value of factureAgentId
     *
     * @param factureAgentId new value of factureAgentId
     */
    public void setFactureAgentId(String factureAgentId) {
        this.factureAgentId = factureAgentId;
    }

    private String agentId;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String AgentId) {
        this.agentId = AgentId;
    }

    private String chefMissionId;

    public String getChefMissionId() {
        return chefMissionId;
    }

    public void setChefMissionId(String chefMissionId) {
        this.chefMissionId = chefMissionId;
    }

    private double prixHT;

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    private double rabais;

    public double getRabais() {
        return rabais;
    }

    public void setRabais(double rabais) {
        this.rabais = rabais;
    }

    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double reglement;

    public double getReglement() {
        return reglement;
    }

    public void setReglement(double reglement) {
        this.reglement = reglement;
    }

    private String restPaye;

    public String getRestPaye() {
        return restPaye;
    }

    public void setRestPaye(String restPaye) {
        this.restPaye = restPaye;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private double poids;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }  
}
