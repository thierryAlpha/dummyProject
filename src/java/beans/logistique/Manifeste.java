/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.logistique;

import java.util.*;

/**
 *
 * @author L512
 */
public class Manifeste {
   
    private String manifesteId;

    /**
     * Get the value of manifesteId
     *
     * @return the value of manifesteId
     */
    public String getManifesteId() {
        return manifesteId;
    }

    /**
     * Set the value of manifesteId
     *
     * @param manifesteId new value of manifesteId
     */
    public void setManifesteId(String manifesteId) {
        this.manifesteId = manifesteId;
    }
 
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String depotId;

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    private String depart;

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String bonCommandeId;

    public String getBonCommandeId() {
        return bonCommandeId;
    }

    public void setBonCommandeId(String bonCommandeId) {
        this.bonCommandeId = bonCommandeId;
    }

    private String trajetId;

    public String getTrajetId() {
        return trajetId;
    }

    public void setTrajetId(String trajetId) {
        this.trajetId = trajetId;
    }

}
