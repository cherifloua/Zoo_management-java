public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal snake = new Animal("Reptile", "Snake", 2, false);
        Zoo myZoo = new Zoo("ESPRIT Zoo", "Tunis", 20);
        myZoo.displayZoo();

        System.out.println("---------------");
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(snake);
    }
}

