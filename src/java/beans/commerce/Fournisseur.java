/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.commerce;

import java.sql.*;
/**
 *
 * @author L512
 */
public class Fournisseur {

    beans.database.DBConnect dbConnect;
    Connection conn;
    ResultSet rs;
    private String fournisseurId;

    /**
     * Get the value of fournisseurId
     *
     * @return the value of fournisseurId
     */
    public String getFournisseurId() {
        return fournisseurId;
    }

    /**
     * Set the value of fournisseurId
     *
     * @param fournisseurId new value of fournisseurId
     */
    public void setFournisseurId(String fournisseurId) {
        this.fournisseurId = fournisseurId;
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
    
    private String query;

    /**
     * Get the value of query
     *
     * @return the value of query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Set the value of query
     *
     * @param query new value of query
     */
    public void setQuery(String query) {
        this.query = query;
    }

}
