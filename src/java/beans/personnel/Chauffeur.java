/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.personnel;

import java.sql.*;

/**
 *
 * @author L512
 */

public class Chauffeur extends Travailleur{
    
private Connection conn;
private Statement  stmt;
private ResultSet    rs;
private String    query;
   
    private String chauffeurID;

    public String getChauffeurID() {
        return chauffeurID;
    }

    public void setChauffeurID(String chauffeurID) {
        this.chauffeurID = chauffeurID;
    }
 
    private String typePermis;

    /**
     * Get the value of typePermis
     *
     * @return the value of typePermis
     */
    public String getTypePermis() {
        return typePermis;
    }

    /**
     * Set the value of typePermis
     *
     * @param typePermis new value of typePermis
     */
    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }

    private int experience;

    /**
     * Get the value of experience
     *
     * @return the value of experience
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Set the value of experience
     *
     * @param experience new value of experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    private int axxident;

    /**
     * Get the value of axxident
     *
     * @return the value of axxident
     */
    public int getAxxident() {
        return axxident;
    }

    /**
     * Set the value of axxident
     *
     * @param axxident new value of axxident
     */
    public void setAxxident(int axxident) {
        this.axxident = axxident;
    }

    

}
