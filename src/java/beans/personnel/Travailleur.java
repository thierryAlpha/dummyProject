/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.personnel;


import java.sql.*;
import beans.database.DBConnect.*;
import java.util.Date;
import java.util.*;
import java.util.logging.Logger;

/**
 *
 * @author L512
 */
public class Travailleur {
    
  private String  travailleurID;
  private String  nom;
  private String  prenom;
  private String  adresse;
  private String    date;
  private String  telephonne;
  private String  departement;
  private String  poste;
  private Date    debutContrat;
  private Date    finContrat;
  private double  salaire;
  private double  primeRation;
  private double  primeVoyage;
  private Date    dateNaissance;
  private boolean marie;
  private boolean veuf;
  private boolean celibataire;
  private int     enfant;
  private String eMail;
  private beans.database.DBConnect dbConnect;
  private Connection conn;
  private Statement stmt;
  private String table;
  private String query;
  private ResultSet rs;
  
 /** 
 *  get setter Methode
 */
  
  public void setTravailleurId(String _travailleurId){
      
      this.travailleurID = _travailleurId; 
  }
  public String getTravailleurId(){
      
      return travailleurID;  
  }
  /**                                                                        */  
    public void setNom(String _nom){
      
      this.nom = _nom; 
  }
  public String getNom(){
      
      return nom;  
  }
  /**                                                                        */  
    public void setPrenom(String _prenom){
      
      this.prenom = _prenom; 
  }
  public String getPrenom(){
      
      return prenom;  
  }
  /**                                                                        */  
  public void setAdresse(String _adresse){
      
      this.adresse = _adresse; 
  }
  public String getAdresse(){
      
      return adresse;  
  }
  /**                                                                        */   
  public void setDate(String _date){
      
      this.date = _date; 
  }
  public String getDate(){
      
      return date;  
  }
  /**                                                                        */   
  public void setTelephonne(String _telephonne){
      
      this.telephonne = _telephonne; 
  }
  public String getTelephonne(){
      
      return telephonne;  
  }
  /**                                                                        */   
  public void setDepartement(String _departement){
      
      this.departement = _departement; 
  }
  public String getDepartement(){
      
      return departement;  
  }
  /**                                                                        */   
  public void setPoste(String _poste){
      
      this.poste = _poste; 
  }
  public String getPoste(){
      
      return poste;  
  }
  /**                                                                        */   
  public void setDebutContrat(Date _debutContrat){
      
      this.debutContrat = _debutContrat;
  }
  public Date getDebutContrat(){
      
      return debutContrat;  
  }
  /**                                                                        */   
  public void setFinContrat(Date _finContrat){
      
      this.finContrat = _finContrat; 
  }
  public Date getFinContrat(){
      
      return finContrat;  
  }
  /**                                                                        */   
  public void setSalaire(double _salaire){
      
      this.salaire = _salaire; 
  }
  public double getSalaire(){
      
      return salaire;  
  }
  /**                                                                        */   
  public void setPrimeRation(double _primeRation){
      
      this.primeRation = _primeRation; 
  }
  public double getPrimeRation(){
      
      return primeRation;  
  }
  /**                                                                        */   
  public void setPrimeVoyage(double _primeVoyage){
      
      this.primeVoyage = _primeVoyage; 
  }
  public double getPrimeVoyage(){
      
      return primeVoyage;  
  }
  /**                                                                        */   
  public void setDateNaissance(Date _dateNaissance){
      
      this.dateNaissance = _dateNaissance; 
  }
  public Date getDateNaissance(){
      
      return dateNaissance;  
  }
  /**                                                                        */   
  public void setMarie(boolean _marie){
      
      this.marie = _marie; 
  }
  public boolean getMarie(){
      
      return marie;  
  }
  /**                                                                        */   
  public void setVeuf(boolean _veuf){
      
      this.veuf = _veuf; 
  }
  public boolean getveuf(){
      
      return veuf;  
  }
  /**                                                                        */   
  public void setCelibataire(boolean _celibataire){
      
      this.celibataire = _celibataire; 
  }
  public boolean getCelibataire(){
      
      return celibataire;  
  }
   /**                                                                        */   
  public void setEnfant(int _enfant){
      
      this.enfant = _enfant; 
  }
  public int getEnfant(){
      
      return enfant;  
  }  
   /**                                                                        */   
  public void setEmail(String _eMail){
      
      this.eMail = _eMail; 
  }
  public int getEmail(){
      
      return enfant;  
  }
  /***************************************************************************/  
  
  /*
  * creation d'un travailleur
  */ 
    public boolean createTravailleur(){
    
        Travailleur travailleur = new Travailleur();        
   
     beans.database.DBConnect dbConnect = new beans.database.DBConnect();
     conn  = dbConnect.getGetConnection();
     table = "travailleur";
     query = " insert into"
             +table+
             "(travailleurID,nom,prenom,adresse,date,telephonne,departement,poste,debutContrat,finContrat,salaire,primeRation,"
            +"primeVoyage,dateNaissance,marie,veuf,celibataire,enfant)"
            +"value("+travailleur.getTravailleurId()+","
                     +travailleur.nom+","
                     +travailleur.getPrenom()+","
                     +travailleur.getAdresse()+","
                     +travailleur.getDate()+","
                     +travailleur.getTelephonne()+","
                     +travailleur.getDepartement()+","
                     +travailleur.getPoste()+","
                     +travailleur.getDebutContrat()+","
                     +travailleur.getFinContrat()+","
                     +travailleur.getSalaire()+","
                     +travailleur.getPrimeRation()+","
                     +travailleur.getPrimeVoyage()+","
                     +travailleur.getDateNaissance()+","
                     +travailleur.getMarie()+","
                     +travailleur.getveuf()+","
                     +travailleur.getCelibataire()+","
                     +travailleur.getEnfant()+","
                     +travailleur.getEmail()+");";
      rs = dbConnect.queryTable(query, conn, table);
      return true;
    }  
 /*
  * recuperation d'un travailleur de la db
  */
    public Travailleur getTravailleur(String travailleurId){
    
     Travailleur travailleur = new Travailleur();
     
     beans.database.DBConnect dbConnect = new beans.database.DBConnect();
     conn  = dbConnect.getGetConnection();
     table = "travailleur";
     query = " select * fromn "
               +table+" where "
               +table+"Id = "
               +travailleurId+";";
     
     rs = dbConnect.queryTable(query, conn, table);
 /*
  * transfert les donnees dans un classe
  */
     try{     
         while(rs.next()){
             
             travailleur.setTravailleurId(rs.getNString("travailleurId"));
             travailleur.setNom(rs.getNString("nom"));
             travailleur.setPrenom(rs.getNString("prenom"));
             travailleur.setAdresse(rs.getNString("adresse"));
             travailleur.setDate(rs.getDate("date"));
             travailleur.setTelephonne(rs.getNString("telphonne"));
             travailleur.setDepartement(rs.getNString("departement"));        
             travailleur.setPoste(rs.getNString("poste"));        
             travailleur.setDebutContrat(rs.getDate("debutContrat"));        
             travailleur.setFinContrat(rs.getDate("finContrat")); 
             travailleur.setSalaire(rs.getDouble("salaire"));
             travailleur.setPrimeRation(rs.getDouble("primeRation"));
             travailleur.setPrimeVoyage(rs.getDouble("primeVoyage"));
             travailleur.setDateNaissance(rs.getDate("dateNaissance"));   
             travailleur.setMarie(rs.getBoolean("marie")); 
             travailleur.setCelibataire(rs.getBoolean("celibataire")); 
             travailleur.setEnfant(rs.getInt("enfant"));
             travailleur.setEmail(rs.getString("eMail"));
         }
     }
     catch(SQLException e){}   
     
     
     return travailleur;
    }
 /*
  * suppression d'un travailleur de la db
  */
    public boolean deleteTravailleur(String travailleurId){
    
       
     beans.database.DBConnect dbConnect = new beans.database.DBConnect();
     conn  = dbConnect.getGetConnection();
     table = "travailleur";
     query = " delete * fromn "
               +table+" where "
               +table+"Id = "
               +travailleurId+";";
     
     rs = dbConnect.queryTable(query, conn, table);
     
     return true;
     
    } 
 /*
  * update d'un travailleur de la db
  */
    public boolean updateTravailleur(String travailleurId,
                                     HashMap<String,Object> map){
    
       
     beans.database.DBConnect dbConnect = new beans.database.DBConnect();
     conn  = dbConnect.getGetConnection();
     table = "travailleur";
     String query =" update travaleur (";
     String queryKey = "";
     String queryValue = "";
     Set set = map.entrySet();
     Iterator iterator = set.iterator();
               
         try{
         
           while(iterator.hasNext()){
           
               Map.Entry entry = (Map.Entry) iterator.next();
                 queryKey = queryKey   +entry.getValue()+",";
               queryValue = queryValue +entry.getValue()+",";} 
           
            query = query
                    +queryKey
                    +") values("
                    +queryValue
                    +") where travailleurId = "
                    +travailleurId+");";
           
         }catch(Exception e){}
     
     rs = dbConnect.queryTable(query, conn, table);
     
     return true;
     
    } 
    public static void main(String args[]){
        
        beans.database.DBConnect dbConnect = new beans.database.DBConnect();
        Connection conn = dbConnect.getGetConnection();
                    
    }
}
