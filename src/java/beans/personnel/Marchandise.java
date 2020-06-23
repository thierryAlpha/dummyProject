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
public class Marchandise {
 
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
    
    private double prix;

    /**
     * Get the value of prix
     *
     * @return the value of prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Set the value of prix
     *
     * @param prix new value of prix
     */
    public void setPrix(double prix) {
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
