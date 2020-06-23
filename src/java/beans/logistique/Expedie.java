/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.logistique;
import java.util.TimeZone;
import java.sql.*;
import java.util.*;
/**
 *
 * @author L512
 */
public class Expedie {
  
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

    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private java.util.Date dateDepart;

    public java.util.Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(java.util.Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    private TimeZone heureDepart;

    public TimeZone getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(TimeZone heureDepart) {
        this.heureDepart = heureDepart;
    }
  
    private java.util.Date dateArrive;

    public java.util.Date getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(java.util.Date dateArrive) {
        this.dateArrive = dateArrive;
    }

    private TimeZone heureArrive;

    public TimeZone getHeureArrive() {
        return heureArrive;
    }

    public void setHeureArrive(TimeZone heureArrive) {
        this.heureArrive = heureArrive;
    }

    private boolean reserve;

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    private boolean confirme;

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    private boolean charge;

    public boolean isCharge() {
        return charge;
    }

    public void setCharge(boolean charge) {
        this.charge = charge;
    }

    private double poidsMarchandise;

    public double getPoidsMarchandise() {
        return poidsMarchandise;
    }

    public void setPoidsMarchandise(double poidsMarchandise) {
        this.poidsMarchandise = poidsMarchandise;
    }

    private double volumeMarchandise;

    public double getVolumeMarchandise() {
        return volumeMarchandise;
    }

    public void setVolumeMarchandise(double volumeMarchandise) {
        this.volumeMarchandise = volumeMarchandise;
    }

    private double poidsDispoDepot;

    public double getPoidsDispoDepot() {
        return poidsDispoDepot;
    }

    public void setPoidsDispoDepot(double poidsDispoDepot) {
        this.poidsDispoDepot = poidsDispoDepot;
    }

    private double volumeDispoDepot;

    public double getVolumeDispoDepot() {
        return volumeDispoDepot;
    }

    public void setVolumeDispoDepot(double volumeDispoDepot) {
        this.volumeDispoDepot = volumeDispoDepot;
    }

    private double poidsDispoVehicule;

    public double getPoidsDispoVehicule() {
        return poidsDispoVehicule;
    }

    public void setPoidsDispoVehicule(double poidsDispoVehicule) {
        this.poidsDispoVehicule = poidsDispoVehicule;
    }

    private Double volumeDispoVehicule;

    public Double getVolumeDispoVehicule() {
        return volumeDispoVehicule;
    }

    public void setVolumeDispoVehicule(Double volumeDispoVehicule) {
        this.volumeDispoVehicule = volumeDispoVehicule;
    }

    private LinkedList listMarchandiseExpedie;

    public LinkedList getListMarchandiseExpedie() {
        return listMarchandiseExpedie;
    }
    private int alerte = 0;

    public int getAlerte() {
        return alerte;
    }

    public void setAlerte(int alerte) {
        this.alerte = alerte;
    }


    public void setListMarchandiseExpedie(LinkedList listMarchandiseExpedie) {
        this.listMarchandiseExpedie = listMarchandiseExpedie;
    }

}
