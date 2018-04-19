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
public class Pilote {

    protected String nom, prenom, nation, license;

    /**
     * Constructeur par défaut
     */
    public Pilote() {

    }
    /**
     * Constructeur avec paramètres
     * @param nom nom du pilote
     * @param prenom prenom du pilote
     * @param nation nation du pilote
     * @param license license du pilote
     */
    public Pilote(String nom, String prenom, String nation, String license) {
        this.nom = nom;
        this.license = license;
        this.nation = nation;
        this.prenom = prenom;
    }
    /**
     * Méthode renvoyant le nom du pilote
     * @return nom du pilote
     */
    public String getNom() {
        return nom;
    }
    /**
     * méthode renvoyant le prenom du pilote
     * @return prenom du pilote
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * méthode renvoyant la nation du pilote
     * @return nation du pilote
     */
    public String getNation() {
        return nation;
    }
    /**
     * méthode renvoyant la license du pilote
     * @return license du pilote
     */
    public String getLicense() {
        return license;
    }
    /**
     * méthode permettant de changer le nom
     * @param nom nouveau nom du pilote
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * méthode permettant de changer le prenom du pilote
     * @param prenom nouveau prenom du pilote
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    /**
     * méthode permettant de changer la nation du pilote
     * @param nation nouvelle nation du pilote
     */
    public void setNation(String nation) {
        this.nation = nation;
    }
    /**
     * méthode permettant de changer de changer la license du pilote
     * @param license nouvelle license du pilote
     */
    public void setLicense(String license) {
        this.license = license;
    }
    /**
     * méthode toString de l'objet pilote
     * @return une chaine avec toutes les info du pilotes
     */
    @Override //TODO faire une meilleur toString
    public String toString() {
        return "nom = " + nom + ", prenom = " + prenom + ", nation = " + nation + ", license = " + license;
    }

}
