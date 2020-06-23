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
public class AgentLocal {
    beans.database.DBConnect dbConnect;
    Connection conn;
    ResultSet rs;
    private String agentLocalId;

    /**
     * Get the value of agentLocalId
     *
     * @return the value of agentLocalId
     */
    public String getAgentLocalId() {
        return agentLocalId;
    }

    /**
     * Set the value of agentLocalId
     *
     * @param agentLocalId new value of agentLocalId
     */
    public void setAgentLocalId(String agentLocalId) {
        this.agentLocalId = agentLocalId;
    }
    
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String prenom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    private String telephonne1;

    public String getTelephonne1() {
        return telephonne1;
    }

    public void setTelephonne1(String telephonne1) {
        this.telephonne1 = telephonne1;
    }

    private String telephonne2;

    public String getTelephonne2() {
        return telephonne2;
    }

    public void setTelephonne2(String telephonne2) {
        this.telephonne2 = telephonne2;
    }

    private String localite;

    /**
     * Get the value of localite
     *
     * @return the value of localite
     */
    public String getLocalite() {
        return localite;
    }

    /**
     * Set the value of localite
     *
     * @param localite new value of localite
     */
    public void setLocalite(String localite) {
        this.localite = localite;
    }

    private String postKilometre;

    public String getPostKilometre() {
        return postKilometre;
    }

    public void setPostKilometre(String postKilometre) {
        this.postKilometre = postKilometre;
    }

    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
