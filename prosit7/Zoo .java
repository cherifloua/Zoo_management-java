public class Zoo {
    private Animal[] animaux;
    private int nbAnimaux;
    private int capaciteMax;

    public Zoo(int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.animaux = new Animal[capaciteMax];
        this.nbAnimaux = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide !");
        }

        if (nbAnimaux >= capaciteMax) {
            throw new ZooFullException("Le zoo est plein !");
        }

        animaux[nbAnimaux] = animal;
        nbAnimaux++;
    }

    public int getNbAnimaux() {
        return nbAnimaux;
    }
}