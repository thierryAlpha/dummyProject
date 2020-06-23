/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.commerce;
import java.util.*;

/**
 *
 * @author L512
 */
public class BonCommande extends Panier{
  
    private String bonCommandeId;

    public String getBonCommandeId() {
        return bonCommandeId;
    }

    public void setBonCommandeId(String bonCommandeId) {
        this.bonCommandeId = bonCommandeId;
    }

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
  
    private Date validite;

    public Date getValidite() {
        return validite;
    }

    public void setValidite(Date validite) {
        this.validite = validite;
    }

    private double prixHT;

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    private boolean genere;

    public boolean isGenere() {
        return genere;
    }

    public void setGenere(boolean genere) {
        this.genere = genere;
    }

    private boolean enterine;

    public boolean isEnterine() {
        return enterine;
    }

    public void setEnterine(boolean enterine) {
        this.enterine = enterine;
    }

}
