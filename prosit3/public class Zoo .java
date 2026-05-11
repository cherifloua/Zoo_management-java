public class Zoo {

    private Animal[] animals;
    private int nbrAnimals;
    public static final int NBR_CAGES = 25;

    public Zoo() {
        animals = new Animal[NBR_CAGES];
        nbrAnimals = 0;
    }

 
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            return false;
        }

        if (searchAnimal(animal.getName()) != -1) {
            return false; // unicité
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        if (nbrAnimals == 0) {
            System.out.println("Le zoo est vide.");
            return;
        }

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(String name) {
        int index = searchAnimal(name);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

   
    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.nbrAnimals > z2.nbrAnimals) ? z1 : z2;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }
}
