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
public class ProjetMVC {

    private ProjetVue pv;
    private ProjetControleur pc;
    private ProjetModele pm;

    public ProjetMVC() {

        pv = new ProjetVue();
        pm = new ProjetModele();
        pc = new ProjetControleur(pm, pv);
    }

    public static void main(String[] args) {
        ProjetMVC gmvc = new ProjetMVC();
    }
}
