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
public class Client {
 
    private beans.database.DBConnect dbConnect;
    private ResultSet rs;
    private Connection conn;
    private Statement stmt;
    private String clientId;

    /**
     * Get the value of clientId
     *
     * @return the value of clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Set the value of clientId
     *
     * @param clientId new value of clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
  
    private String matricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    private String telephonne;

    public String getTelephonne() {
        return telephonne;
    }

    public void setTelephonne(String telephonne) {
        this.telephonne = telephonne;
    }

    private String stringevaluation;

    public String getStringevaluation() {
        return stringevaluation;
    }

    public void setStringevaluation(String stringevaluation) {
        this.stringevaluation = stringevaluation;
    }

    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
