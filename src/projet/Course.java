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
public class Course {

    protected String ville, pays;
    protected double km;
    protected int ordre;
    protected List<Pilote> participant = new ArrayList<>();

    public Course() {

    }

    public Course(String ville, String pays, double km, int ordre) {
        this.ville = ville;
        this.pays = pays;
        this.km = km;
        this.ordre = ordre;
    }
    public Course(int ordre){
        this.ordre=ordre;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public double getKm() {
        return km;
    }

    public int getOrdre() {
        return ordre;
    }

    public List<Pilote> getParticipant() {
        return participant;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public void setParticipant(List<Pilote> participant) {
        this.participant = participant;
    }
    public String ajoutParticipant(Pilote p){
         if (p == null) {
            return "pilote nul";
        }
        if (participant.contains(p)) {
            return "pilote deja enregistre";
        }
        participant.add(p);
        return "ajout pilote effectue";
    }

    @Override
    public String toString() {
        return "Course" + ordre + "se déroule à " + ville + " en " + pays + " avec une taille de " + km + " les participant sont" + participant;
    }

}
