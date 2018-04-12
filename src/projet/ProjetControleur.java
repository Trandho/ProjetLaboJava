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
public class ProjetControleur {
    ProjetModele pm=null;
    ProjetVue pv=null;
    
    public ProjetControleur(){
        
    }
    public ProjetControleur(ProjetModele pm,ProjetVue pv){
        this.pm=pm;
        this.pv=pv;
    }
}
