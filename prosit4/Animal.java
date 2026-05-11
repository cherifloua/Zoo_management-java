package tn.esprit.tests;

import tn.esprit.entities.Animal;
import tn.esprit.management.Zoo;

public class ZooManagement {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("My Zoo");

        Animal a1 = new Animal(5, "Felin", "Lion", true);

        zoo.addAnimal(a1);
    }
}