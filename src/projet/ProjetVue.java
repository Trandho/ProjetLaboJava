/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author Trando
 */
public class ProjetVue {
    
    public ProjetVue(){
        
    }
    
    public void affPilote(Pilote p){
        affMsg("nom : "+p.getNom());
        affMsg("prenom : "+p.getPrenom());
        affMsg("Nation : "+p.getNation());
        affMsg("License : "+p.getLicense());
    }
    public void affCourse(Course c){
        affMsg("Ville : "+c.getVille());
        affMsg("Pays : "+c.getPays());
        affMsg("ordre : "+c.getOrdre());
        affMsg("km : "+c.getKm());
        affMsg("liste pilote : "+c.getKm());
        
    }
    
    public void affMsg(Object msg) {
        System.out.println(msg);
    }
}
