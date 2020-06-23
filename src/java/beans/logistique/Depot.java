/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.logistique;

/**
 *
 * @author L512
 */
import java.sql.*;
public class Depot extends beans.commerce.Panier{
    
    beans.database.DBConnect dbConnect;
    ResultSet rs;
  
    private String depotId;

    /**
     * Get the value of depotId
     *
     * @return the value of depotId
     */
    public String getDepotId() {
        return depotId;
    }

    /**
     * Set the value of depotId
     *
     * @param depotId new value of depotId
     */
    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }
 
    private double alerte;

    public double getAlerte() {
        return alerte;
    }

    public void setAlerte(double alerte) {
        this.alerte = alerte;
    }
 
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    private String postKilometre;

    public String getPostKilometre() {
        return postKilometre;
    }

    public void setPostKilometre(String postKilometre) {
        this.postKilometre = postKilometre;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private String volumeDisponible;

    public String getVolumeDisponible() {
        return volumeDisponible;
    }

    public void setVolumeDisponible(String volumeDisponible) {
        this.volumeDisponible = volumeDisponible;
    }

    private double poids;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    private double poidsDisponible;

    public double getPoidsDisponible() {
        return poidsDisponible;
    }

    public void setPoidsDisponible(double poidsDisponible) {
        this.poidsDisponible = poidsDisponible;
    }

    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
