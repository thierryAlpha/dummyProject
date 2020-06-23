/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
/**
 *
 * @author L512
 */
public class DBConnect {
    
    Connection conn;
    Statement stmt;
    ResultSet rs;
    //String host = "jdbc:derby://localhost:1527/ngoTransport";
    String host = "localhost:3306/caisse";
    String uName = "root";
    String uPass = "admin";
    LinkedHashMap<String,Object> map;
    
    public Connection getConnection;

    public Connection getGetConnection() {
        
        try{
          
          
          //Driver driver = DriverManager.getDriver("org.apache.derby.jdbc.EmbeddedDriver");
          conn = DriverManager.getConnection(host,uName,uPass);
        }catch(SQLException e){
          
          System.out.println(e.getMessage());
        }   
        return conn;
    }
    
    public boolean deleteLine(String table,String lineId,Connection conn){
         
          String query = "delete * from "+table
                         +" where"
                         + "line"
                         + "Id ="
                         + lineId+");";
        try{
              
              stmt = conn.createStatement();
              rs   = stmt.executeQuery(query);
              conn.close();
              System.out.println("ligne :"+ lineId+" suprime");
              return true;              
        }catch(SQLException e){
        
           System.out.println(e.getMessage());
           return false;
        }      
          
          
    }   
    
    public ResultSet readLine(String table,String lineId,Connection conn){
         
          String query = "select * from "+table
                         +" where"
                         + "line"
                         + "Id ="
                         + lineId+");";
        try{
              
              stmt = conn.createStatement();
              rs   = stmt.executeQuery(query);
              conn.close();             
        }catch(SQLException e){
        
           System.out.println(e.getMessage());
        }      
       return rs;  
          
    } 

    public ResultSet queryTable(String query,Connection conn,String table){
         
        try{
              
              stmt = conn.createStatement();
              rs   = stmt.executeQuery(query);
              conn.close();             
        }catch(SQLException e){
        
           System.out.println(e.getMessage());
        }      
        return rs;  
          
    }
    public boolean updateValue(String table,HashMap<String,Object> map){
         
          String query = "update"+table+" Set ";
          Set set = map.entrySet();
          Iterator iter = set.iterator();
          Map.Entry mentry; 
         
        try{              
              while(iter.hasNext()){
              
              mentry = (Map.Entry) iter.next();
               query = query+","
                      +mentry.getKey()
                      +" = "
                      +mentry.getValue();
          } 
        query = query + ");";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);
        return true; 
        }catch(Exception e){
        
           System.out.println(e.getMessage());
           return false;
        }    
          
    }
    
    public static void main(String args[]){
        
        beans.database.DBConnect dbConnect = new beans.database.DBConnect();
        Connection conn = dbConnect.getGetConnection();                    
    }
    
}
