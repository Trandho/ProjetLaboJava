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
public class ProjetVue {

    private Scanner sc = new Scanner(System.in);

    public ProjetVue() {

    }

    public int menu() {
        System.out.flush();
        List<String> listeMenu = new ArrayList<>(Arrays.asList(
                "ajouter Pilote",
                "ajouter Course",
                "Ajouter les pilotes d'une course",
                "Recherche d'un Pilote",
                "Recherche d'une Course",
                "Affichage complète de la liste des pilotes",
                "Affichage complète de la liste des courses",
                "fin"));
        affListe(listeMenu);

        int nbr;
        do {
            String ch = getMsg("votre choix");
            nbr = Integer.parseInt(ch);
            if (nbr > 0 && nbr <= listeMenu.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return nbr;
    }

    public void affPilote(Pilote p) {
        affMsg("nom : " + p.getNom());
        affMsg("prenom : " + p.getPrenom());
        affMsg("Nation : " + p.getNation());
        affMsg("License : " + p.getLicense());
    }

    public void affCourse(Course c) {
        affMsg("Ville : " + c.getVille());
        affMsg("Pays : " + c.getPays());
        affMsg("ordre : " + c.getOrdre());
        affMsg("km : " + c.getKm());
        affMsg("liste pilote : " + c.getKm());

    }

    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }

    public String getMsg() {
        String msg = sc.nextLine();
        sc.next();
        return msg;
    }

    public Pilote encodePilote() {

        String nom = getMsg("Nom du pilote : ");
        String prenom = getMsg("Prenom du pilote : ");
        String nation = getMsg("Nation du pilote :");
        String license = getMsg("License du pilote :");
        Pilote p = new Pilote(nom, prenom, nation, license);
        return p;
    }

    public Course encodeCourse() {

        String ville = getMsg("Ville ou se déroule la course: ");
        String pays = getMsg("Pays ou se déroule la course: ");
        affMsg("Taille du circuit : ");
        double km = sc.nextDouble();
        sc.next();
        affMsg("Numéro d'ordre de la course dans le tournoi");
        int ordre = sc.nextInt();
        sc.next();
        Course c = new Course(ville, pays, km, ordre);
        return c;
    }

    public void affListe(Collection liste) {
        int i = 1;
        for (Object o : liste) {
            affMsg((i++) + "." + o);
        }
    }

    public Pilote rechPilote() {
        String nom = getMsg("nom :");
        String prenom = getMsg("prenom :");
        String license = getMsg("license :");
        String nation = getMsg("Nation : ");
        return new Pilote(nom, prenom, nation, license);
    }

    public int rechCourse() {
        int ordre;
        affMsg("numero d'ordre de la course :");
        sc.next();
        ordre = sc.nextInt();
        return ordre;
    }
}
