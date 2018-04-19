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
    /**
     * Constructeur par défaut
     */
    public Course() {

    }
    /**
     * Constructeur par défaut avec paramètres
     * @param ville ville ou se déroule la course
     * @param pays pays ou se déroule la course
     * @param km taille du circuit en km
     * @param ordre numéro d'ordre de la course
     */
    public Course(String ville, String pays, double km, int ordre) {
        this.ville = ville;
        this.pays = pays;
        this.km = km;
        this.ordre = ordre;
    }
    /**
     * constructeur avec pour seul parametre l'odre pour la recherche
     * @param ordre ordre de la course recherchée
     */
    public Course(int ordre){
        this.ordre=ordre;
    }
    /**
     * Méthode renvoyant la ville de la course
     * @return la ville de la course
     */
    public String getVille() {
        return ville;
    }
    /**
     * Méthode ranvoyant le pays de la course
     * @return nom du pays de la course
     */
    public String getPays() {
        return pays;
    }
    /**
     * Méthode renvoyant la taille de la course
     * @return taille de la course 
     */
    public double getKm() {
        return km;
    }
    /**
     * méthode renvoyant le numéro d'odre de la course
     * @return ordre de la course
     */
    public int getOrdre() {
        return ordre;
    }
    /**
     * Méthode renvoyant la liste des participants
     * @return une liste de pilote participant à la course
     */
    public List<Pilote> getParticipant() {
        return participant;
    }
    /**
     * Méthode changeant la ville de la course
     * @param ville Nouvelle ville ou se déroule la course
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
    /**
     * Méthode changeant le pays de la course
     * @param pays Nouveaux pays ou se déroule la course
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
    /**
     * Méthode changeant la taille du circuit 
     * @param km taille du circuit en km
     */
    public void setKm(double km) {
        this.km = km;
    }
    /**
     * Méthode changeant le numéro d'ordre de la course
     * @param ordre nouvelle ordre de la course 
     */
    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }
    /**
     * Méthode changeant la liste des participants
     * @param participant Nouvelle liste des participants
     */
    public void setParticipant(List<Pilote> participant) {
        this.participant = participant;
    }
    /**
     * Méthode ajoutant un participant à la liste des participant de la course
     * @param p un pilote qui sera ajouté à la liste des participant
     * @return une chaine indiquant la réussite ou non de l'ajout
     */
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
    /**
     * Méthode toString de l'objet Course
     * @return 
     */
    @Override
    public String toString() {
        return "Course" + ordre + "se déroule à " + ville + " en " + pays + " avec une taille de " + km + " les participant sont" + participant;
    }

}
