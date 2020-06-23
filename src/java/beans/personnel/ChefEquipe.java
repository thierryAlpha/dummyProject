/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.personnel;

/**
 *
 * @author L512
 */
public class ChefEquipe extends Travailleur {

    public ChefEquipe() {
    }

    @Override
    public String toString() {
        return "ChefEquipe{" + '}';
    }
    
    private String chefEquipeId;

    /**
     * Get the value of chefEquipeId
     *
     * @return the value of chefEquipeId
     */
    public String getChefEquipeId() {
        return chefEquipeId;
    }

    /**
     * Set the value of chefEquipeId
     *
     * @param chefEquipeId new value of chefEquipeId
     */
    public void setChefEquipeId(String chefEquipeId) {
        this.chefEquipeId = chefEquipeId;
    }

   
       
}
