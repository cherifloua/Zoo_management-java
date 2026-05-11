public class ZooManagement {

    public static void main(String[] args) {

        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();

        Animal lion = new Animal("Lion", "Felins", 5, true);
        Animal tiger = new Animal("Tigre", "Felins", 4, true);
        Animal eagle = new Animal("Aigle", "Oiseaux", 3, false);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(lion);

        zoo1.displayAnimals();

        System.out.println(zoo1.searchAnimal("Tigre"));
        System.out.println(zoo1.searchAnimal("Loup"));

        zoo1.removeAnimal("Lion");
        zoo1.displayAnimals();

        zoo2.addAnimal(eagle);

        Zoo biggerZoo = Zoo.compareZoo(zoo1, zoo2);
        System.out.println(biggerZoo.getNbrAnimals());
    }
}
