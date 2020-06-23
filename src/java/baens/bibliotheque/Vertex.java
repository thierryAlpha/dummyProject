/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baens.bibliotheque;

/**
 *
 * @author L512
 **/

class Vertex {
    
  static int NEX_ID = 0;
  private final int x;
  private final int y;
  
  private int clusterId = NEX_ID++;
  
   int getY(){
   
      return this.y;
   }
   int getX(){
   
      return this.x;
   }
   int getClusterId(){
   
      return this.clusterId;
   }
   void setClusterId(int id){
   
      this.clusterId = id;
   }
  Vertex(int _x,int _y){
   this.x = _x;
   this.y = _y;
  }
}
