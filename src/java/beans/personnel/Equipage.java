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

import beans.database.DBConnect;
import java.sql.*;
public class Equipage {
    
    private DBConnect dbConnect;
    private ResultSet rs;
    
    private String equipageId;

    /**
     * Get the value of equipageId
     *
     * @return the value of equipageId
     */
    public String getEquipageId() {
        return equipageId;
    }

    /**
     * Set the value of equipageId
     *
     * @param equipageId new value of equipageId
     */
    public void setEquipageId(String equipageId) {
        this.equipageId = equipageId;
    }

    private String vehiculeId;

    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    private String nomEquipage;

    public String getNomEquipage() {
        return nomEquipage;
    }

    public void setNomEquipage(String nomEquipage) {
        this.nomEquipage = nomEquipage;
    }
    
    private String chefMission;

    public String getChefMission() {
        return chefMission;
    }

    public void setChefMission(String chefMission) {
        this.chefMission = chefMission;
    }
    
    private String chauffeurId;

    public String getChauffeurId() {
        return chauffeurId;
    }

    public void setChauffeurId(String chauffeurId) {
        this.chauffeurId = chauffeurId;
    }
    
    private String aideChauffeurId;

    public String getAideChauffeurId() {
        return aideChauffeurId;
    }

    public void setAideChauffeurId(String aideChauffeurId) {
        this.aideChauffeurId = aideChauffeurId;
    }

    private String chaffeurId;

    public String getChaffeurId() {
        return chaffeurId;
    }

    public void setChaffeurId(String chaffeurId) {
        this.chaffeurId = chaffeurId;
    }
    
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
 
}
