public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    // Constructeur par défaut
    public Employe() {}

    // Constructeur paramétré
    public Employe(int id, String nom, String prenom,
                   String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getNomDepartement() { return nomDepartement; }
    public int getGrade() { return grade; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public void setGrade(int grade) { this.grade = grade; }

    // Tri naturel par ID
    @Override
    public int compareTo(Employe e) {
        return this.id - e.id;
    }

    // Affichage
    @Override
    public String toString() {
        return id + " | " + nom + " " + prenom +
                " | " + nomDepartement + " | Grade: " + grade;
    }
}