

public class Departement {

    private int idDep;
    private String nomDep;


    public Departement(int idDep, String nomDep) {
        this.idDep = idDep;
        this.nomDep = nomDep;
    }


    public int getIdDep() {
        return idDep;
    }

    public String getNomDep() {
        return nomDep;
    }


    @Override
    public String toString() {
        return "Departement{id=" + idDep + ", nom='" + nomDep + "'}";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;

        Departement d = (Departement) obj;
        return this.idDep == d.idDep;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(idDep);
    }
}