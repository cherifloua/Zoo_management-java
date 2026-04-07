public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(3); // comme demandé dans l'énoncé

        // Test 1 : animal valide
        try {
            zoo.addAnimal(new Animal("Lion", 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + zoo.getNbAnimaux());

        // Test 2 : âge invalide
        try {
            zoo.addAnimal(new Animal("Tigre", -2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + zoo.getNbAnimaux());

        // Test 3 : remplissage du zoo
        try {
            zoo.addAnimal(new Animal("Elephant", 10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + zoo.getNbAnimaux());

        try {
            zoo.addAnimal(new Animal("Girafe", 7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + zoo.getNbAnimaux());

        // Test 4 : dépassement capacité
        try {
            zoo.addAnimal(new Animal("Zèbre", 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + zoo.getNbAnimaux());
    }
}