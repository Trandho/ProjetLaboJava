/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Trando
 */
public class ProjetControleur {

    ProjetModele pm = null;
    ProjetVue pv = null;

    public ProjetControleur() {

    }

    public ProjetControleur(ProjetModele pm, ProjetVue pv) {
        this.pm = pm;
        this.pv = pv;
    }

    public void choix() {
        int nbr;
        do {
            nbr = pv.menu();
            switch (nbr) {
                case 1:
                    ajoutPilote();
                    break;
                case 2:
                    ajoutCourse();
                    break;
                case 3:
                    ajoutPiloteCourse();
                    break;
                case 4:
                    recherchePilote();
                    break;
                case 5:
                    rechercheCourse();
                    break;
                case 6:
                    affListePilote();
                    break;
                case 7:
                    AffListeCourse();
                    break;
                case 8:
                    pv.affMsg("Fin");
                    break;
            }
        } while (nbr < 8);

    }

    public void ajoutPilote() {
        Pilote p = pv.encodePilote();
        String msg = pm.ajouterPilote(p);
        pv.affMsg(msg);

    }

    public void ajoutCourse() {
        Course c = pv.encodeCourse();
        String msg = pm.ajouterCourse(c);
        pv.affMsg(msg);
    }

    public void ajoutPiloteCourse() {
        Scanner sc = new Scanner(System.in);
        List<Pilote> piloteTemp = new ArrayList<>();
        List<Course> courseTemp = new ArrayList<>();
        piloteTemp = pm.toutPilote();
        courseTemp = pm.toutCourse();
        pv.affListe(courseTemp);
        System.out.println("Choississez la course où ajouter le pilote");
        int numC = sc.nextInt();
        System.out.println("Choississez le pilote à ajouter");
        int numP = sc.nextInt();
        pv.affListe(piloteTemp);
        String msg = pm.ajoutPiloteCourse(numP, numC);
        pv.affMsg(msg);
    }

    public void affListePilote() {
        List<Pilote> piloteTemp = new ArrayList<>();
        piloteTemp = pm.toutPilote();
        pv.affListe(piloteTemp);

    }

    public void AffListeCourse() {
        List<Course> courseTemp = new ArrayList<>();
        courseTemp = pm.toutCourse();
        pv.affListe(courseTemp);

    }

    public void recherchePilote() {
        Pilote p = pv.rechPilote();
        if(pm.getPilote(p)==null){
            pv.affMsg("Pilote non trouvé");
        }
        else{
        pv.affMsg(pm.getPilote(p));
        }
    }
    public void rechercheCourse(){
        int ordre = pv.rechCourse();
        if(pm.getCourse(ordre)==null){
            pv.affMsg("Course non trouvée");
        }
        else{
        pv.affMsg(pm.getCourse(ordre));
        }
    }
}


