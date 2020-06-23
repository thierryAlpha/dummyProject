/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.bibliotheque;

import java.util.*;
import java.lang.*;
/**.
 *
 * @author L512
 */

public class Biblio {
 
    /*
     * recherche un element de type String dans une list donnee
     */
    public boolean searchString(String element, LinkedList list) {
        
        Iterator listIterator = list.iterator();
        
        try{
            
            while(listIterator.hasNext()){
                
                if(element == (String)listIterator.next()){
                    
                    return true;
                }
           }
            return false;
                
        }catch(Exception e){
        }
        return true;
    }
    /*
     * recherche un element de type int dans une list donnee
     */
    public boolean searchInt(int element, LinkedList list) {
        
        Iterator listIterator = list.iterator();
        try{
            
            while(listIterator.hasNext()){
                
                if(element == (int)listIterator.next()){
                    
                    return true;
                }
           }
            return false;
                
        }catch(Exception e){
        }
        return true;
    }
    /*
     * recherche un element de type float dans une list donnee
     */
    public boolean searchFloat(float element, LinkedList list) {
        
        Iterator listIterator = list.iterator();
        try{
            
            while(listIterator.hasNext()){
                
                if(element == (float)listIterator.next()){
                    
                    return true;
                }
           }
            return false;
                
        }catch(Exception e){
        }
        return true;
    }
    /*
     * recherche un element de type object dans une list donnee
     */
    public boolean searchOject(Object element, LinkedList list) {
        
        Iterator listIterator = list.iterator();
        try{
            
            while(listIterator.hasNext()){
                
                if(element == (Object)listIterator.next()){
                    
                    return true;
                }
           }
            return false;
                
        }catch(Exception e){
        }
        return true;
    }
    
}
