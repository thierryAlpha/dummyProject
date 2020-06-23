/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.bibliotheque;

/**
 *
 * 
 * @author L512
 */
class Edge {
    
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
