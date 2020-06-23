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
import beans.commerce.Marchandise;
import java.sql.*;

public class Reclamation extends Marchandise{

    private beans.database.DBConnect dbConnect;
    private ResultSet rs;
    private Statement stmt;
    private String query;
    private String reclamationId;

    /**
     * Get the value of reclamationId
     *
     * @return the value of reclamationId
     */
    public String getReclamationId() {
        return reclamationId;
    }

    /**
     * Set the value of reclamationId
     *
     * @param reclamationId new value of reclamationId
     */
    public void setReclamationId(String reclamationId) {
        this.reclamationId = reclamationId;
    }

    private String marchandiseId;

    public String getMarchandiseId() {
        return marchandiseId;
    }

    public void setMarchandiseId(String marchandiseId) {
        this.marchandiseId = marchandiseId;
    }
 
    private double perte;

    public double getPerte() {
        return perte;
    }

    public void setPerte(double perte) {
        this.perte = perte;
    }

    private double degat;

    public double getDegat() {
        return degat;
    }

    public void setDegat(double degat) {
        this.degat = degat;
    }

    private String observation;

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    
    
}
