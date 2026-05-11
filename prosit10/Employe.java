

public class Employe implements Comparable<Employe> {

    private int id;
    private String nom;
    private String prenom;

    // Constructeur
    public Employe(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // toString
    @Override
    public String toString() {
        return "Employe{id=" + id + ", nom='" + nom + "', prenom='" + prenom + "'}";
    }

    // equals + hashCode pour HashMap
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;

        Employe e = (Employe) obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    // Comparable pour TreeMap (tri par id)
    @Override
    public int compareTo(Employe e) {
        return Integer.compare(this.id, e.id);
    }
}