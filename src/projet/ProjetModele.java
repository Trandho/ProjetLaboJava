/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.*;

/**
 *
 * @author Trando
 */
public class ProjetModele {

    protected List<Pilote> mesPilote = new ArrayList<>();
    protected List<Course> mesCourse = new ArrayList<>();

    public ProjetModele() {

    }

    public String ajouterPilote(Pilote p) {
        if (p == null) {
            return "client nul";
        }
        if (mesPilote.contains(p)) {
            return "pilote deja enregistre";
        }
        mesPilote.add(p);
        return "ajout pilote effectue";
    }

    public String ajouterCourse(Course c) {
        if (c == null) {
            return "course nul";
        }
        if (mesCourse.contains(c)) {
            return "Course déjà enregistrée";
        }
        mesCourse.add(c);
        return "ajout Course effectuée";
    }

    public List<Pilote> toutPilote() {
        return mesPilote;
    }

    public List<Course> toutCourse() {
        //TODO Ajouter un tri pour renvoyer les courses triées par leur numéro d'ordre
        return mesCourse;
    }
}
