/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.commerce;
import beans.database.DBConnect;
/**
 *
 * @author L512
 */
public class Marchandise extends Panier{
    
    private String marchandiseId;

    /**
     * Get the value of marchandiseId
     *
     * @return the value of marchandiseId
     */
    public String getMarchandiseId() {
        return marchandiseId;
    }

    /**
     * Set the value of marchandiseId
     *
     * @param marchandiseId new value of marchandiseId
     */
    public void setMarchandiseId(String marchandiseId) {
        this.marchandiseId = marchandiseId;
    }

    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private double quantite;

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    private String prix;

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    private String qualite;

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

}
