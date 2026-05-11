

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employe, Departement> affectations;


    public AffectationHashMap() {
        affectations = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            System.out.println("Employé ajouté avec succès.");
        } else {
            System.out.println("Cet employé est déjà affecté à un département.");
        }
    }


    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation.");
        } else {
            for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
                System.out.println(
                        entry.getKey() + " ---> " + entry.getValue()
                );
            }
        }
    }


    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("Employé supprimé.");
        } else {
            System.out.println("Employé introuvable.");
        }
    }


    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Affectation supprimée.");
        } else {
            System.out.println("Affectation non trouvée.");
        }
    }


    public void afficherEmployes() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé.");
        } else {
            for (Employe e : affectations.keySet()) {
                System.out.println(e);
            }
        }
    }


    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun département.");
        } else {
            for (Departement d : affectations.values()) {
                System.out.println(d);
            }
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }


    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>();
        treeMap.putAll(affectations);
        return treeMap;
    }
}