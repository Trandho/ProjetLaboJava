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

    public Pilote() {

    }

    public Pilote(String nom, String prenom, String nation, String license) {
        this.nom = nom;
        this.license = license;
        this.nation = nation;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNation() {
        return nation;
    }

    public String getLicense() {
        return license;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "nom = " + nom + ", prenom = " + prenom + ", nation = " + nation + ", license = " + license;
    }

}
