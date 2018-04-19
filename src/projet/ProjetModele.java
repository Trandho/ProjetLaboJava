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
            return "pilote nul";
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

    public String ajoutPiloteCourse(int numP, int numC) {
        String msg = mesCourse.get(numC).ajoutParticipant(mesPilote.get(numP));
        return msg;
    }

    public Pilote getPilote(Pilote p) {
        int i = mesPilote.indexOf(p);
        if (i < 0) {
            return null;
        } else {
            return mesPilote.get(i);
        }
    }

    public Course getCourse(int o) {
        Course c = new Course(o);
        int i = mesCourse.indexOf(c);
        if (i < 0) {
            return null;
        } else {
            return mesCourse.get(i);
        }
    }

    public void populate() {
        mesPilote.addAll(Arrays.asList(
                new Pilote("test1Nom", "Test1Prenom", "Test1Nation", "Test1License"),
                new Pilote("test2Nom", "Test2Prenom", "Test2Nation", "Test2License"),
                new Pilote("test3Nom", "Test3Prenom", "Test3Nation", "Test3License"))
        );
        mesCourse.addAll(Arrays.asList(
                new Course("ville1", "Pays1", 11, 1),
                new Course("ville2", "Pays2", 12, 2),
                new Course("ville3", "Pays3", 11, 3))
        );
        mesCourse.get(0).setParticipant(mesPilote);

    }

}
