/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.logistique;
import java.sql.*;

/**
 *
 * @author L512
 */
public class Vehicule {
  
    private String vehiculeId;
    private beans.database.DBConnect dbConnect;
    private Statement stmt;
    private ResultSet rs;

    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }
 
    private String marque;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
 
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Date miseCirculation;

    public Date getMiseCirculation() {
        return miseCirculation;
    }

    public void setMiseCirculation(Date miseCirculation) {
        this.miseCirculation = miseCirculation;
    }
    private boolean patente;

    public boolean isPatente() {
        return patente;
    }

    public void setPatente(boolean patente) {
        this.patente = patente;
    }

    private Date assurance;

    public Date getAssurance() {
        return assurance;
    }

    public void setAssurance(Date assurance) {
        this.assurance = assurance;
    }

    private String immatriulation;

    public String getImmatriulation() {
        return immatriulation;
    }

    public void setImmatriulation(String immatriulation) {
        this.immatriulation = immatriulation;
    }

    private double poids;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private String poidsDisponible;

    public String getPoidsDisponible() {
        return poidsDisponible;
    }

    public void setPoidsDisponible(String poidsDisponible) {
        this.poidsDisponible = poidsDisponible;
    }

    private String volumeDisponible;

    public String getVolumeDisponible() {
        return volumeDisponible;
    }

    public void setVolumeDisponible(String volumeDisponible) {
        this.volumeDisponible = volumeDisponible;
    }

    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
