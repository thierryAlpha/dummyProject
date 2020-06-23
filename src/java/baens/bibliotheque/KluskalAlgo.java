/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.bibliotheque;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author L512
 */
public class KluskalAlgo {
   
   public  ArrayList<Edge> allEdges;
   public  static ArrayList<Edge> allEdgesDummy;
   /**
     * Détermine l'arbre couvrant de poids minimum (ARPM) à partir d'un graphe connexe non-orienté et pondéré.
     * <p>
     * Utilise l'algorithme de Kruskal
     * @see https://fr.wikipedia.org/wiki/Algorithme_de_Kruskal
     *
     * @param vertices graphe constitué d'un ensemble de points dans un plan à 2 dimensions.
     * @return arrêtes de l'arbre couvrant de poids minimum dans ce graphe.
     */

   static List<Edge> compute(List<Vertex> vertices){
    /*
     * calcule les arretes du graphe et leur poids respectif
     */
        ArrayList<Edge> allEdges = new ArrayList<>();
   
        for(int i = 0; i < vertices.size();i++){
            for(int j = i+1; j < vertices.size();j++){
          
              allEdges.add(new Edge(vertices.get(i),
                                    vertices.get(j))); 
            }
        
        }         
    /*    
     * trie par poids ascendant    
     */     
        sortList(allEdges);
        // allEdges.sort(Comparator.comparingDouble(Edge::getWeight));
    /*    
     * algorithme de kluskal    
     */   
        int i = 0;
        List<Edge> graphe = new ArrayList<>();
        
        while(graphe.size() < vertices.size()-1){          
             
            Edge edge = allEdges.get(i++);
            int id1 = edge.getU().getClusterId();
            int id2 = edge.getV().getClusterId();
            
             System.out.println("-------int id1 = "+id1);
             System.out.println("-------int id2 = "+id2);
/*    
 *  l'arrete est ajoutée  si le sommet n'appartient pas au meme réseau   
*/       
            if(id1 != id2){
        
                 graphe.add(edge);            
/*    
 *  regroupe les sommets venant d'etre relies  
*/
               for(Vertex v:vertices){        
               
                 if(v.getClusterId() == id2){
                   
                    v.setClusterId(id1);
                 }
               }
                  
            }               
        }
        return graphe;
    }
    
    public static void sortList(ArrayList<Edge> allEdges){ 
     //public  ArrayList<Edge> sortList(ArrayList<Edge> allEdges){ 
    
      Edge temEdge;
      
      for(int i = 0; i < allEdges.size();i++){
            for(int j = i+1; j < allEdges.size();j++){
                
                if(allEdges.get(i).getWeigth() > allEdges.get(j).getWeigth()){
                
                   temEdge = allEdges.get(i);
                   allEdges.set(i,allEdges.get(j));
                   allEdges.set(j,temEdge);                     
                }                
            }
      }
      printGraphe(allEdges);
    }     
 
   
   public static void printGraphe(List<Edge> graphe){
      
          for(int i = 0; i < graphe.size();i++){
            
            System.out.println("----------------------------------------------------");
            System.out.print(i+"     "+graphe.get(i).getU().getX()+"     ");
            System.out.print( graphe.get(i).getV().getY()+"     ");
            System.out.println((Double) graphe.get(i).getWeigth());
          }  
    }
   static class Edge {
    
    private final Vertex u;
    private final Vertex v;
    private final double weight;
   
    Edge(Vertex v1,Vertex v2){
        
        this.u = v1;
        this.v = v2;
        this.weight = Math.hypot(Math.abs(u.getX() - Math.abs(v.getY())), Math.abs(u.getX() - Math.abs(v.getY())));;
        System.out.println("    Edge      this.weight    "+this.weight);
        
        System.out.println();
        System.out.println("    Edge      +this.u.getClusterId()    "+this.u.getClusterId());
        System.out.println("    Edge      +this.v.getClusterId()    "+this.v.getClusterId());
        System.out.println();
    }
    public Vertex getU(){
        
        return this.u;
    }
    public Vertex getV(){
        
        return this.v;
    }
    public Double getWeigth(){
        
        return this.weight;
    }

}

public static void main(String args[]){
       
        List<Vertex> vertices = new ArrayList<>();
        List<Edge> graphe = new ArrayList<>();
        KluskalAlgo   kluskal = new KluskalAlgo(); 
        
        vertices.add(new Vertex(0,2));
        vertices.add(new Vertex(0,0));
        vertices.add(new Vertex(1,1));
        vertices.add(new Vertex(2,1));
        vertices.add(new Vertex(3,2));
        vertices.add(new Vertex(4,2));
        vertices.add(new Vertex(3,0));         
       
        graphe = kluskal.compute(vertices);
 /*
  * impression graphe final
  */ 
        System.out.println("*");
        System.out.println("*------  impression du graphe final  ----------*");
        System.out.println("*");
        System.out.println("i     P1    P2    poids ");        
        kluskal.printGraphe(graphe);
        
        //System.out.println(graphe.stream().mapToDouble(Edge::getWeight).sum()); // 7.656854249492381
               
    }
   
}
