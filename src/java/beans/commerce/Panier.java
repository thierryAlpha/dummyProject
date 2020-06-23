/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.commerce;

import beans.commerce.Marchandise;
import java.util.*;
/**
 *
 * @author L512
 */
public class Panier {
  
    Marchandise element;
    LinkedList panierList;
    private String panierId;

    public String getPanierId() {
        return panierId;
    }

    public void setPanierId(String panierId) {
        this.panierId = panierId;
    }
 
    private LinkedList collonne;

    /**
     * Get the value of collonne
     *
     * @return the value of collonne
     */
    public LinkedList getCollonne() {
        return collonne;
    }

    /**
     * Set the value of collonne
     *
     * @param collonne new value of collonne
     */
    public void setCollonne(LinkedList collonne) {
        this.collonne = collonne;
    }
    private LinkedList ligne;

    public LinkedList getLigne() {
        return ligne;
    }

    public void setLigne(LinkedList ligne) {
        this.ligne = ligne;
    }
    Iterator collonneIterator = collonne.iterator();
    Iterator ligneIterator = ligne.iterator();
 
}
