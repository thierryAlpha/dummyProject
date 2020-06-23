/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.personnel;

/**
 *
 * @author L512
 */
import java.util.*;
import java.sql.*;
import java.util.Date.*;

public class Trajet {

    private String trajetId;

    /**
     * Get the value of trajetId
     *
     * @return the value of trajetId
     */
    public String getTrajetId() {
        return trajetId;
    }

    /**
     * Set the value of trajetId
     *
     * @param trajetId new value of trajetId
     */
    public void setTrajetId(String trajetId) {
        this.trajetId = trajetId;
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

    private java.util.Date date;

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public java.util.Date getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    private Timestamp heure;

    public Timestamp getHeure() {
        return heure;
    }

    public void setHeure(Timestamp heure) {
        this.heure = heure;
    }
    
}
