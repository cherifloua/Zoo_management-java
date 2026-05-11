import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();


        societe.ajouterEmploye(new Employe(3, "Ali", "Sami", "Informatique", 2));
        societe.ajouterEmploye(new Employe(1, "Ben", "Amira", "RH", 1));
        societe.ajouterEmploye(new Employe(2, "Trabelsi", "Nour", "Informatique", 1));
        societe.ajouterEmploye(new Employe(4, "Gharbi", "Hedi", "Finance", 3));


        System.out.println("=== Liste des employés ===");
        societe.displayEmploye();


        System.out.println("\nRecherche de 'Ali' : "
                + societe.rechercherEmploye("Ali"));

        // Tri par ID
        societe.trierEmployeParId();
        System.out.println("\n=== Tri par ID ===");
        societe.displayEmploye();


        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\n=== Tri par Département, Grade, Nom ===");
        societe.displayEmploye();


        System.out.println("\n=== Employés du département Informatique ===");
        ArrayList<Employe> resultat =
                societe.rechercherParDepartement("Informatique");

        for (Employe e : resultat) {
            System.out.println(e);
        }
    }
}
