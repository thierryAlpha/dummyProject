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
public class Facture extends Panier{

    private String factureId;

    public String getFactureId() {
        return factureId;
    }

    public void setFactureId(String factureId) {
        this.factureId = factureId;
    }
 
    private double tva;

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    private double prixHT;

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    private double prixTTC;

    public double getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(double prixTTC) {
        this.prixTTC = prixTTC;
    }
   
}
