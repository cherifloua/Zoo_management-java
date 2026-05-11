

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // Création employés
        Employe e1 = new Employe(1, "Ali", "Ahmed");
        Employe e2 = new Employe(2, "Sami", "Karim");
        Employe e3 = new Employe(3, "Nour", "Salma");

        // Création départements
        Departement d1 = new Departement(101, "Informatique");
        Departement d2 = new Departement(102, "RH");
        Departement d3 = new Departement(103, "Finance");

        // Objet Affectation
        AffectationHashMap ahm = new AffectationHashMap();

        // Ajout des affectations
        ahm.ajouterEmployeDepartement(e1, d1);
        ahm.ajouterEmployeDepartement(e2, d2);
        ahm.ajouterEmployeDepartement(e3, d3);

        // Tentative de double affectation
        ahm.ajouterEmployeDepartement(e1, d2);

        System.out.println("\n--- Affichage complet ---");
        ahm.afficherEmployesEtDepartements();

        System.out.println("\n--- Liste des employés ---");
        ahm.afficherEmployes();

        System.out.println("\n--- Liste des départements ---");
        ahm.afficherDepartements();

        System.out.println("\n--- Recherche employé ---");
        System.out.println(ahm.rechercherEmploye(e2));

        System.out.println("\n--- Recherche département ---");
        System.out.println(ahm.rechercherDepartement(d1));

        System.out.println("\n--- Suppression affectation précise ---");
        ahm.supprimerEmployeEtDepartement(e2, d2);

        System.out.println("\n--- Après suppression ---");
        ahm.afficherEmployesEtDepartements();

        System.out.println("\n--- Tri avec TreeMap ---");
        TreeMap<Employe, Departement> mapTriee = ahm.trierMap();

        for (Map.Entry<Employe, Departement> entry : mapTriee.entrySet()) {
            System.out.println(
                    entry.getKey() + " ---> " + entry.getValue()
            );
        }
    }
}